package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.BDS.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {

		@Query(value = "SELECT slot.slot_id,slot.hospital_name,city.city," + 
				"slot.date,slot.time,slot.donor_id "+
				"FROM slot " + 
				"INNER JOIN city ON" +
				" slot.city_id = city.id;", nativeQuery = true)
		public Set<Slot> getAllSlot();
		
	}

	

