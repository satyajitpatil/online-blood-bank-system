package com.cognizant.BDS.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.BDS.model.Feedback;
import com.cognizant.BDS.repository.FeedbackRepository;

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
}
