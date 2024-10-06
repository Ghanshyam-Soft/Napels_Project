package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumHostEntity;

public interface NumHostRepo extends JpaRepository<NumHostEntity, String>{

	NumHostEntity findByhstSpcId(@Param("hstspcId")String hstspcId);
	
	@Query(value="SELECT A.hstSpcId,"
			+ "A.hstCentraleEenhNaam,"
			+ "B.cgbCode,"
			+ "B.cgbNaamVerkort FROM "
			+ "NumHostEntity A,"
			+ "NumCentralegebiedEntity B,"
			+ "NumCentraleEenheidEntity C,"
			+ "NumAangeslotenEntity D " + 
			"WHERE "
			+ "A.hstSpcId=C.numCentralPKEntity.fkCehHstSpcId "
			+ "AND B.cgbCode=C.numCentralPKEntity.fkCehCgbCode "
			+ "AND C.numCentralPKEntity.fkCehHstSpcId=D.moederHstSpcId "
			+ "AND C.numCentralPKEntity.fkCehCgbCode=D.fkMoedercgbCode "
			+ "AND D.anrNummerLow=trim(:numlow)",nativeQuery=false)
	List<Object[]> getRecordByModer(@Param("numlow")String numlow);
	
	
	@Query(value="SELECT A.hstSpcId,"
			+ "A.hstCentraleEenhNaam,"
			+ "B.cgbCode,"
			+ "B.cgbNaamVerkort FROM "
			+ "NumHostEntity A,"
			+ "NumCentralegebiedEntity B,"
			+ "NumCentraleEenheidEntity C,"
			+ "NumAangeslotenEntity D " + 
			"WHERE "
			+ "A.hstSpcId=C.numCentralPKEntity.fkCehHstSpcId "
			+ "AND B.cgbCode=C.numCentralPKEntity.fkCehCgbCode "
			+ "AND C.numCentralPKEntity.fkCehHstSpcId=D.dienstHstSpcId "
			+ "AND C.numCentralPKEntity.fkCehCgbCode=D.dienstCgbCode "
			+ "AND D.anrNummerLow=trim(:numlow)",nativeQuery=false)
	List<Object[]> getRecordByDienst(@Param("numlow")String numlow);
	
}
