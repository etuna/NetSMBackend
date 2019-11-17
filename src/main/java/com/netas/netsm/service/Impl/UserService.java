package com.netas.netsm.service.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netas.netsm.dao.UserRepository;
import com.netas.netsm.model.Result;
import com.netas.netsm.model.User;
import com.netas.netsm.service.Spec.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User authenticate(String username, String password) {
		return userRepository.findUserByUsernameAndPassword(username, password);
	}

	@Override
	public Result delUser(String id) {
		userRepository.deleteById(id);
		return new Result("SUCCESS", "User succesfully deleted.");
	}

	@Override
	public Result addUser(User user) {
		UUID rand = UUID.randomUUID();
		user.setId(rand.toString());
		userRepository.save(user);
		return new Result("SUCCESS", "User succesfully added.");
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
		
	}
	

}
