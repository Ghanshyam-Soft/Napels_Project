package com.kpn.napels.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kpn.napels.entity.NumTariffEntity;
import com.kpn.napels.service.NumTarrifService;

@RestController
@RequestMapping("/napels-numbes/nummertarrief")
public class NummerTarievController {

	private static final Logger LOG = LoggerFactory.getLogger(NummerTarievController.class);
	
	@Autowired
	NumTarrifService numTarrifService;
	
	
	@RequestMapping(value="/zoeken", method = RequestMethod.GET)
	public ResponseEntity<List<NumTariffEntity>> getTarrif(){
		
		List<NumTariffEntity> tarrifList = null;
		
		try {
			tarrifList = numTarrifService.findAllTarrifCode();
			return new ResponseEntity<List<NumTariffEntity>>(tarrifList,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOG.error("Exception Occured :" +e.getMessage());
			return new ResponseEntity<List<NumTariffEntity>>(tarrifList,HttpStatus.NOT_FOUND);
		}
		
	}
	
}
