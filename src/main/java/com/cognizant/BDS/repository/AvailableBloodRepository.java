package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.AvailableBlood;

public interface AvailableBloodRepository extends JpaRepository<AvailableBlood, Long> {

	@Query(value = "Select available_blood.blood_id, " + "available_blood.blood_group, " + "state.state, "
			+ "available_blood.area, " + "available_blood.pincode, " + "available_blood.contact_number, "
			+ "available_blood.units, " + "available_blood.donor_id " + "FROM available_blood, state "
			+ "where available_blood.state_id = state.state_id;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBlood();

	// get units of A+
	@Query(value = "select sum(units) from available_blood where blood_group = A+;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableAPositiveUnits();

	// get units of A-
	@Query(value = "select sum(units) from available_blood where blood_group = A-;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableANegativeUnits();

	// get units of B+
	@Query(value = "select sum(units) from available_blood where blood_group = B+;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBPositiveUnits();

	// get units of b-
	@Query(value = "select sum(units) from available_blood where blood_group = B-;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableBNegativeUnits();

	// get units of AB+
	@Query(value = "select sum(units) from available_blood where blood_group = AB+;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableABPositiveUnits();

	// get units of AB-
	@Query(value = "select sum(units) from available_blood where blood_group = AB-;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableABNegativeUnits();

	// get units of O+
	@Query(value = "select sum(units) from available_blood where blood_group = O+;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableOPostiveUnits();

	// get units of O-
	@Query(value = "select sum(units) from available_blood where blood_group = O-;", nativeQuery = true)
	public Set<AvailableBlood> getAvailableONegativeUnits();


}
