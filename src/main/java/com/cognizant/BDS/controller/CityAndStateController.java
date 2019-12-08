package com.cognizant.BDS.controller;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.BDS.service.CityAndStateService;

@RestController
@RequestMapping(value="/StatesAndCities")
public class CityAndStateController {
	
	private CityAndStateService cityAndStateService;
	
	/*
	 * @GetMapping(value="/getStates") public ResponseEntity<List<String>>
	 * getAllStates(){ return new
	 * ResponseEntity<List<String>>(cityAndStateService.getAllStates(),HttpStatus.OK
	 * ); }
	 * 
	 * @GetMapping(value="/getCities") public ResponseEntity<List<String>>
	 * getAllCities(){ return new
	 * ResponseEntity<List<String>>(cityAndStateService.getAllCities(),HttpStatus.OK
	 * ); }
	 */
}
