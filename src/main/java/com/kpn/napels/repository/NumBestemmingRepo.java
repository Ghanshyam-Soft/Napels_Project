package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumBestemmingEntity;

public interface NumBestemmingRepo extends JpaRepository<NumBestemmingEntity, String>{
	
	NumBestemmingEntity findBybstBestemmingSoort(@Param("bstSoort")String bstSoort);

}
