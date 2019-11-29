package com.cognizant.BDS.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.model.Feedback;
import com.cognizant.BDS.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	public FeedbackService(FeedbackRepository feedbackRepository) {
		super();
		this.feedbackRepository = feedbackRepository;
	}
	
	public Set<Feedback> getAllFeedbacks(){
		return feedbackRepository.getAllFeedbacks();
	}
	
	public int addFeedback(Feedback feedback){
		//get id of the particular city
		int city_id = feedbackRepository.getCity(feedback.getCity());
		//pass the feedback value with city_id
		return feedbackRepository.addFeedback(feedback.getHospitalName(),city_id,feedback.getComment(),feedback.getUserId());
	}
}
