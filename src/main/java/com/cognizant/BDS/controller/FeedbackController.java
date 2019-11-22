package com.cognizant.BDS.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.BDS.model.Feedback;
import com.cognizant.BDS.service.FeedbackService;

public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;

	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	@RequestMapping(value="/feedback")
	public ResponseEntity<Set<Feedback>> getAllFeedbacks(){
		return new ResponseEntity<Set<Feedback>>(feedbackService.getAllFeedbacks(),HttpStatus.OK);
	}

}
