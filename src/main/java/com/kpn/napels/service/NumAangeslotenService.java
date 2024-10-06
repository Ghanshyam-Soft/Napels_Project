package com.kpn.napels.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kpn.napels.entity.NumAangeslotenEntity;
import com.kpn.napels.exceptions.ResourceNotFound;



public interface NumAangeslotenService {
	
	public Page<NumAangeslotenEntity> findAll(Pageable pageable) throws ResourceNotFound;
	
	public Page<NumAangeslotenEntity> findByAnrNummerLow(Pageable pageable, String anrNummerLow) throws ResourceNotFound;
	
	public Page<NumAangeslotenEntity> findByAnrNummerLowAndAnrNummerHoog(Pageable pageable,String anrNummerLow, String anrNummerHoog) throws ResourceNotFound;
	
	public Page<NumAangeslotenEntity> findByAnrRoepnummer(Pageable pageable, String anrRoepNummer) throws ResourceNotFound;
}
