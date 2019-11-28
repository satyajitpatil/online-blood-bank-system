package com.cognizant.BDS.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.BDS.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT user_id,user_name,first_name,last_name,age,gender,contact_number,email,password,weight,state_id,area,pincode,blood_group FROM user WHERE user_name=?;", nativeQuery = true)
	Optional<User> findUserByUsername(String username);
	
}
