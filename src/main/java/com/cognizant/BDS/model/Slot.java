package com.cognizant.BDS.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Slot {
	private int slotId;
	private String hospitalName;
	private String city;
	private LocalDate date;
	private LocalTime time;
	private int donorId;
	
	public Slot(int slotId, String hospitalName, String city, LocalDate date, LocalTime time, int donorId) {
		super();
		this.slotId = slotId;
		this.hospitalName = hospitalName;
		this.city = city;
		this.date = date;
		this.time = time;
		this.donorId = donorId;
	}

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}
	
	
	
	
	
	
}
