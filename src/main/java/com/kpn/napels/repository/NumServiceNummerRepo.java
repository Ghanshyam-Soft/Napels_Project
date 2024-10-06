package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumServiceNummerEntity;

public interface NumServiceNummerRepo extends JpaRepository<NumServiceNummerEntity, String>{

	NumServiceNummerEntity findBysnrNumberLow(@Param("numLow")String numLow);
	
	/*@Query(value="SELECT A.NOP_INTERNE_OPERATOR_ID,"
			+ "B.SNR_NUMMER_LAAG,"
			+ "B.SNR_NUMMER_HOOG,"
			+ "B.SNR_BESTEMMING_ID,"
			+ "B.SNR_LAATSTE_MUTATIE_MOMENT,"
			+ "B.SNR_GEBRUIKER_ID_MUTATIE_MOMEN,"
			+ "C.SAC_ID,"
			+ "C.SAC_OMSCHRIJVING,"
			+ "D.PLATFORM_ID,"
			+ "D.PLATFORMOMSCHRIJVING  "
			+ "FROM "
			+ "NUM_NETWERK_OPERATOR A,"
			+ "NUM_SERVICENUMMER B,"
			+ "NUM_SOORT_ACTIE C,"
			+ "NUM_VOIP_PLATFORM D "
			+ "WHERE "
			+ "A.NOP_INTERNE_OPERATOR_ID=B.FK_NOP_INTERNE_OPERATOR_ID "
			+ "AND C.SAC_ID=B.FK_SAC_ID "
			+ "AND D.PLATFORM_ID=B.FK_NUM_VOIP_PLATFORM_ID ",nativeQuery=true)
	List<Object[]> getRecordBynumlow();*/
	
	
}
