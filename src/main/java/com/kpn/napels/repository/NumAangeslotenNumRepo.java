package com.kpn.napels.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumAangeslotenEntity;



public interface NumAangeslotenNumRepo extends JpaRepository<NumAangeslotenEntity, String> {
	
	NumAangeslotenEntity findByanrNummerLow(@Param("numberLow")String numberLow);

//	Page<NumAangeslotenEntity> findAllByOrderByAnrNummerLowAsc(Pageable pageable);
	Page<NumAangeslotenEntity> findAll(Pageable pageable);
	
    Page<NumAangeslotenEntity> findByAnrNummerLow(Pageable pageable, String anrNummerLow);
	
	Page<NumAangeslotenEntity> findByAnrNummerLowAndAnrNummerHoog(Pageable pageable,String anrNummerLow, String anrNummerHoog);
	
	Page<NumAangeslotenEntity> findByAnrRoepnummer(Pageable pageable, String anrRoepNummer);
}