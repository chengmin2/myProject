package com.jundeli.sslz.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:28
 * @address: 四川成都
 */
@EnableTransactionManagement
@MapperScan("com.jundeli.sslz.order.dao")
@SpringBootApplication
public class SslzOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzOrderServiceApplication.class, args);
    }
}
