package com.kpn.napels.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.kpn.napels.dto.NumSwitchvlagDTO;
import com.kpn.napels.entity.NumSwitchvlagEntity;
import com.kpn.napels.exceptions.ResourceNotFound;

public interface NumSwitchvlagService {

	public Page<NumSwitchvlagEntity> getPage(Pageable pageable) throws ResourceNotFound;
	
	public List<NumSwitchvlagDTO> findByNumberlowAndNumberHigh(String numberlow,String numberhigh) throws ResourceNotFound;
	public List<NumSwitchvlagDTO> findByTelefoonNumber(String TelefoonNumber) throws ResourceNotFound;
}
