package com.jundeli.sslz.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:34
 * @address: 四川成都
 */
@EnableTransactionManagement
@MapperScan("com.jundeli.sslz.hospital.dao")
@SpringBootApplication
public class SslzHospitalServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzHospitalServiceApplication.class, args);
    }
}
