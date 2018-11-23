package com.jundeli.sslz.order.controller;

import com.jundeli.sslz.order.model.Comment;
import com.jundeli.sslz.order.model.Orders;
import com.jundeli.sslz.order.model.RegistrationRecord;
import com.jundeli.sslz.order.model.Users;
import com.jundeli.sslz.order.service.EurekaOne;
import com.jundeli.sslz.order.service.CommentService;
import com.jundeli.sslz.order.service.OrdersService;
import com.jundeli.sslz.order.service.RegistrationRecordService;
import com.jundeli.sslz.order.service.UsersService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 订单控制器
 * @date 2018年10月09日  下午1:36
 * @address: 四川成都
 */
@RestController
public class OrderController {
    @Resource
    RegistrationRecordService registrationRecordService;
    @Resource
    OrdersService ordersService;
    @Resource
    UsersService usersService;
    @Resource
    CommentService commentService;
    @Resource
    EurekaOne eurekaOne;

    /**
     * 新增/修改挂号记录信息
     * @param registrationRecord
     * @return ResultProtocol
     * @throws Exception
     */
    @RequestMapping(value="insertOrUpdateRegistration")
   public ResultProtocol  insertOrUpdateRegistration(RegistrationRecord registrationRecord) throws  Exception{
         return registrationRecordService.insertOrUpdateRegistration(registrationRecord);
   }

    /**
     * 查询用户挂号记录
     * @param userId
     * @return ResultProtocol
     * @throws Exception
     */
    @RequestMapping(value="getRegistrationList")
    public ResultProtocol getRegistrationList(Long userId) throws  Exception{
     return registrationRecordService.getRegistrationList(userId);
   }

    /**
     * 查询用户订单列表
     * @param userId
     * @return
     */
    @RequestMapping(value="order/getOrderList")
    public ResultProtocol getOrderList(Long userId) throws Exception{
        String myName =  eurekaOne.getName("chengmin");
        System.out.println(myName);
        return ordersService.getOrdersServiceList(userId);
    }
    /**
     * 查询用户订单列表
     * @param userId
     * @return
     */
    @RequestMapping(value="order/getOrderList2")
    public ResultProtocol getOrderList2(HttpServletRequest request) throws Exception{
       //Map<String, String[]> map = request.getParameterMap();
      // String[] usersId  = map.get("userId");
       long userId = 1l;//Long.parseLong(usersId[0]);
        return ordersService.getOrdersServiceList(userId);
    }
    /**
     * 新增/修改订单信息
      * @param orders
     * @return
     * @throws Exception
     */
    @RequestMapping(value="insertOrUpdateOrder")
    public ResultProtocol  insertOrUpdateOrder(Orders orders) throws Exception{
        return ordersService.insertOrUpdateOrder(orders);
    }

    /**
     * 新增/编辑用户信息
     * @param users
     * @return
     * @throws Exception
     */
    @RequestMapping(value="insertOrUpdateUser")
    public ResultProtocol  insertOrUpdateUser(Users users) throws Exception{
        return usersService.insertOrUpdateUsers(users);
    }

    /**
     * 添加评论
     * @param comment
     * @return
     * @throws Exception
     */
    @RequestMapping(value="insertComment")
    public ResultProtocol  insertComment(Comment comment) throws Exception{
        return commentService.insertComment(comment);
    }
}
