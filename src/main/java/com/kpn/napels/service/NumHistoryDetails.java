package com.kpn.napels.service;


import com.kpn.napels.dto.NumberDetailHistoryDTO;
import com.kpn.napels.dto.NummerHistoryResponseDTO;
import com.kpn.napels.exceptions.DAOException;

public interface NumHistoryDetails {
	 
	 public NummerHistoryResponseDTO serachHistoryByNumLow(NumberDetailHistoryDTO numberDetailHistoryDTO) throws Exception;

}
