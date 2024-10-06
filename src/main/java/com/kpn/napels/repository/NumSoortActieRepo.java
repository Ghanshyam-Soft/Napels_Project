package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumSoortActieEntity;



public interface NumSoortActieRepo extends JpaRepository<NumSoortActieEntity, String>{

	NumSoortActieEntity findBysacId(@Param("sId")String sId);
	@Query(value="select nsa from NumSoortActieEntity nsa where nsa.sacId=trim(:sacid)",nativeQuery=false)
	List<NumSoortActieEntity> getRecordsBysacId(@Param("sacid")String sacid);
	
}
