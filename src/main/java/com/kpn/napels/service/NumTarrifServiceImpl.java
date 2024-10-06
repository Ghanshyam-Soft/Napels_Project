package com.kpn.napels.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpn.napels.entity.NumTariffEntity;
import com.kpn.napels.repository.NummerTarrifRepo;

@Service
public class NumTarrifServiceImpl implements NumTarrifService{

	private static final Logger LOG = LoggerFactory.getLogger(NumTarrifServiceImpl.class);
	
	@Autowired
	NummerTarrifRepo nummerTarrifRepo;
	@Override
	public List<NumTariffEntity> findAllTarrifCode() {
		
		List<NumTariffEntity> tarrifList = null;
		
		try {
			tarrifList = nummerTarrifRepo.findAllByOrderByTrfTarrifCodeAsc();
		}
		catch(Exception e) {
			LOG.error("Exception Occured::"+e.getMessage());
		}
		
		// TODO Auto-generated method stub
		return tarrifList;
	}

}
