package com.cognizant.BDS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public UserService() {
		
	}
	
	public Integer getCountOfDonors() {
		return userRepository.getCountOfDonors();				
	}
	
	
}
