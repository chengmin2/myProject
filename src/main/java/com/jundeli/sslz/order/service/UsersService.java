package com.jundeli.sslz.order.service;

import com.jundeli.sslz.order.model.Users;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

public interface UsersService {
    /**
     * 添加新用户/修改用户信息
     * @param users
     * @returns
     */
    ResultProtocol insertOrUpdateUsers(Users users) throws  Exception;
}
