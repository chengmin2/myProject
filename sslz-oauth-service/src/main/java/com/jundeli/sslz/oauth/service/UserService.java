package com.jundeli.sslz.oauth.service;

import com.jundeli.sslz.oauth.dto.UserDto;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用户相关逻辑接口
 * @date 2018年10月09日  下午4:56
 * @address: 四川成都
 */
public interface UserService {
    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 查询用户信息
     * @date 2018年10月10日 上午9:35
     * @address: 四川成都
     */
    ResultProtocol selectUser(UserDto dto);

    /**
     * 普通用户登录
     *
     * @param dto 包含用户名密码
     * @return 用户信息
     * @author yxl 余秀良
     * @version 1.0
     * @description: 普通用户登录
     * @date 2018年10月11日 下午3:42
     * @address: 四川成都
     */
    ResultProtocol generalUserLogin(UserDto dto);
}
