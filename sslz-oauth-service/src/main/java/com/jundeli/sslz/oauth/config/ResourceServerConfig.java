package com.jundeli.sslz.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年09月19日  下午3:53
 * @address: 四川成都
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
                .antMatchers("/user/**", "/doctor/**")
                .and()
                .authorizeRequests()
                .antMatchers("/user/login", "/doctor/list").permitAll()
                .anyRequest().authenticated();
    }
}
