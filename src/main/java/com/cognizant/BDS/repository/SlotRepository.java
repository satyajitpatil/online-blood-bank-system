package com.cognizant.BDS.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.BDS.model.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {

		@Query(value = "SELECT slot.slot_id,slot.hospital_name,city.city," + 
				"slot.date,slot.time,slot.donor_id "+
				"FROM slot, city " + 
				"WHERE slot.city_id = city.id;", nativeQuery = true)
		public Set<Slot> getAllSlot();
		
		@Query(value = "SELECT id from city where city=?;",nativeQuery = true)
		public int getCityIdByCityName(String cityName);
		
		@Query(value = "select count(slot.slot_id) from slot where slot.hospital_name=:hospitalName and slot.city_id=:cityId  and slot.date=:date and slot.time =:time")
		public int getCountOfSlotByInput(String hospitalName, int cityId, LocalDate date, LocalTime time);
		
	}

	

