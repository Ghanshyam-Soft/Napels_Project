package com.kpn.napels.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kpn.napels.common.Utils;
import com.kpn.napels.dto.NumSwitchvlagDTO;
import com.kpn.napels.entity.NumCpsInstellingEntity;
import com.kpn.napels.entity.NumSwitchvlagEntity;
import com.kpn.napels.exceptions.ResourceNotFound;
import com.kpn.napels.repository.NumSwitchvlagRepo;
@Service
public class NumSwitchvlagServiceImpl implements NumSwitchvlagService{

	private static final Logger LOG = LoggerFactory.getLogger(NumCpsInstellingService.class);

	@Autowired
	NumSwitchvlagRepo numSwitchvlagRepo;
	String LogMessage="";

	@Override
	public Page<NumSwitchvlagEntity> getPage(Pageable pageable)
	{
		try{ 
			return numSwitchvlagRepo.findAll(pageable);
		}catch(Exception ex) {
			LOG.error("Exception:"+ex.getMessage());
		}
		return null;
	}

	@Override
	public List<NumSwitchvlagDTO> findByNumberlowAndNumberHigh(String numberlow, String numberhigh)
			throws ResourceNotFound {

		List<NumSwitchvlagDTO> numSwitchvlagdtoList=new ArrayList<NumSwitchvlagDTO>();

		try {
			List<NumSwitchvlagEntity> numSwitchvlagEntity= numSwitchvlagRepo.getRecord(numberlow, numberhigh);




			for(NumSwitchvlagEntity numSwitch:numSwitchvlagEntity) {

				NumSwitchvlagDTO numSwitchvlagdto=new NumSwitchvlagDTO();
				
				if(!Utils.isEmptyOrNull(numSwitch.getTelefoonnummer())) {
					numSwitchvlagdto.setTelefoonnummer(numSwitch.getTelefoonnummer());
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag41())) {

					if(numSwitch.getBarringFlag41().equals("N")) {
						numSwitchvlagdto.setBarringFlag41(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag41(numSwitch.getBarringFlag41());
					}
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag42())) {

					if(numSwitch.getBarringFlag42().equals("N")) {
						numSwitchvlagdto.setBarringFlag42(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag42(numSwitch.getBarringFlag42());
					}
					
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag43())) {

					if(numSwitch.getBarringFlag43().equals("N")) {
						numSwitchvlagdto.setBarringFlag43(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag43(numSwitch.getBarringFlag43());
					}
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag44())) {

					if(numSwitch.getBarringFlag44().equals("N")) {
						numSwitchvlagdto.setBarringFlag44(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag44(numSwitch.getBarringFlag44());
					}
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag45())) {

					if(numSwitch.getBarringFlag45().equals("N")) {
						numSwitchvlagdto.setBarringFlag45(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag45(numSwitch.getBarringFlag45());
					}
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag46())) {

					if(numSwitch.getBarringFlag46().equals("N")) {
						numSwitchvlagdto.setBarringFlag46(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag46(numSwitch.getBarringFlag46());
					}
				}

				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag47())) {

					if(numSwitch.getBarringFlag47().equals("N")) {
						numSwitchvlagdto.setBarringFlag47(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag47(numSwitch.getBarringFlag47());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag48())) {

					if(numSwitch.getBarringFlag48().equals("N")) {
						numSwitchvlagdto.setBarringFlag48(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag48(numSwitch.getBarringFlag48());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag49())) {

					if(numSwitch.getBarringFlag49().equals("N")) {
						numSwitchvlagdto.setBarringFlag49(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag49(numSwitch.getBarringFlag49());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag50())) {

					if(numSwitch.getBarringFlag50().equals("N")) {
						numSwitchvlagdto.setBarringFlag50(""); 
					}
					else {
						numSwitchvlagdto.setBarringFlag50(numSwitch.getBarringFlag50());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBlockedCs())) {

					if(numSwitch.getBlockedCs().equals("N")) {
						numSwitchvlagdto.setBlockedCs(""); 
					}
					else {
						numSwitchvlagdto.setBlockedCs(numSwitch.getBlockedCs());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBlockedCsWlr())) {

					if(numSwitch.getBlockedCsWlr().equals("N")) {
						numSwitchvlagdto.setBlockedCsWlr(""); 
					}
					else {
						numSwitchvlagdto.setBlockedCsWlr(numSwitch.getBlockedCsWlr());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBlockedKpn())) {

					if(numSwitch.getBarringFlag50().equals("N")) {
						numSwitchvlagdto.setBlockedKpn(""); 
					}
					else {
						numSwitchvlagdto.setBlockedKpn(numSwitch.getBlockedKpn());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getBlockedKpnWlr())) {

					if(numSwitch.getBarringFlag50().equals("N")) {
						numSwitchvlagdto.setBlockedKpnWlr(""); 
					}
					else {
						numSwitchvlagdto.setBlockedKpnWlr(numSwitch.getBlockedKpnWlr());
					}
				}
				if(!Utils.isEmptyOrNull(numSwitch.getWlrCustomer())) {

					if(numSwitch.getBarringFlag50().equals("N")) {
						numSwitchvlagdto.setWlrCustomer(""); 
					}
					else {
						numSwitchvlagdto.setWlrCustomer(numSwitch.getWlrCustomer());
					}
				}

				numSwitchvlagdtoList.add(numSwitchvlagdto);


			}

			return numSwitchvlagdtoList;


		}catch(Exception ex) {
			LOG.error("Exception:"+ex.getMessage());
		}

		return numSwitchvlagdtoList;

	}


	public List<NumSwitchvlagDTO> findByTelefoonNumber(String TelefoonNumber) {
		if(Utils.isNullOrEmpty(TelefoonNumber)) {
			LogMessage=String.format("TelefoonNumber is invalid {%s}", TelefoonNumber);
			LOG.info(LogMessage);
	     	return null;         	
	    }	
		
			List<NumSwitchvlagDTO> numSwitchvlagdtoList=new ArrayList<NumSwitchvlagDTO>();

			try {
				List<NumSwitchvlagEntity> numSwitchvlagEntity= numSwitchvlagRepo.findBytelefoonnummer(TelefoonNumber);




				for(NumSwitchvlagEntity numSwitch:numSwitchvlagEntity) {

					NumSwitchvlagDTO numSwitchvlagdto=new NumSwitchvlagDTO();
					
					if(!Utils.isEmptyOrNull(numSwitch.getTelefoonnummer())) {
						numSwitchvlagdto.setTelefoonnummer(numSwitch.getTelefoonnummer());
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag41())) {

						if(numSwitch.getBarringFlag41().equals("N")) {
							numSwitchvlagdto.setBarringFlag41(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag41(numSwitch.getBarringFlag41());
						}
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag42())) {

						if(numSwitch.getBarringFlag42().equals("N")) {
							numSwitchvlagdto.setBarringFlag42(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag42(numSwitch.getBarringFlag42());
						}
						
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag43())) {

						if(numSwitch.getBarringFlag43().equals("N")) {
							numSwitchvlagdto.setBarringFlag43(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag43(numSwitch.getBarringFlag43());
						}
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag44())) {

						if(numSwitch.getBarringFlag44().equals("N")) {
							numSwitchvlagdto.setBarringFlag44(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag44(numSwitch.getBarringFlag44());
						}
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag45())) {

						if(numSwitch.getBarringFlag45().equals("N")) {
							numSwitchvlagdto.setBarringFlag45(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag45(numSwitch.getBarringFlag45());
						}
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag46())) {

						if(numSwitch.getBarringFlag46().equals("N")) {
							numSwitchvlagdto.setBarringFlag46(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag46(numSwitch.getBarringFlag46());
						}
					}

					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag47())) {

						if(numSwitch.getBarringFlag47().equals("N")) {
							numSwitchvlagdto.setBarringFlag47(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag47(numSwitch.getBarringFlag47());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag48())) {

						if(numSwitch.getBarringFlag48().equals("N")) {
							numSwitchvlagdto.setBarringFlag48(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag48(numSwitch.getBarringFlag48());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag49())) {

						if(numSwitch.getBarringFlag49().equals("N")) {
							numSwitchvlagdto.setBarringFlag49(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag49(numSwitch.getBarringFlag49());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBarringFlag50())) {

						if(numSwitch.getBarringFlag50().equals("N")) {
							numSwitchvlagdto.setBarringFlag50(""); 
						}
						else {
							numSwitchvlagdto.setBarringFlag50(numSwitch.getBarringFlag50());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBlockedCs())) {

						if(numSwitch.getBlockedCs().equals("N")) {
							numSwitchvlagdto.setBlockedCs(""); 
						}
						else {
							numSwitchvlagdto.setBlockedCs(numSwitch.getBlockedCs());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBlockedCsWlr())) {

						if(numSwitch.getBlockedCsWlr().equals("N")) {
							numSwitchvlagdto.setBlockedCsWlr(""); 
						}
						else {
							numSwitchvlagdto.setBlockedCsWlr(numSwitch.getBlockedCsWlr());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBlockedKpn())) {

						if(numSwitch.getBarringFlag50().equals("N")) {
							numSwitchvlagdto.setBlockedKpn(""); 
						}
						else {
							numSwitchvlagdto.setBlockedKpn(numSwitch.getBlockedKpn());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getBlockedKpnWlr())) {

						if(numSwitch.getBarringFlag50().equals("N")) {
							numSwitchvlagdto.setBlockedKpnWlr(""); 
						}
						else {
							numSwitchvlagdto.setBlockedKpnWlr(numSwitch.getBlockedKpnWlr());
						}
					}
					if(!Utils.isEmptyOrNull(numSwitch.getWlrCustomer())) {

						if(numSwitch.getBarringFlag50().equals("N")) {
							numSwitchvlagdto.setWlrCustomer(""); 
						}
						else {
							numSwitchvlagdto.setWlrCustomer(numSwitch.getWlrCustomer());
						}
					}

					numSwitchvlagdtoList.add(numSwitchvlagdto);


				}

				return numSwitchvlagdtoList;
			
			}catch(Exception ex) {
				LOG.error("Exception:"+ex.getMessage());
			}

			return numSwitchvlagdtoList;

		}
}