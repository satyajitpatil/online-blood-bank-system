package com.cognizant.BDS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "blood_request_from_bank_mapping")
public class MyRequestFromBloodBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mapping_id")
	private long id;
	@Column(name = "available_blood_id")
	private int availableBloodId;
	@JoinColumn(name = "available_blood_id")
	private String bloodGroup;
	@JoinColumn(name = "blood_bank_id")
	private String bloodBankName;
	@Column(name = "is_approved")
	private boolean isApproved;
	@Column(name = "is_rejected")
	private boolean isRejected;
	@Column(name = "is_pending")
	private boolean isPending;

	public MyRequestFromBloodBank(long id, int availableBloodId, String bloodGroup, String bloodBankName,
			boolean isApproved, boolean isRejected, boolean isPending) {
		super();
		this.id = id;
		this.availableBloodId = availableBloodId;
		this.bloodGroup = bloodGroup;
		this.bloodBankName = bloodBankName;
		this.isApproved = isApproved;
		this.isRejected = isRejected;
		this.isPending = isPending;
	}

	public MyRequestFromBloodBank() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAvailableBloodId() {
		return availableBloodId;
	}

	public void setAvailableBloodId(int availableBloodId) {
		this.availableBloodId = availableBloodId;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public boolean isRejected() {
		return isRejected;
	}

	public void setRejected(boolean isRejected) {
		this.isRejected = isRejected;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

	@Override
	public String toString() {
		return "MyRequestFromBloodBank [id=" + id + ", availableBloodId=" + availableBloodId + ", bloodGroup="
				+ bloodGroup + ", bloodBankName=" + bloodBankName + ", isApproved=" + isApproved + ", isRejected="
				+ isRejected + ", isPending=" + isPending + "]";
	}

	
	
	

}
