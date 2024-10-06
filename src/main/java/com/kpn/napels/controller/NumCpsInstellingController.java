package com.kpn.napels.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.kpn.napels.common.Utils;
import com.kpn.napels.entity.NumCpsInstellingEntity;
import com.kpn.napels.service.NumCpsInstellingService;


@CrossOrigin
@RestController
@RequestMapping("/napels-numbes/cpsinstelling")

public class NumCpsInstellingController {	
	private static final Logger LOG = LoggerFactory.getLogger(NumCpsInstellingController.class);

	@Autowired
	NumCpsInstellingService numCpsInstellingService;
	Page<NumCpsInstellingEntity> entityList=null;
	String LogMessage="";
	
	//@ApiOperation(value = "Get all data for cps instelling")
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public Page<NumCpsInstellingEntity> findByAll(@PageableDefault(size = 50)@SortDefault(direction = Direction.DESC)Pageable pageable){
	    LOG.info("<--- NumCpsInstellingController request from findby All ----->");
	    return numCpsInstellingService.getPage(pageable);
	}
	
	//@ApiOperation(value = "Get all data for specific number")	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/zoek", method = RequestMethod.GET)
	public ResponseEntity<Page<NumCpsInstellingEntity>> findByNumberlowAndNumberhigh(
								@PageableDefault(size = 50)
								@SortDefault(direction = Direction.DESC)Pageable pageable,
								@RequestParam(value="numberlow",required = false) String numberlow,
								@RequestParam(value="numberhigh",required = false) String numberhigh){
		
		LOG.info("<--- NumCpsInstellingController request from findByNumberlowAndNumberhigh ----->");
		LogMessage=String.format("Request Received NumberLow: {%s} and NumberHigh:{%s}", numberlow,numberhigh);
		LOG.info(LogMessage);
		
		if(Utils.isNullOrEmpty(numberlow) && Utils.isNullOrEmpty(numberhigh)) {
			entityList = numCpsInstellingService.getPage(pageable);
		}
		if(!Utils.isNullOrEmpty(numberlow)) { 
			try {
			        entityList = numCpsInstellingService.findByTelefoonNumber(numberlow, pageable);				    
			   }catch(Exception ex) {
					LOG.error("Exception occured :" +ex.getMessage());
					return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList,HttpStatus.NOT_FOUND);		
			   }		
		}
		if(!Utils.isNullOrEmpty(numberlow) && !Utils.isNullOrEmpty(numberhigh) ) {
			try {
			       entityList = numCpsInstellingService.findByNumberlowAndNumberHigh(numberlow,numberhigh, pageable);			    
			    }catch(Exception ex) {
				  LOG.error("Exception occured :" +ex.getMessage());
				}		
		}
		if(Utils.IsNullOrEmpty(entityList.getContent())){
	    	LOG.info("<--- NumCpsInstellingController request from findByNumberlowAndNumberhigh | Data Not Found ----->");
	    	return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList, HttpStatus.NOT_FOUND);
	    }
		return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList, HttpStatus.OK);
   }	
	
	//@ApiOperation(value = "Get all data for specific number")	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/search/{telefoonnumber}", method = RequestMethod.GET)
	public ResponseEntity<Page<NumCpsInstellingEntity>>  findByTelefoonNumber(
			@PageableDefault(size = 50)@SortDefault(direction = Direction.DESC)Pageable pageable,
			@PathVariable(value="telefoonnumber",required = false) String telefoonnumber  ){	
		LOG.info("<--- NumCpsInstellingController request from findByTelefoonNumber ----->");
		LogMessage=String.format("Request Received TelefoonNumber: {%s}", telefoonnumber);
		LOG.info(LogMessage);
		if(Utils.isNullOrEmpty(telefoonnumber)) {
			LogMessage=String.format("TelefoonNumber is invalid {%s}", telefoonnumber);
			LOG.info(LogMessage);
	     	return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);         	
	    }	
		if(!Utils.isNullOrEmpty(telefoonnumber)) { 
			try {
			        entityList = numCpsInstellingService.findByTelefoonNumber(telefoonnumber, pageable);				    
			   }catch(Exception ex) {
					LOG.error("Exception occured :" +ex.getMessage());
					return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList,HttpStatus.NOT_FOUND);		
			   }		
		}	
		if(Utils.IsNullOrEmpty(entityList.getContent())){
	    	  LOG.info("<--- NumCpsInstellingController request from findByTelefoonNumber | Data Not Found----->");
	    	  return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList,HttpStatus.NOT_FOUND);
	    }
		return new ResponseEntity<Page<NumCpsInstellingEntity>>(entityList,HttpStatus.OK);
   }	
}