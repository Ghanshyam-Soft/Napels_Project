package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumNetwerkOperatorEntity;

@Repository
public interface NumNetwerkOperatorRepo extends JpaRepository<NumNetwerkOperatorEntity, String>{

	NumNetwerkOperatorEntity findBynopInterneOperatorId(@Param("internOpId")String internOpId);
}
