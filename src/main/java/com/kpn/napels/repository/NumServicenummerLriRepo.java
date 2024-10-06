package com.kpn.napels.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpn.napels.entity.NumServicenummerLriEntity;
import com.kpn.napels.entity.NumServicenummerLriPKEntity;

@Repository
public interface NumServicenummerLriRepo extends JpaRepository<NumServicenummerLriEntity,NumServicenummerLriPKEntity>{
 public NumServicenummerLriEntity findByNumServicenummerLriPKEntity(NumServicenummerLriPKEntity id);
}
