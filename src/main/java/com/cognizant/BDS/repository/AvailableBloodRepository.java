package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.AvailableBlood;

public interface AvailableBloodRepository extends JpaRepository<AvailableBlood, Long> {
	
	@Query(value = "Select blood_id,blood_group,state_id,area,pincode,contact_number,donor_id FROM available_blood;", nativeQuery = true)
	Set<AvailableBlood> getAvailableBlood();
	
}
