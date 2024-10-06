package com.kpn.napels.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.ServiceNummerScreenDTO;
import com.kpn.napels.dto.ServiceNummerSearchDTO;
import com.kpn.napels.entity.NumServiceNummerEntity;




import com.kpn.napels.exceptions.DAOException;
import com.kpn.napels.service.ServiceNumDetailService;

import com.kpn.napels.service.ServiceNumDetailService;




import com.kpn.napels.service.ServiceNumService;

@RestController
@RequestMapping("/napels-numbes/servicenum")
public class NummerServiceNummerController {

	private static final Logger LOG = LoggerFactory.getLogger(NummerServiceNummerController.class);
	
	
	
	@Autowired
	ServiceNumService serviceNumService = null;
	
	@Autowired
	ServiceNumDetailService serviceNumDetail;
	
	@RequestMapping("/zoeken")
	public ResponseEntity<Page<NumServiceNummerEntity>> getServiceNummerList(
			
			@RequestParam(value ="serviceNumLow", required = false) String serviceNumLow,
			@RequestParam(value = "serviceNumHigh", required = false) String serviceNumHigh,
			@RequestParam(value ="mutatieVan", required = false) String mutatieVan,
			@RequestParam(value ="mutatieTm", required = false) String mutatieTm,
			@PageableDefault(size = 50) Pageable page
			){
		
		LOG.info("Request Received getServiceNummerList");
		Page<NumServiceNummerEntity> serviceNummerList = null;
		
		ServiceNummerSearchDTO serviceNumSearchDto = new ServiceNummerSearchDTO();
		
		try {
			if(!Utils.isNullOrEmpty(serviceNumLow)) {
				serviceNumSearchDto.setServiceNumLow(serviceNumLow);
			}
			if(!Utils.isNullOrEmpty(serviceNumHigh)) {
				serviceNumSearchDto.setServiceNumHigh(serviceNumHigh);
			}
			if(!Utils.isNullOrEmpty(mutatieVan)) {
				serviceNumSearchDto.setMutatieVan(mutatieVan);
			}
			if(!Utils.isNullOrEmpty(mutatieTm)) {
				serviceNumSearchDto.setMutatieTm(mutatieTm);
			}
			serviceNummerList = serviceNumService.getServiceNumList(serviceNumSearchDto, page);

			return new ResponseEntity<Page<NumServiceNummerEntity>>(serviceNummerList,HttpStatus.OK);
			
		
		/*
			 * catch(DAOException daoe) { LOG.error(daoe.getMessage()); return new
			 * ResponseEntity<List<NumServiceNummerEntity>>(HttpStatus.INTERNAL_SERVER_ERROR
			 * ); }
			 */

		} 

		catch(Exception e) {
		LOG.error("Exception Occured  :" + e.getMessage());
		return new ResponseEntity<Page<NumServiceNummerEntity>>(serviceNummerList,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
	
	@RequestMapping(value="/servicenumdetails/{numLaag}",method=RequestMethod.GET)
	public ResponseEntity<ServiceNummerScreenDTO> processServiceNumDetailReq(@PathVariable("numLaag") String numLaag) {
	LOG.info("<--------- Request received for Number History Details Screen ----->");	
	
	ServiceNummerScreenDTO response=new ServiceNummerScreenDTO();
	if(Utils.isNullOrEmpty(numLaag)) {
		String LogMessage = String.format("NumberLow value is invalid {%s}", numLaag);
		LOG.info(LogMessage);
     	return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);         	
    }	
	
	try {
		
		response=serviceNumDetail.searchByNumLow(numLaag);
		LOG.info("Sending success response as:"+response);
		
	}catch(Exception ex) {
		LOG.info("Exception occured:"+ex.getMessage());
		return new ResponseEntity<ServiceNummerScreenDTO>(response, HttpStatus.NOT_FOUND);
	}
	return new ResponseEntity<ServiceNummerScreenDTO>(response,HttpStatus.OK);
	}	
	
	
}
