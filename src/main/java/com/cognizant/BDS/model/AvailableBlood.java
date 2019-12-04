package com.cognizant.BDS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "available_blood")
public class AvailableBlood {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "blood_id")
	private long id;
	@Column(name = "blood_group")
	private String bloodGroup;
	@JoinColumn(name = "state_id")
	private String state;
	@Column(name = "area")
	private String area;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "contact_number")
	private long contactNumber;
	@Column(name = "units")
	private int units;
	@Column(name = "donor_id")
	private int donorId;

	public AvailableBlood() {

	}

	public AvailableBlood(long id, String bloodGroup, String state, String area, int pincode, long contactNumber,
			int units, int donorId) {
		super();
		this.id = id;
		this.bloodGroup = bloodGroup;
		this.state = state;
		this.area = area;
		this.pincode = pincode;
		this.contactNumber = contactNumber;
		this.units = units;
		this.donorId = donorId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	@Override
	public String toString() {
		return "AvailableBlood [id=" + id + ", bloodGroup=" + bloodGroup + ", state=" + state + ", area=" + area
				+ ", pincode=" + pincode + ", contactNumber=" + contactNumber + ", donorId=" + donorId + "]";
	}

}
