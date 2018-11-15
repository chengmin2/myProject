package com.jundeli.sslz.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 注册中心主入口
 * @date 2018年10月08日  下午4:16
 * @address: 四川成都
 */
@EnableEurekaServer
@SpringBootApplication
public class SslzRegistryServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzRegistryServiceApplication.class, args);
    }
}
