package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.BDS.model.AvailableBlood;

public interface AvailableBloodRepository extends JpaRepository<AvailableBlood, Long> {
	
	Set<AvailableBloodRepository> getAvailableBlood();
	
}
