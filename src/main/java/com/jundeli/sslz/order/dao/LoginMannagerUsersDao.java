package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.LoginMannagerUsers;

public interface LoginMannagerUsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(LoginMannagerUsers record);

    int insertSelective(LoginMannagerUsers record);

    LoginMannagerUsers selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginMannagerUsers record);

    int updateByPrimaryKey(LoginMannagerUsers record);
}