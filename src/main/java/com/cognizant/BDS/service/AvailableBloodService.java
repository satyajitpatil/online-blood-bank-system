package com.cognizant.BDS.service;

import com.cognizant.BDS.repository.AvailableBloodRepository;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.model.AvailableBlood;

@Service
public class AvailableBloodService {
	
	@Autowired
	private AvailableBloodRepository availableBloodRepository;

	public AvailableBloodService() {
		
	}
	
	public Set<AvailableBlood> getAvailableBlood(){
		return null;
	}
	
	
}
