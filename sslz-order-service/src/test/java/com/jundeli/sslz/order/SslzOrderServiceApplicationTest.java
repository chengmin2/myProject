package com.jundeli.sslz.order;

import com.jundeli.sslz.order.controller.OrderController;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan({"com.jundeli.sslz.order.dao.*","com.jundeli.sslz.order.service.*"})
@SpringBootTest
public class SslzOrderServiceApplicationTest {
    @Test
    public void contextLoads() throws Exception {
        System.out.println("啊哈哈");
        OrderController o = new OrderController();
        ResultProtocol resultProtocol = o.getOrderList(1l);
        System.out.println("测试getOrderList接口");
    }
}