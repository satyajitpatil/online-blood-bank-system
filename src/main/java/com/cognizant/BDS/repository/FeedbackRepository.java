package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.BDS.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
	@Query(value = "Select feedback_id,hospital_name,city_id,comments,user_id FROM feedback;", nativeQuery = true)
	public Set<Feedback> getAllFeedbacks();
	
}
