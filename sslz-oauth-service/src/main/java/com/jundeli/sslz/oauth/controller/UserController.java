package com.jundeli.sslz.oauth.controller;

import com.jundeli.sslz.oauth.dto.UserDto;
import com.jundeli.sslz.oauth.service.UserService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.Principal;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用户控制器
 * @date 2018年10月11日  下午4:25
 * @address: 四川成都
 */
@RestController
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 登录
     * @date 2018年05月09日 上午9:25
     * @address: 四川成都
     */
    @PostMapping("user/login")
    public ResultProtocol generalUserLogin(@RequestBody UserDto dto) {
        return userService.generalUserLogin(dto);
    }

    /**
     * 获取授权用户的信息
     *
     * @param user 当前用户
     * @return 授权信息
     */
    @RequestMapping("user/info")
    public Principal user(Principal user) {
        return user;
    }
}
