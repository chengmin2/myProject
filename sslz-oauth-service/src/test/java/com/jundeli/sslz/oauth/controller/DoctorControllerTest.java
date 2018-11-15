package com.jundeli.sslz.oauth.controller;

import com.alibaba.fastjson.JSON;
import com.jundeli.sslz.oauth.dto.DoctorDto;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月12日  下午1:47
 * @address: 四川成都
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorControllerTest {
    @Resource
    private DoctorController controller;

    @Test
    public void getDoctorList() {
        ResultProtocol doctorList = controller.getDoctorList(DoctorDto.builder().departmentId(BigInteger.valueOf(1)).hospitalId(BigInteger.valueOf(1)).build());
        System.out.println(JSON.toJSONString(doctorList));
        Assert.assertTrue(doctorList.getSuccess());
        Assert.assertEquals(doctorList.getCode(), 200);
    }
}