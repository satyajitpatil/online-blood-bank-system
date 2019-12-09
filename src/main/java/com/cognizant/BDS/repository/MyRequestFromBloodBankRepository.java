package com.cognizant.BDS.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.BDS.model.MyRequestFromBloodBank;

@Repository
public interface MyRequestFromBloodBankRepository extends JpaRepository<MyRequestFromBloodBank, Long>{
	
	@Query(value = "select m.mapping_id, "
			+ "m.available_blood_id, "
			+ "a.blood_group, "
			+ "b.blood_bank_name, "
			+ "m.is_approved, "
			+ "m.is_rejected, "
			+ "m.is_pending "
			+ "FROM blood_request_from_bank_mapping m "
			+ "inner join available_blood a on (a.blood_id = m.available_blood_id) " 
			+ "inner join blood_bank b on (b.blood_bank_id = m.blood_bank_id) "
			+ "where requestor_id = ?;",nativeQuery = true)
	public Set<MyRequestFromBloodBank> getMyRequests(int userId);

}
