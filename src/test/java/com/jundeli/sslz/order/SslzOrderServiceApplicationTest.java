package com.jundeli.sslz.order;

import com.jundeli.sslz.order.controller.OrderController;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月10日  下午2:24
 * @address: 四川成都
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SslzOrderServiceApplicationTest {
    @Test
    public void contextLoads() {
        System.out.println("啊哈哈");
        OrderController o = new OrderController();

    }
}