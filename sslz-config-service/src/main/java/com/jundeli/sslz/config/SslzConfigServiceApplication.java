package com.jundeli.sslz.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 配置中心主入口
 * @date 2018年10月08日 下午1:45
 * @address: 四川成都
 */
@EnableConfigServer
@SpringBootApplication
public class SslzConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslzConfigServiceApplication.class, args);
    }
}
