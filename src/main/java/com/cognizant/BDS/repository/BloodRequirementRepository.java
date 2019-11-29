package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.BloodRequirement;

public interface BloodRequirementRepository extends JpaRepository<BloodRequirement, Long> {

	@Query(value = "SELECT blood_requirement.req_id,blood_requirement.blood_group,state.state,"
			+ "blood_requirement.area, blood_requirement.pincode,"
			+ "blood_requirement.contact_number, blood_requirement.user_id "
			+ "FROM blood_requirement "
			+ "INNER JOIN state ON blood_requirement.state_id = state.state_id;", nativeQuery = true)
	public Set<BloodRequirement> getAllBloodRequirement();

}
