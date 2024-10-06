package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumBeschikkingEntity;

public interface NumBeschikkingRepo extends JpaRepository<NumBeschikkingEntity, Long>{

	NumBeschikkingEntity findBybskId(@Param("bskId")Long bskId);
	
}
