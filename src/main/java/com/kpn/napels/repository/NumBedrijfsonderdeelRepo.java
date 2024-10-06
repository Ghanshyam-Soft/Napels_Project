package com.kpn.napels.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumBedrijfsonderdeelEntity;

public interface NumBedrijfsonderdeelRepo extends JpaRepository<NumBedrijfsonderdeelEntity, Integer>{
	//NumBedrijfsonderdeelEntity findBybdoNummer(@Param("bdoNum")int bdoNum);
	
	@Query(value="select b from NumBedrijfsonderdeelEntity b,NumCentralegebiedEntity c where b.bdoNummer=c.fkBdoNummer and c.cgbCode=:cgb",nativeQuery=false)
	NumBedrijfsonderdeelEntity getRecordBycgbcode(@Param("cgb")Integer cgb);
	
	@Query(value="select b from NumBedrijfsonderdeelEntity b where b.bdoType=trim(:typeTcd) and b.bdoNummer=:bdoNum",nativeQuery=false)
	NumBedrijfsonderdeelEntity getRecordBybdonum(@Param("bdoNum")Integer bdoNum,@Param("typeTcd")String typeTcd);
	
}
