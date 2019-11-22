package com.cognizant.BDS.model;

public class BloodRequirement {
	private int id;
	private String bloodGroup;
	private String state;
	private String area;
	private int pincode;
	private int contactNumber;
	private int requesterId;
	
	public BloodRequirement(int id, String bloodGroup, String state, String area, int pincode, int contactNumber,
			int requesterId) {
		super();
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.state = state;
		this.area = area;
		this.pincode = pincode;
		this.contactNumber = contactNumber;
		this.requesterId = requesterId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(int requesterId) {
		this.requesterId = requesterId;
	}
	
	
	
}
