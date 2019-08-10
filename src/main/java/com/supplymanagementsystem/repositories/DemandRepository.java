package com.supplymanagementsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.supplymanagementsystem.entities.Demand;

public interface DemandRepository extends JpaRepository<Demand, Long>{

	@Query("SELECT con FROM Contact con  WHERE con.phoneType=(:pType) AND con.lastName= (:lName)")
    List<Demand> findByLastNameAndPhoneType(@Param("pType") PhoneType pType, @Param("lName") String lName);
}
