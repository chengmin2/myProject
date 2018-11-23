package com.jundeli.sslz.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:28
 * @address: 四川成都
 */
@MapperScan("com.jundeli.sslz.order.dao")
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SslzOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SslzOrderServiceApplication.class, args);
    }

/*    @Bean
    @LoadBalanced
    RestTemplate rest() {
        return new RestTemplate();
    }*/

    /*@RestController
    class HelloController {
        @Autowired
        private RestTemplate restTemplate;

        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String hello() {
            return restTemplate.getForEntity("http://sslz-order-service/hello", String.class).getBody();
        }
    }*/
}
