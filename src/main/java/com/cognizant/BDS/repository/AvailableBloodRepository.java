package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.AvailableBlood;

public interface AvailableBloodRepository extends JpaRepository<AvailableBlood, Long> {
	
	@Query(value = "Select available_blood.blood_id, "
			+ "available_blood.blood_group, "
			+ "state.state, "
			+ "available_blood.area, "
			+ "available_blood.pincode, "
			+ "available_blood.contact_number, "
			+ "available_blood.donor_id "
			+ "FROM available_blood, state "
			+ "where available_blood.state_id = state.state_id;", nativeQuery = true)
	Set<AvailableBlood> getAvailableBlood();
	
}
