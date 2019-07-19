package com.web.daos;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.bean.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User login(@Param("userName") String userName,@Param("password") String password);

	List<User> listUser(@Param("startLine") int startLine);

	int countAll();
}