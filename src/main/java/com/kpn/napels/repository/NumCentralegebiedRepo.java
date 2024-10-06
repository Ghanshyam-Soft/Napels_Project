package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumCentralegebiedEntity;

public interface NumCentralegebiedRepo extends JpaRepository<NumCentralegebiedEntity, Integer>{

	NumCentralegebiedEntity findBycgbCode(@Param("cgbcode")Integer cgbcode);
}
