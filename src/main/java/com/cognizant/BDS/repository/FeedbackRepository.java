package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
	@Query(value = "SELECT feedback.feedback_id,feedback.hospital_name,city.city,feedback.comments,feedback.user_id " + 
			"FROM feedback " + 
			"INNER JOIN city " + 
			"ON feedback.city_id = city.id;", nativeQuery = true)
	public Set<Feedback> getAllFeedbacks();
	
}
