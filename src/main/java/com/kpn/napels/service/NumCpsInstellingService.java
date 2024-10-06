package com.kpn.napels.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.kpn.napels.repository.NumCpsInstellingRepository;
import com.kpn.napels.common.Utils;
import com.kpn.napels.entity.NumCpsInstellingEntity;

@Component
@Scope("prototype")
public class NumCpsInstellingService {
	private static final Logger LOG = LoggerFactory.getLogger(NumCpsInstellingService.class);

	@Autowired
	NumCpsInstellingRepository numCpsInstellingRepository;
	String LogMessage="";
	
	public Page<NumCpsInstellingEntity> getPage(Pageable pageable)
	{
	 try{
			return numCpsInstellingRepository.findAll(pageable);
		}catch(Exception ex) {
			LOG.error("Exception:"+ex.getMessage());
		}
		return null;
	}
	////////////////////////////////////////////////////////////////////////////////////////////
	
	public Page<NumCpsInstellingEntity> findByNumberlowAndNumberHigh(String numberlow,String numberhigh, Pageable pageable) {
		
		if(Utils.isNullOrEmpty(numberlow)) {
			LogMessage=String.format("NumberLow value is invalid {%s}", numberlow);
			LOG.info(LogMessage);
	     	return null;         	
	    }	
		if(Utils.isNullOrEmpty(numberhigh)) {
			LogMessage=String.format("NumberHigh value is invalid {%s}", numberhigh);
			LOG.info(LogMessage);
	     	return null;         	
	    }	
		try{
			  return numCpsInstellingRepository.getRecord(numberlow, numberhigh, pageable);
		    }catch(Exception ex) {
			   LOG.error("Exception:"+ex.getMessage());
		   }
		return null;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	public Page<NumCpsInstellingEntity> findByTelefoonNumber(String TelefoonNumber, Pageable pageable) {
		if(Utils.isNullOrEmpty(TelefoonNumber)) {
			LogMessage=String.format("TelefoonNumber is invalid {%s}", TelefoonNumber);
			LOG.info(LogMessage);
	     	return null;         	
	    }	
		try{
			 return numCpsInstellingRepository.findByTelefoonNum(TelefoonNumber, pageable);
		}catch(Exception ex) {
			LOG.error("Exception:"+ex.getMessage());
		}
		return null;
	}
   ////////////////////////////////////////////////////////////////////////////////////////////////////	
	
}
