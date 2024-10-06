package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpn.napels.entity.NumTariffEntity;

public interface NummerTarrifRepo extends JpaRepository<NumTariffEntity, Integer>{

	public List<NumTariffEntity> findAllByOrderByTrfTarrifCodeAsc();
}
