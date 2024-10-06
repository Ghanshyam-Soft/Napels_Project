package com.kpn.napels.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumServiceHistoriePKEntity;
import com.kpn.napels.entity.NumServicenumHistorieEntity;

@Repository
public interface NumServicenumHistorieRepo extends JpaRepository<NumServicenumHistorieEntity,NumServiceHistoriePKEntity>{

	public NumServicenumHistorieEntity findByNumServiceHistoriePKEntity(NumServiceHistoriePKEntity id);
	
	/*@Query(value="select nshe from NumServicenumHistorieEntity nshe where nshe.NumServiceHistoriePKEntity.snhNummerLaag<=numHigh and nshe.snhNummerHoog >=numHigh and nshe.NumServiceHistoriePKEntity.snhLaatsteMutatieMoment>=mutDate",nativeQuery=false)
	List<NumServicenumHistorieEntity> getRecordByfields(@Param("numLow")String numLow,@Param("numHigh")String numHigh,@Param("mutDate")Date mutDate);*/
	
	/*@Query(value="select nshe from NumServicenumHistorieEntity nshe where nshe.numServiceHistoriePKEntity.snhNummerLaag<=trim(:numHigh) and nshe.snhNummerHoog >=trim(:numLow) and nshe.numServiceHistoriePKEntity.snhLaatsteMutatieMoment<=:mutDate order by nshe.numServiceHistoriePKEntity.snhLaatsteMutatieMoment desc",nativeQuery=false)
	List<NumServicenumHistorieEntity> getRecordByfields(@Param("numLow")String numLow,@Param("numHigh")String numHigh,@Param("mutDate")Date mutDate);
	*/
	@Query(value="select nshe from NumServicenumHistorieEntity nshe where nshe.numServiceHistoriePKEntity.snhNummerLaag<=trim(:numHigh) and nshe.snhNummerHoog >=trim(:numLow) ",nativeQuery=false)
	List<NumServicenumHistorieEntity> getRecordByfields(@Param("numLow")String numLow,@Param("numHigh")String numHigh);
	
}
