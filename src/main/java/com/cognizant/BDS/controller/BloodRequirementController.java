package com.cognizant.BDS.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.BDS.model.BloodRequirement;
import com.cognizant.BDS.service.BloodRequirementService;

@RestController
public class BloodRequirementController {
	@Autowired
	private BloodRequirementService bloodRequirementService;
	
	public BloodRequirementController()
	{}


	@RequestMapping(value="/bloodRequirement")
	public ResponseEntity<Set<BloodRequirement>> getAllBloodRequirement(){
		return new ResponseEntity<Set<BloodRequirement>>(bloodRequirementService.getAllBloodRequirement(),HttpStatus.OK);
	}
	
}
