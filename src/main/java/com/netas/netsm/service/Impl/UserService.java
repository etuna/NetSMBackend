package com.netas.netsm.service.Impl;

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

		User user = new User();
		
		
		
		return null;
	}

	@Override
	public Result delUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
