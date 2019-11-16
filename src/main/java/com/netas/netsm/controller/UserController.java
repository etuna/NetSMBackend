package com.netas.netsm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.netas.netsm.model.Result;
import com.netas.netsm.model.User;
import com.netas.netsm.service.Impl.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping("authenticate")
	public User authenticateUser(@RequestBody String username, @RequestBody String password) {
		return userService.authenticate(username, password);
	}
	
	@GetMapping("delete")
	public Result delUser(@RequestParam("id") String id) {
		return userService.delUser(id);
	}
	
	@PostMapping("add")
	public Result addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	
	
}
