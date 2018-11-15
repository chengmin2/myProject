package com.jundeli.sslz.oauth.support;


import com.jundeli.sslz.oauth.dto.UserDto;
import com.jundeli.sslz.oauth.service.UserService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: UserDetailsService实现类
 * @date 2018年09月29日 下午4:43
 * @address: 四川成都
 */
@Service("loginService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource(name = "userService")
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) {
        ResultProtocol resultProtocol = userService.selectUser(UserDto.builder().username(username).build());
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        UserDto user = resultProtocol.getData();
        if (user != null) {
            String roles = user.getRoleName();
            String[] roleList = roles.split(",");
            for (String role : roleList) {
                authorities.add(new SimpleGrantedAuthority(role));
            }
            return new User(user.getUsername(), user.getPassword(), authorities);
        } else {
            throw new UsernameNotFoundException(username);
        }
    }
}
