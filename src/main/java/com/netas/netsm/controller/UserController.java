package com.netas.netsm.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.netas.netsm.model.AuthRequest;
import com.netas.netsm.model.Result;
import com.netas.netsm.model.User;
import com.netas.netsm.service.Impl.UserService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("authenticate")
	public User authenticateUser(@RequestBody AuthRequest authRequest) {
		return userService.authenticate(authRequest.getUsername(), authRequest.getPassword());
	}

	@GetMapping("delete/{id}")
	public Result delUser(@PathVariable("id") String id) {
		return userService.delUser(id);
	}

	@PostMapping("add")
	public Result addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("all")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

}
