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
	
	public Integer getAvailableBloodByBloodGroupForAdmin(String bloodGroup) {
		Integer sum = availableBloodRepository.getAvailableBloodByBloodGroupForAdmin(bloodGroup);
		
		if(sum!=null) {
			return sum;
		}
		else {
			sum = 0;
		}
		
		return sum;
	}
	
	
	public Set<AvailableBlood> getAvailableBloodByStateAndAreaAndBloodGroup(String state, String area, int pincode, String bloodGroup){
		int stateId = availableBloodRepository.getStateIdByStateName(state);
		return availableBloodRepository.getAvailableBloodByStateAndAreaAndBloodGroup(stateId, area, pincode, bloodGroup);
	}
	
	
}
