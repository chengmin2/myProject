package com.jundeli.sslz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午1:58
 * @address: 四川成都
 */
@EnableZuulProxy
@SpringBootApplication
public class SslzApiGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzApiGatewayApplication.class, args);
    }
}
