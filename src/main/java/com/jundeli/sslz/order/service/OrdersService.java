package com.jundeli.sslz.order.service;

import com.jundeli.sslz.order.model.Orders;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

import java.util.List;

public interface OrdersService {
    /**
     * 获取用户订单列表
     * @param userId
     * @return
     */
    ResultProtocol getOrdersServiceList(Long userId) throws Exception;

    /**
     * 新增订单
     * @param orders
     * @return
     */
    ResultProtocol insertOrUpdateOrder(Orders orders) throws  Exception;
}
