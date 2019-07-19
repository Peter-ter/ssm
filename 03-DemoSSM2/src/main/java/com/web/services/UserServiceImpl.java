package com.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.beans.User;
import com.web.daos.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userDao;
    
    @Override
    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
