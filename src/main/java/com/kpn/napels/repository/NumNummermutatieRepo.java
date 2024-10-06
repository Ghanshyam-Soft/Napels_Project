package com.kpn.napels.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kpn.napels.entity.NumNummermutatieEntity;
import com.kpn.napels.entity.NumNummermutatiePKEntity;

public interface NumNummermutatieRepo extends JpaRepository<NumNummermutatieEntity, NumNummermutatiePKEntity>{
	
	
	public NumNummermutatieEntity findByNumNummermutatiePK(NumNummermutatiePKEntity id);
	
	@Query("select nummutatie from NumNummermutatieEntity nummutatie where "
			+ "nummutatie.numNummermutatiePK.nmtNummerLaag<=:numHigh "
			+ "AND nummutatie.nmtNummerHoog>=:numLow "
			+ "AND nummutatie.numNummermutatiePK.nmtLogischMutatiemoment<= current_date order by nummutatie.numNummermutatiePK.nmtLogischMutatiemoment desc")
	public List<NumNummermutatieEntity> getRecordByNumlowNumhigh(@Param("numLow")String numLow,@Param("numHigh")String numHigh);
	
	
	/*@Query("select A.numNummermutatiePK.nmtNummerLaag,"
			+ "A.nmtNummerHoog,"
			+ "A.nmtStatusCode,"
			+ "A.nmtLaatsteSoortActieCode,"
			+ "A.nmtStatusToekenning,"
			+ "A.nmtOperatorExploitant,"
			+ "A.nmtInDienstSpcId,"
			+ "A.nmtInDienstCgbCode,"
			+ "A.nmtSoortDienst,"
			+ "A.nmtRoepnummer,"
			+ "A.numNummermutatiePK.nmtLogischMutatiemoment"
			+ " from NumNummermutatieEntity A where "
			+ "A.numNummermutatiePK.nmtNummerLaag<=:numHigh "
			+ "AND A.nmtNummerHoog>=:numLow "
			+ "order by A.numNummermutatiePK.nmtLogischMutatiemoment desc")
	public List<Object[]> getRecordByNumlowNumhigh(@Param("numLow")String numLow,@Param("numHigh")String numHigh);
*/
}
