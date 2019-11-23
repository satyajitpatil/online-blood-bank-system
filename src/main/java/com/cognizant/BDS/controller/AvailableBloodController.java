package com.cognizant.BDS.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.BDS.model.AvailableBlood;
import com.cognizant.BDS.service.AvailableBloodService;

@RestController
public class AvailableBloodController {
	
	@Autowired
	private AvailableBloodService availableBloodService;

	public AvailableBloodController() {
	}
	
	@RequestMapping(value="/availableblood")
	public ResponseEntity<Set<AvailableBlood>> getAllAvailableBlood(){
		return new ResponseEntity<Set<AvailableBlood>>(availableBloodService.getAvailableBlood(),HttpStatus.OK);
	}

}
