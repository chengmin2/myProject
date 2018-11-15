package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.LoginUsers;

public interface LoginUsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(LoginUsers record);

    int insertSelective(LoginUsers record);

    LoginUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginUsers record);

    int updateByPrimaryKey(LoginUsers record);
}