package com.web.daos;

import org.apache.ibatis.annotations.Param;

import com.web.beans.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);
    
    User selectByUserNameAndPassword(@Param("userName") String userName,@Param("password") String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}