package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumNetNummergebiedEntity;

public interface NumNetNummergebiedRepo extends JpaRepository<NumNetNummergebiedEntity, String>{
	NumNetNummergebiedEntity findBynetNummer(@Param("netnummer")String netnummer);
}
