package com.kpn.napels.service;

import java.util.List;

import com.kpn.napels.dto.ServiceNummerSearchDTO;
import com.kpn.napels.entity.NumTariffEntity;

public interface NumTarrifService {

	public List<NumTariffEntity> findAllTarrifCode();
}
