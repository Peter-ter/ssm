package com.web.services;

import com.web.beans.User;

public interface UserService {

	User getUserById(int userId);
	
	User getByUserNameAndPassword(String userName, String password);

}
