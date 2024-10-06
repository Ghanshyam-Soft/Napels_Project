package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 
import com.kpn.napels.entity.NumCpsInstellingEntity;

@Repository
@Transactional
public interface NumCpsInstellingRepository extends JpaRepository<NumCpsInstellingEntity, String>{
	
	@Query("select A from NumCpsInstellingEntity A where  A.telefoonNum between ?1 and ?2")
	Page<NumCpsInstellingEntity> getRecord(String numberLow,String numberHigh, Pageable pageable);
	Page<NumCpsInstellingEntity> findByTelefoonNum(String TelefoonNumber, Pageable pageable);
	
	@Query("select A from NumCpsInstellingEntity A where  A.telefoonNum between ?1 and ?2")
	List<NumCpsInstellingEntity> getCpsDetails(String numberLow,String numberHigh);
	
} 
