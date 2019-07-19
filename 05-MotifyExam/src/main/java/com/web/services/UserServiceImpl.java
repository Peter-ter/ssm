package com.web.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.bean.User;
import com.web.daos.UserMapper;


@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userDao;
    
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

	@Override
	public User login(String userName, String password) {
		return this.userDao.login(userName, password);
	}

	@Override
	public List<User> listUser(int startLine) {
		return this.userDao.listUser(startLine);
	}

	@Override
	public int countAll() {
		return this.userDao.countAll();
	}

	@Override
	public void delect(int userId) {
		this.userDao.deleteByPrimaryKey(userId);
	}

	@Override
	public User find(Integer valueOf) {
		return this.userDao.selectByPrimaryKey(valueOf);
	}

	@Override
	public void update(User user) {
		this.userDao.updateByPrimaryKeySelective(user);
	}

	@Override
	public void insert(User user) {
		this.userDao.insertSelective(user);
		
	}

	

	
}
