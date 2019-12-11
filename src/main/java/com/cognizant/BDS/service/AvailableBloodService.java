package com.cognizant.BDS.service;

import com.cognizant.BDS.repository.AvailableBloodRepository;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.BDS.model.AvailableBlood;

@Service
public class AvailableBloodService {
	
	@Autowired
	private AvailableBloodRepository availableBloodRepository;

	public AvailableBloodService() {
		
	}
	
	public Set<AvailableBlood> getAvailableBlood(){
		//System.out.println(availableBloodRepository.getAvailableBlood());
		return availableBloodRepository.getAvailableBlood();
	}	
	
	
	//get blood units for admin
	public Integer getAvailableBloodByBloodGroupForAdmin(String bloodGroup) {
		Integer sum = 0;
		if(bloodGroup.equals("ALL")) {
			sum = availableBloodRepository.getAvailableBloodByAllBloodGroupForAdmin();		
			if(sum!=null) {
				return sum;
			}
			else {
				sum = 0;
			}
		}
		else {
			sum = availableBloodRepository.getAvailableBloodByBloodGroupForAdmin(bloodGroup);		
			if(sum!=null) {
				return sum;
			}
			else {
				sum = 0;
			}
		}
				
		return sum;
	}
	
	//by all
	public Set<AvailableBlood> getAvailableBloodByStateAndAreaAndBloodGroup(String state, String area, int pincode, String bloodGroup){
		int stateId = availableBloodRepository.getStateIdByStateName(state);
		return availableBloodRepository.getAvailableBloodByStateAndAreaAndBloodGroup(stateId, area, pincode, bloodGroup);
	}
	//by state
	public Set<AvailableBlood> getAvailableBloodByState(String state){
		int stateId = availableBloodRepository.getStateIdByStateName(state);
		return availableBloodRepository.getAvailableBloodByState(stateId);
	}
	
	//by bloodGroup
	public Set<AvailableBlood> getAvailableBloodByBloodGroup(String bloodGroup){
		return availableBloodRepository.getAvailableBloodByBloodGroup(bloodGroup);
	}
	
	//by state and area
	public Set<AvailableBlood> getAvailableBloodByStateAndArea(String state, String area){
		int stateId = availableBloodRepository.getStateIdByStateName(state);
		return availableBloodRepository.getAvailableBloodByStateAndArea(stateId, area);
	}
	
	
}
