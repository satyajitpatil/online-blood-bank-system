package com.cognizant.BDS.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.BDS.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "SELECT user.user_id, "
			+ "user.user_name, "
			+ "user.first_name, "
			+ "user.last_name, "
			+ "user.age, "
			+ "user.gender, "
			+ "user.contact_number, "
			+ "user.email, "
			+ "user.password, "
			+ "user.weight, "
			+ "state.state, "
			+ "user.area, "
			+ "user.pincode, "
			+ "user.blood_group "
			+ "FROM user,state "
			+ "WHERE user.state_id = state.state_id AND user_name=?;", nativeQuery = true)
	Optional<User> findUserByUsername(String username);
	
}
