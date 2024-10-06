package com.kpn.napels.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kpn.napels.entity.NumAangeslotenEntity;
import com.kpn.napels.exceptions.ResourceNotFound;
import com.kpn.napels.repository.NumAangeslotenNumRepo;

@Service
public class NumAangeslotenServiceImpl implements NumAangeslotenService{
	
	@Autowired
	NumAangeslotenNumRepo aangeslotenNumRepo;
	
	

	@Override
	public Page<NumAangeslotenEntity> findAll(Pageable pageable) throws ResourceNotFound{
       Page<NumAangeslotenEntity> page = aangeslotenNumRepo.findAll(pageable);	
		
		return page; 
	}



	@Override
	public Page<NumAangeslotenEntity> findByAnrNummerLow(Pageable pageable, String numLow) throws ResourceNotFound {
		Page<NumAangeslotenEntity> page = aangeslotenNumRepo.findByAnrNummerLow(pageable, numLow);	
		return page;
	}



	@Override
	public Page<NumAangeslotenEntity> findByAnrNummerLowAndAnrNummerHoog(Pageable pageable, String numLow, String numHigh) throws ResourceNotFound{
		 Page<NumAangeslotenEntity> page = aangeslotenNumRepo.findAll(pageable);	
		return page;
	}



	@Override
	public Page<NumAangeslotenEntity> findByAnrRoepnummer(Pageable pageable, String roepNum) throws ResourceNotFound {
		Page<NumAangeslotenEntity> page = aangeslotenNumRepo.findAll(pageable);	
		return page;
	}
	

}
