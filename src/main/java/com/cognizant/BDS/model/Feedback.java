package com.cognizant.BDS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
@SecondaryTable(name="city")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedback_id")
	private int feedbackId;
	@Column(name = "hospital_name")
	private String hospitalName;
	@Column(name = "city",table = "city")
	private String city;
	@Column(name = "comments")
	private String comment;
	@Column(name = "user_id")
	private int userId;
	
	public Feedback(int feedbackId, String hospitalName, String city, String comment, int userId) {
		super();
		this.feedbackId = feedbackId;
		this.hospitalName = hospitalName;
		this.city = city;
		this.comment = comment;
		this.userId = userId;
	}
	
	public Feedback() {
		
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
	
}
