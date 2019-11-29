package com.cognizant.BDS.repository;

import java.util.Date;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
	@Query(value = "SELECT feedback.feedback_id,feedback.hospital_name,city.city,feedback.comments,feedback.user_id " + 
			"FROM feedback " + 
			"INNER JOIN city " + 
			"ON feedback.city_id = city.id;", nativeQuery = true)
	public Set<Feedback> getAllFeedbacks();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT feedback SET hospital_name=?,city_id=?,comments=?,user_id=?", nativeQuery = true)
	int addFeedback(String hospitalName, String city , String comments, int userId);
	
}