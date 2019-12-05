package com.cognizant.BDS.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.model.BloodRequirement;
import com.cognizant.BDS.repository.BloodRequirementRepository;

@Service
public class BloodRequirementService {
	@Autowired
	private BloodRequirementRepository bloodRequirementRepository;

	public BloodRequirementService(BloodRequirementRepository bloodRequirementRepository) {
		super();
		this.bloodRequirementRepository = bloodRequirementRepository;
	}
	
	public Set<BloodRequirement> getAllBloodRequirement(){
		return bloodRequirementRepository.getAllBloodRequirement();
	}
	
	public Set<BloodRequirement> getBloodRequirementByStateAndAreaAndBloodGroup(String state, String area, int pincode, String bloodGroup){
		int stateId = bloodRequirementRepository.getStateIdByStateName(state);
		return bloodRequirementRepository.getBloodRequirementByStateAndAreaAndBloodGroup(stateId, area, pincode, bloodGroup);
	}
}
