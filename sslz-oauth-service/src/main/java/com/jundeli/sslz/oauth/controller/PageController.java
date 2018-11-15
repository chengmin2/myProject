package com.jundeli.sslz.oauth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 页面控制器
 * @date 2018年09月29日  上午9:22
 * @address: 四川成都
 */
@Controller
public class PageController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, authentication);
        response.sendRedirect("/index");
        //response.sendRedirect(request.getHeader("referer"));
    }
}
