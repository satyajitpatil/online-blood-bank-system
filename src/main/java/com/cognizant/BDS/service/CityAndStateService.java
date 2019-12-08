package com.cognizant.BDS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.repository.UserRepository;

@Service
public class CityAndStateService {
	
	@Autowired
	private UserRepository userRepository;
	
	/*
	 * public List<String> getAllStates(){ List<String> state =
	 * userRepository.getAllStates(); state.add("something");
	 * state.add("something1"); return state; }
	 * 
	 * public List<String> getAllCities(){ return userRepository.getAllCities(); }
	 */
}
