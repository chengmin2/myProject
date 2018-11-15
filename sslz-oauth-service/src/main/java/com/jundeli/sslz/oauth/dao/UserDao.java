package com.jundeli.sslz.oauth.dao;

import com.jundeli.sslz.oauth.dto.UserDto;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用户数据操作接口
 * @date 2018年10月09日  上午11:54
 * @address: 四川成都
 */
public interface  UserDao {
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
    UserDto generalUserLogin(UserDto dto);

    /**
     * 查询用户信息
     *
     * @param dto 查询条件
     * @return 用户信息
     * @author yxl 余秀良
     * @version 1.0
     * @description: 查询用户信息
     * @date 2018年10月11日 下午3:56
     * @address: 四川成都
     */
    UserDto selectUserInfo(UserDto dto);
}
