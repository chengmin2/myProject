package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.Users;

public interface UsersDao {
    int deleteByPrimaryKey(Long id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}