package com.jundeli.sslz.oauth.service.impl;

import com.jundeli.sslz.oauth.dao.UserDao;
import com.jundeli.sslz.oauth.dto.UserDto;
import com.jundeli.sslz.oauth.service.UserService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import com.jundeli.sslz.tool.string.StringUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午4:56
 * @address: 四川成都
 */
@Transactional(readOnly = true, rollbackFor = {Exception.class})
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 查询用户信息
     * @date 2018年10月10日 上午9:35
     * @address: 四川成都
     */
    @Override
    public ResultProtocol selectUser(UserDto dto) {
        if (dto != null) {
            UserDto userDto = userDao.selectUserInfo(dto);
            return ResultProtocol.builder().data(userDto).success(userDto != null).message(userDto != null ? "查询成功" : "该用户不存在").build();
        } else {
            return ErrorProtocol.E_400;
        }
    }

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
    @Override
    public ResultProtocol generalUserLogin(UserDto dto) {
        if (dto != null) {
            String username = dto.getUsername();
            String password = dto.getPassword();
            if (StringUtil.isEmpty(username)) {
                return ResultProtocol.builder().code(400).message("用户名不能为空").build();
            }
            if (StringUtil.isEmpty(password)) {
                return ResultProtocol.builder().code(400).message("密码不能为空").build();
            }
            UserDto userDto = userDao.selectUserInfo(dto);
            if (userDto != null) {
                boolean matches = passwordEncoder().matches(password, userDto.getPassword());
                if (!matches) {
                    return ResultProtocol.builder().code(401).message("密码不正确").build();
                } else {
                    //这里设置前端需要的返回信息，如果返回用户id请加密后返回，防止被攻击
                    return ResultProtocol.builder().data(UserDto.builder().username(username).build()).success(true).build();
                }
            }
            return ResultProtocol.builder().code(403).message("该用户不存在").build();
        } else {
            return ErrorProtocol.E_400;
        }
    }

    private BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
