package com.kpn.napels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumToekenningEntity;



@Repository
public interface NumToekenningRepo extends JpaRepository<NumToekenningEntity, String>{
	//NumToekenningEntity findByfkCgbCode(@Param("cgbcode")Integer cgbcode);
	
	/*@Query(value="select * from NUM_TOEKENNING where FK_CGB_CODE=cgbcode",nativeQuery=true)
	NumToekenningEntity getrecordforcgb(@Param("cgbcode")Integer cgbcode);*/
	
	/*@Query("select numtoek from NumToekenningEntity numtoek where trim(numtoek.fkCgbCode) = trim(:cgbcode)")
	NumToekenningEntity getrecordforcgb(@Param("cgbcode")Integer cgbcode);*/
	
	NumToekenningEntity findBytokNummerLaag(@Param("numlow")String numlow);
	
	@Query(value="select numtoek.tokNummerLaag from NumToekenningEntity numtoek where numtoek.tokNummerLaag <= :numlow order by numtoek.tokNummerLaag desc",nativeQuery=false)
	List<String> getRecordBynumLag(@Param("numlow")String numlow);
	
	@Query(value="SELECT "
			+ "A.tokTypeToekenning,"
			+ "A.tokStatusToekenning,"
			+ "A.tokNummerHoog,"
			+ "B.hstSpcId,"
			+ "C.cgbCode "
			+ "from NumToekenningEntity A,"
			+ "NumHostEntity B,"
			+ "NumCentralegebiedEntity C,"
			+ "NumCentraleEenheidEntity D " + 
			"WHERE B.hstSpcId=D.numCentralPKEntity.fkCehHstSpcId "
			+ "AND C.cgbCode=D.numCentralPKEntity.fkCehCgbCode "
			+ "AND D.numCentralPKEntity.fkCehCgbCode=A.fkCgbCode "
			+ "AND D.numCentralPKEntity.fkCehHstSpcId=A.fkHstSpcId "
			+ "AND A.tokNummerLaag=:numlow",nativeQuery=false)
    List<Object[]> getRecordByfields(@Param("numlow")String numlow);
		
}
