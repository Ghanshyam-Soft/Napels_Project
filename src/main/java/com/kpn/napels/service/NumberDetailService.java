package com.kpn.napels.service;

import com.kpn.napels.dto.NummerDetailsScreenDTO;
import com.kpn.napels.exceptions.DAOException;

public interface NumberDetailService {

	public NummerDetailsScreenDTO searchByNumLow(String numberLow) throws DAOException;

}
