package com.jundeli.sslz.order.service.impl;

import com.jundeli.sslz.order.dao.OrdersDao;
import com.jundeli.sslz.order.model.Orders;
import com.jundeli.sslz.order.service.OrdersService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public class OrdersServiceImpl implements OrdersService {

    @Resource
    OrdersDao ordersDao;
    @Override
    public ResultProtocol getOrdersServiceList(Long userId) {
        try {
            if(userId==0l){
                return  ErrorProtocol.E_400;
            }
            List<Orders> ordersList = ordersDao.getOrdersByUserId(userId);
            return ResultProtocol.builder().code(200).success(true).message("返回数据").data(ordersList).build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }

    @Override
    public ResultProtocol insertOrUpdateOrder(Orders orders) {
        try {
            boolean isOk = false;//返回结果
            if(orders==null){
            return ErrorProtocol.E_400;
        }else if(orders.getId() == null){ //新增
                orders.setCreateTime(new Date());
                isOk  = ordersDao.insertSelective(orders)>0;
        }else if(orders.getId() != null){ //修改
                isOk = ordersDao.updateByPrimaryKeySelective(orders)>0;
            }
            return  ResultProtocol.builder().code(isOk?200:500).success(isOk).message(isOk?"操作成功":"操作失败").build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }
}
