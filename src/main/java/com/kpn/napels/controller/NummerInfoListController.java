package com.kpn.napels.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.Trimspec;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.NumberDetailHistoryDTO;
import com.kpn.napels.dto.NummerDetailsScreenDTO;
import com.kpn.napels.dto.NummerHistoryResponseDTO;
import com.kpn.napels.entity.NumAangeslotenEntity;
import com.kpn.napels.exceptions.ResourceNotFound;
import com.kpn.napels.service.NumAangeslotenService;
import com.kpn.napels.service.NumHistoryDetails;
import com.kpn.napels.service.NumberDetailService;

@RestController
@RequestMapping("/napels-numbes/nummerinfo")
public class NummerInfoListController {
	
	private static final Logger LOG = LoggerFactory.getLogger(NummerInfoListController.class);
	
	@Autowired
	final EntityManager em = null;
	
	@Autowired
	private NumAangeslotenService numAangeslotenService;
	
	@Autowired
	private NumberDetailService numberDetailService;
	
	@Autowired
	NumHistoryDetails numHistoryDetails;
	
	String LogMessage="";
	
	@RequestMapping(value="/zoeken", method = RequestMethod.GET)
	public ResponseEntity <Page<NumAangeslotenEntity>> searchList(@PageableDefault(size = 50) Pageable pageable,
			@RequestParam(value="nrlow", required = false) String nrlow,
			@RequestParam(value = "nrhigh", required = false) String nrhigh,
			@RequestParam(value="roepnr", required = false) String roepnr){
		
		Page<NumAangeslotenEntity> page = null;
		try {
			// NO Parameters entered
			if(Utils.isNullOrEmpty(nrlow) && Utils.isNullOrEmpty(nrhigh) && Utils.isNullOrEmpty(roepnr)) {
				
				LOG.info(MDC.get("mdcData")+"Search all");
				page = numAangeslotenService.findAll(pageable);	
				if(page.getNumberOfElements()==0) {
					throw new ResourceNotFound("Data Not Found");
				}
			}else if (!Utils.isNullOrEmpty(nrlow) && !Utils.isNullOrEmpty(nrhigh)) {
				LOG.info(MDC.get("mdcData")+"NumberLow and NumberHigh is entered");
				page = numAangeslotenService.findByAnrNummerLowAndAnrNummerHoog(pageable,nrlow,nrhigh);
			}
			//when  only nummerlow is entered
			else if(!Utils.isNullOrEmpty(nrlow) && Utils.isNullOrEmpty(nrhigh) && Utils.isNullOrEmpty(roepnr) ) {
				
				LOG.info(MDC.get("mdcData")+"Search by NumberLow --->" +nrlow);
				page = numAangeslotenService.findByAnrNummerLow(pageable, nrlow);
				
				if(page.getNumberOfElements()==0) {
					throw new ResourceNotFound("Data Not Found with NummerLow -->" +nrlow);
				}
			
			}
			//when roep nummer is entered
			else if(Utils.isNullOrEmpty(nrlow) && Utils.isNullOrEmpty(nrhigh) && !Utils.isNullOrEmpty(roepnr) ) {
				
				LOG.info(MDC.get("mdcData")+"Search by RoepNummer --->" +roepnr);
				page = numAangeslotenService.findByAnrRoepnummer(pageable, roepnr);
				
				if(page.getNumberOfElements()==0) {
					throw new ResourceNotFound("Data Not Found with RoepNummer  -->" +roepnr);
				}
			
			}
			return new ResponseEntity<Page<NumAangeslotenEntity>>(page,HttpStatus.OK);
		}
		catch(ResourceNotFound rnf){
			
		LOG.error("ResourceNotFound Exception Occured -->" + rnf.getMessage());
		return new ResponseEntity<Page<NumAangeslotenEntity>>(page,HttpStatus.NOT_FOUND);
			
		}
}

	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ResponseEntity <Page<NumAangeslotenEntity>> searchByParam(
			@RequestParam(value="nrlow", required = false) String nrlow,
			@RequestParam(value = "nrhigh", required = false) String nrhigh,
			@RequestParam(value="roepnr", required = false) String roepnr,
			@PageableDefault(size = 50) Pageable page
			){
		LOG.info("Nummer Information list search");
		Page<NumAangeslotenEntity> pageData = null;
		
		CriteriaBuilder cb;
		CriteriaQuery<NumAangeslotenEntity> cq;
		Root<NumAangeslotenEntity> root;
		
		cb = this.em.getCriteriaBuilder();
		cq = cb.createQuery(NumAangeslotenEntity.class);
		root = cq.from(NumAangeslotenEntity.class);
		
		Predicate condition = null;
		List<Predicate> predicates = new ArrayList<Predicate>();
		
		
		
		Trimspec ts=null;
		
		try {
		// If Number low and number high entered
		if(!Utils.isNullOrEmpty(nrlow) && !Utils.isNullOrEmpty(nrhigh)) {
			
			LOG.info(MDC.get("mdcData")+"nummer low and number high is entered" + nrlow + "/" + nrhigh );
				Expression<String> numLow = cb.trim(ts.TRAILING,root.get("anrNummerLow"));
				condition = cb.equal(numLow, nrlow);
				predicates.add(condition);
				
				Expression<String> numHigh = cb.trim(ts.TRAILING, root.get("anrNummerHoog"));
				condition = cb.equal(numHigh, nrhigh );
				predicates.add(condition);
		}
		// if number low is entered
		else if (!Utils.isNullOrEmpty(nrlow)) {
			Expression<String> numLow = cb.trim	(ts.BOTH,root.get("anrNummerLow"));
			condition = cb.equal(numLow, nrlow);
			predicates.add(condition);
			}
		
		//if number high is entered
		else if (!Utils.isNullOrEmpty(nrhigh)) {
			Expression<String> numHigh = cb.trim(ts.BOTH,root.get("anrNummerHoog"));
			condition = cb.equal(numHigh, nrhigh);
			predicates.add(condition);
			}
		
		//if roep number is entered
		else if (!Utils.isNullOrEmpty(roepnr)) {
			Expression<String> roepnummer = cb.trim(ts.BOTH, root.get("anrRoepnummer"));
			condition = cb.equal(roepnummer, roepnr);
			predicates.add(condition);
			}
		
		Predicate[] predArray = new Predicate[predicates.size()];
		predicates.toArray(predArray);
		cq.where(predArray);
		TypedQuery<NumAangeslotenEntity> query = em.createQuery(cq);
		int totalRows = query.getResultList().size();
		query.setFirstResult(page.getPageNumber() * page.getPageSize());
		query.setMaxResults(page.getPageSize());
		LOG.info(MDC.get("mdcData")+"page size : " + page.getPageSize());
		pageData= new PageImpl<NumAangeslotenEntity>(query.getResultList(), page, totalRows);
	}
		
		catch(Exception e) {
			LOG.info(MDC.get("mdcData")+"No Data Found");
			return new ResponseEntity<Page<NumAangeslotenEntity>>(pageData,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Page<NumAangeslotenEntity>>(pageData,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/numberdetails/{numberLaag}", method = RequestMethod.GET)
	public ResponseEntity<NummerDetailsScreenDTO> processRequest(@PathVariable("numberLaag") String numberLaag) {
		LOG.info(MDC.get("mdcData")+"<--------- Request received for Number Details Screen ----->");
		NummerDetailsScreenDTO response = new NummerDetailsScreenDTO();

		if (Utils.isNullOrEmpty(numberLaag)) {
			LogMessage = String.format("NumberLow value is invalid {%s}", numberLaag);
			LOG.info(MDC.get("mdcData")+LogMessage);
			return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);
		}

		try {
			response = numberDetailService.searchByNumLow(numberLaag);
			LOG.info(MDC.get("mdcData")+"Sending success response as:" + response);
		} catch (Exception ex) {
			LOG.info(MDC.get("mdcData")+"Exception occured:" + ex.getMessage());
			return new ResponseEntity<NummerDetailsScreenDTO>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<NummerDetailsScreenDTO>(response, HttpStatus.OK);
	}	
	
	@RequestMapping(value="/numhistorydetails",method=RequestMethod.POST)
    public ResponseEntity<NummerHistoryResponseDTO> processNumHistoryReq(@RequestBody NumberDetailHistoryDTO numberDetailHistoryDTO) {
           LOG.info(MDC.get("mdcData")+"<--------- Request received for Number History Details Screen ----->");       

           NummerHistoryResponseDTO response=new NummerHistoryResponseDTO();
           if(Utils.isEmptyOrNull(numberDetailHistoryDTO)) {
        	      LogMessage = String.format("Invalid request{%s}", numberDetailHistoryDTO);
                  LOG.info(MDC.get("mdcData")+LogMessage);
                  return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);   
           }

           try {
                  response=numHistoryDetails.serachHistoryByNumLow(numberDetailHistoryDTO);
                  LOG.info(MDC.get("mdcData")+"Sending success response as:"+response);

           }catch(Exception ex) {
                  LOG.info(MDC.get("mdcData")+"Exception occured:"+ex.getMessage());
                  return new ResponseEntity<NummerHistoryResponseDTO>(response, HttpStatus.NOT_FOUND);
           }
           return new ResponseEntity<NummerHistoryResponseDTO>(response,HttpStatus.OK);
    }      

	
	
}