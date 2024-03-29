package com.cognizant.BDS.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.BDS.model.AvailableBlood;
import com.cognizant.BDS.service.AvailableBloodService;

@RestController
@RequestMapping(value = "/availableblood")
public class AvailableBloodController {

	@Autowired
	private AvailableBloodService availableBloodService;

	public AvailableBloodController() {
	}

	@RequestMapping()
	public ResponseEntity<Set<AvailableBlood>> getAllAvailableBlood() {
		return new ResponseEntity<Set<AvailableBlood>>(availableBloodService.getAvailableBlood(), HttpStatus.OK);
	}

	// this function is for admin
	@GetMapping(value = "/forAdmin/{bloodGroup}")
	public ResponseEntity<Integer> getAvailableBloodByBloodGroupForAdmin(
			@PathVariable("bloodGroup") String bloodGroup) {
		return new ResponseEntity<Integer>(availableBloodService.getAvailableBloodByBloodGroupForAdmin(bloodGroup),
				HttpStatus.OK);
	}

	// by all
	@GetMapping(value = "/sapb/{state}/{area}/{pincode}/{bloodGroup}")
	public ResponseEntity<Set<AvailableBlood>> getAvailableBloodByStateAndAreaAndBloodGroup(
			@PathVariable("state") String state, @PathVariable("area") String area,
			@PathVariable("pincode") int pincode, @PathVariable("bloodGroup") String bloodGroup) {
		return new ResponseEntity<Set<AvailableBlood>>(
				availableBloodService.getAvailableBloodByStateAndAreaAndBloodGroup(state, area, pincode, bloodGroup),
				HttpStatus.OK);
	}

	// by state
	@GetMapping(value = "/s/{state}")
	public ResponseEntity<Set<AvailableBlood>> getAvailableBloodByState(@PathVariable("state") String state) {
		return new ResponseEntity<Set<AvailableBlood>>(availableBloodService.getAvailableBloodByState(state),
				HttpStatus.OK);
	}

	// by bloodGroup
	@GetMapping(value = "/b/{bloodGroup}")
	public ResponseEntity<Set<AvailableBlood>> getAvailableBloodByBloodGroup(
			@PathVariable("bloodGroup") String bloodGroup) {
		return new ResponseEntity<Set<AvailableBlood>>(availableBloodService.getAvailableBloodByBloodGroup(bloodGroup),
				HttpStatus.OK);
	}
	
	//by state and area
		@GetMapping(value = "/sa/{state}/{area}")
		public ResponseEntity<Set<AvailableBlood>> getAvailableBloodByStateAndArea(@PathVariable("state") String state, @PathVariable("area") String area){
			return new ResponseEntity<Set<AvailableBlood>>(availableBloodService.getAvailableBloodByStateAndArea(state, area) ,HttpStatus.OK);
		}

}
