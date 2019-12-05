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
			+ "available_blood.units, " 
			+ "available_blood.donor_id " 
			+ "FROM available_blood, state "
			+ "where available_blood.state_id = state.state_id;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBlood();

	// get units of bloodGroup for admin
	@Query(value = "select sum(units) from available_blood where blood_group = ?;", nativeQuery = true)
	public Integer getAvailableBloodByBloodGroupForAdmin(String bloodGroup);	
	
	@Query(value = "Select available_blood.blood_id, "
			+ "available_blood.blood_group, "
			+ "state.state, "
			+ "available_blood.area, " 
			+ "available_blood.pincode, " 
			+ "available_blood.contact_number, "
			+ "available_blood.units, " 
			+ "available_blood.donor_id " 
			+ "FROM available_blood, state "
			+ "where available_blood.state_id = state.state_id "
			+ "and available_blood.state_id = ? "
			+ "and available_blood.area = ? "
			+ "and available_blood.pincode = ? "
			+ "and available_blood.blood_group = ?;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBloodByStateAndAreaAndBloodGroup(int stateId, String area, int pincode, String bloodGroup);
	
	@Query(value = "SELECT state_id from state where state=?;",nativeQuery = true)
	public int getStateIdByStateName(String stateName);

}
