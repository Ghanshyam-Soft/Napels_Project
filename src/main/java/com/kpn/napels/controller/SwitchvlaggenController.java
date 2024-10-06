package com.kpn.napels.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.NumSwitchvlagDTO;
import com.kpn.napels.entity.NumCpsInstellingEntity;
import com.kpn.napels.entity.NumSwitchvlagEntity;
import com.kpn.napels.exceptions.ResourceNotFound;
import com.kpn.napels.service.NumSwitchvlagService;


@CrossOrigin
@RestController
@RequestMapping("/napels/switchvlag")
public class SwitchvlaggenController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SwitchvlaggenController.class);
	
	@Autowired
	NumSwitchvlagService numSwitchvlagService;
	
	List<NumSwitchvlagDTO> entityList=null;
	
	String LogMessage="";
	/*
	@RequestMapping(value="/all", method = RequestMethod.GET)
	public Page<NumSwitchvlagEntity> findByAll(@PageableDefault(size = 15)@SortDefault(direction = Direction.DESC)Pageable pageable) throws ResourceNotFound{
	    LOG.info("<--- SwitchvlaggenController request from findby All ----->");
	    return numSwitchvlagService.getPage(pageable);
	}
	*/
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/search/{numberlow}/{numberhigh}", method = RequestMethod.GET)
	public ResponseEntity<List<NumSwitchvlagDTO>> findByNumberlowAndNumberhigh(@PathVariable(value="numberlow",required = false) String numberlow,@PathVariable(value="numberhigh",required = false) String numberhigh){
		LOG.info("<--- SwitchvlaggenController request from findByNumberlowAndNumberhigh ----->");
		LogMessage=String.format("Request Received NumberLow: {%s} and NumberHigh:{%s}", numberlow,numberhigh);
		LOG.info(LogMessage);		
		if(Utils.isNullOrEmpty(numberlow)) {
			LogMessage=String.format("NumberLow value is invalid {%s}", numberlow);
			LOG.info(LogMessage);
	     	return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);         	
	    }	
		if(Utils.isNullOrEmpty(numberhigh)) {
			LogMessage=String.format("NumberHigh value is invalid {%s}", numberhigh);
			LOG.info(LogMessage);
	     	return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);         	
	    }	
		if(!Utils.isNullOrEmpty(numberlow) && !Utils.isNullOrEmpty(numberhigh) ) {
			try {
			       entityList = numSwitchvlagService.findByNumberlowAndNumberHigh(numberlow,numberhigh);			    
			    }catch(Exception ex) {
				  LOG.error("Exception occured :" +ex.getMessage());
				  return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.NOT_FOUND);		
			   }		
		}
		
		if(Utils.IsNullOrEmpty(entityList)){
	    	LOG.info("<--- SwitchvlaggenController request from findByNumberlowAndNumberhigh | Data Not Found ----->");
	    	return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.NOT_FOUND);
	    }
		return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.OK);
   }	
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/search/{telefoonnumber}", method = RequestMethod.GET)
	public ResponseEntity<List<NumSwitchvlagDTO>>  findByTelefoonNumber(@PathVariable(value="telefoonnumber",required = false) String telefoonnumber  ){	
		LOG.info("<--- SwitchvlaggenController request from findByTelefoonNumber ----->");
		LogMessage=String.format("Request Received TelefoonNumber: {%s}", telefoonnumber);
		LOG.info(LogMessage);
		if(Utils.isNullOrEmpty(telefoonnumber)) {
			LogMessage=String.format("TelefoonNumber is invalid {%s}", telefoonnumber);
			LOG.info(LogMessage);
	     	return new ResponseEntity(LogMessage, HttpStatus.BAD_REQUEST);         	
	    }	
		if(!Utils.isNullOrEmpty(telefoonnumber)) { 
			try {
			        entityList = numSwitchvlagService.findByTelefoonNumber(telefoonnumber);				    
			   }catch(Exception ex) {
					LOG.error("Exception occured :" +ex.getMessage());
					return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.NOT_FOUND);		
			   }		
		}	
		if(Utils.IsNullOrEmpty(entityList)){
	    	  LOG.info("<--- SwitchvlaggenController request from findByTelefoonNumber | Data Not Found----->");
	    	  return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.NOT_FOUND);
	    }
		return new ResponseEntity<List<NumSwitchvlagDTO>>(entityList,HttpStatus.OK);
   }	
	
	

}
