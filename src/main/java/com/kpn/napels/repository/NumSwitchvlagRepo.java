package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kpn.napels.entity.NumSwitchvlagEntity;
@Repository
@Transactional
public interface NumSwitchvlagRepo extends JpaRepository<NumSwitchvlagEntity,String>{

	@Query("select A from NumSwitchvlagEntity A where  A.telefoonnummer between ?1 and ?2")
	List<NumSwitchvlagEntity> getRecord(String numberLow,String numberHigh);
	List<NumSwitchvlagEntity> findBytelefoonnummer(String TelefoonNumber);
}
