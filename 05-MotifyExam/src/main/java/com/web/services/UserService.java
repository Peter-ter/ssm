package com.web.services;


import java.util.List;

import com.web.bean.User;

public interface UserService {

	User getUserById(int userId);
	User login(String userName,String password);
	List<User> listUser(int startLine);
	int countAll();
	void delect(int userId);
	User find(Integer valueOf);
	void update(User user);
	void insert(User user);
	
}
