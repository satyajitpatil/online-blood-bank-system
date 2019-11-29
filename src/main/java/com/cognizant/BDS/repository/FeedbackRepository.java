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
	
	@Query(value = "SELECT id from city where city=:city;")
	public int getCity(String city);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO feedback (hospital_name, city_id, comments, user_id) values(:hospitalName,:city_id,:comments,:userId);", nativeQuery = true)
	int addFeedback(String hospitalName, int city_id , String comments, int userId);
	
}