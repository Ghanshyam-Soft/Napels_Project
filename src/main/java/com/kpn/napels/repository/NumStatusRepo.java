package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumStatusEntity;

@Repository
public interface NumStatusRepo extends JpaRepository<NumStatusEntity, String>{
	NumStatusEntity findBystaId(@Param("staid")String staid);
	
	@Query("select nse from NumStatusEntity nse where nse.staId=:stid")
	List<NumStatusEntity> getRecordByStaId(@Param("stid")String stid);
}
