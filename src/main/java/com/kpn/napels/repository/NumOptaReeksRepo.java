package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumOptaReeksEntity;

public interface NumOptaReeksRepo extends JpaRepository<NumOptaReeksEntity,String>{

	NumOptaReeksEntity findByoprTeleNummerSter(@Param("telnum")String telnum);
	
}
