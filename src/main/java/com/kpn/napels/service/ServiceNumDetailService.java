package com.kpn.napels.service;



import com.kpn.napels.dto.ServiceNummerScreenDTO;
import com.kpn.napels.exceptions.DAOException;

public interface ServiceNumDetailService {
	public ServiceNummerScreenDTO searchByNumLow(String numberLow) throws DAOException;
}
