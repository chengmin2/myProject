package com.jundeli.sslz.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 认证中心主入口
 * @date 2018年10月08日  下午5:02
 * @address: 四川成都
 */
@MapperScan("com.jundeli.sslz.oauth.dao")
@EnableEurekaClient
@SpringBootApplication
public class SslzOauthServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzOauthServiceApplication.class, args);
    }
}
