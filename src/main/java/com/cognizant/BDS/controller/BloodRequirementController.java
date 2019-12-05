package com.cognizant.BDS.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.BDS.model.BloodRequirement;
import com.cognizant.BDS.service.BloodRequirementService;

@RestController
@RequestMapping(value="/bloodRequirement")
public class BloodRequirementController {
	@Autowired
	private BloodRequirementService bloodRequirementService;
	
	public BloodRequirementController()
	{}


	@RequestMapping()
	public ResponseEntity<Set<BloodRequirement>> getAllBloodRequirement(){
		return new ResponseEntity<Set<BloodRequirement>>(bloodRequirementService.getAllBloodRequirement(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/{state}/{area}/{pincode}/{bloodGroup}")
	public ResponseEntity<Set<BloodRequirement>> getBloodRequirementByStateAndAreaAndBloodGroup(@PathVariable("state") String state, @PathVariable("area") String area, @PathVariable("pincode") int pincode, @PathVariable("bloodGroup") String bloodGroup){
		return new ResponseEntity<Set<BloodRequirement>>(bloodRequirementService.getBloodRequirementByStateAndAreaAndBloodGroup(state, area, pincode, bloodGroup),HttpStatus.OK);
	}
	
}
