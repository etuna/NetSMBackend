package com.netas.netsm.service.Spec;

import com.netas.netsm.model.*;

public interface IUserService {
	public User authenticate(String username, String password);

	public Result delUser(String id);

	public Result addUser(User user);
}
