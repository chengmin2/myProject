package com.jundeli.sslz.oauth.config;

import com.jundeli.sslz.oauth.config.bean.RabbitmqBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: rabbitmq　配置
 * @date 2018年08月24日  上午10:32
 * @address: 四川成都
 */
@Configuration
public class RabbitmqConfig {
    private static final Logger logger = LoggerFactory.getLogger(RabbitmqConfig.class);
    @Resource
    private RabbitmqBean rabbitmqBean;

    @Bean(name = "connectionFactory")
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(rabbitmqBean.getHost());
        connectionFactory.setPort(rabbitmqBean.getPort());
        connectionFactory.setUsername(rabbitmqBean.getUsername());
        connectionFactory.setPassword(rabbitmqBean.getPassword());

        return connectionFactory;
    }

    /*@Bean
    public AmqpAdmin amqpAdmin() {
        return new RabbitAdmin(connectionFactory());
    }*/

}
