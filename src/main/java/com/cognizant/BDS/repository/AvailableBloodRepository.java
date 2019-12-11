package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.AvailableBlood;

public interface AvailableBloodRepository extends JpaRepository<AvailableBlood, Long> {

	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, "
			+ "available_blood.blood_bank_name, " + "state.state, " + "available_blood.area, "
			+ "available_blood.pincode, " + "available_blood.contact_number, " + "available_blood.units "
			+ "FROM available_blood, state " + "where available_blood.state_id = state.state_id;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBlood();

	// get units of bloodGroup for admin
	@Query(value = "select sum(units) from available_blood where blood_group = ?;", nativeQuery = true)
	public Integer getAvailableBloodByBloodGroupForAdmin(String bloodGroup);

	// get units of all bloodGroups for admin
	@Query(value = "select sum(units) from available_blood;", nativeQuery = true)
	public Integer getAvailableBloodByAllBloodGroupForAdmin();

	// get request by state,area,pincode,bloodgroup
	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, "
			+ "available_blood.blood_bank_name, " + "state.state, " + "available_blood.area, "
			+ "available_blood.pincode, " + "available_blood.contact_number, " + "available_blood.units "
			+ "FROM available_blood, state " + "where available_blood.state_id = state.state_id "
			+ "and available_blood.state_id = ? " + "and available_blood.area = ? " + "and available_blood.pincode = ? "
			+ "and available_blood.blood_group = ?;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBloodByStateAndAreaAndBloodGroup(int stateId, String area, int pincode,
			String bloodGroup);

	// select id of state
	@Query(value = "SELECT state_id from state where state=?;", nativeQuery = true)
	public int getStateIdByStateName(String stateName);

	// get request by state
	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, "
			+ "available_blood.blood_bank_name, " + "state.state, " + "available_blood.area, "
			+ "available_blood.pincode, " + "available_blood.contact_number, " + "available_blood.units "
			+ "FROM available_blood, state " + "where available_blood.state_id = state.state_id "
			+ "and available_blood.state_id = ? ;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBloodByState(int stateId);

	// get request by bloodgroup
	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, "
			+ "available_blood.blood_bank_name, " + "state.state, " + "available_blood.area, "
			+ "available_blood.pincode, " + "available_blood.contact_number, " + "available_blood.units "
			+ "FROM available_blood, state " + "where available_blood.state_id = state.state_id "
			+ "and available_blood.blood_group = ?;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBloodByBloodGroup(String bloodGroup);

	// get request by state,area
	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, "
			+ "available_blood.blood_bank_name, " + "state.state, " + "available_blood.area, "
			+ "available_blood.pincode, " + "available_blood.contact_number, " + "available_blood.units "
			+ "FROM available_blood, state " + "where available_blood.state_id = state.state_id "
			+ "and available_blood.state_id = ? " + "and available_blood.area = ? ;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBloodByStateAndArea(int stateId, String area);
}
