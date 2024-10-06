package com.kpn.napels.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kpn.napels.dto.ServiceNummerSearchDTO;
import com.kpn.napels.entity.NumServiceNummerEntity;


public interface ServiceNumService {

	public Page<NumServiceNummerEntity> getServiceNumList(ServiceNummerSearchDTO servicenumSearch, Pageable page);
}
