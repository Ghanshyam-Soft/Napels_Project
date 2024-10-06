package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumVoipPlatformEntity;

@Repository
public interface NumVoipPlatformRepo extends JpaRepository<NumVoipPlatformEntity, Integer>{
	NumVoipPlatformEntity findByplatformId(@Param("pid")Integer pid);
	
	@Query("select numvoip from NumVoipPlatformEntity numvoip where numvoip.platformId=0")
	NumVoipPlatformEntity getRecordWithpidZero();

}
