package com.netas.netsm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netas.netsm.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findUserByUsernameAndPassword(String username, String password);
	
	
	
	
}
