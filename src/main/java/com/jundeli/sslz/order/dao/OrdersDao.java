package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.Orders;

import java.util.List;

public interface OrdersDao {
    int deleteByPrimaryKey(Long id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * 查询用户订单
     * @param userId
     * @return
     */
    List<Orders> getOrdersByUserId(Long userId);


}