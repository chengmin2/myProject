package com.jundeli.sslz.hospital.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @author zhm  赵何明
 * date: 2018/10/16 13:11
 * @version V1.0
 * Description:医生控制器测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorTest {
    @Resource
    private DoctorController doctorController;
    /**
     * @author zhm  赵何明
     * @time 2018年10月16日 13:16
     * @version V1.0
     * @description 查询医院科室下的医生
     */
    @Test
    public  void queryAllDoctor(){
        doctorController.queryAllDoctor(BigInteger.valueOf(1),BigInteger.valueOf(1));
    }
    /**
     * @author zhm  赵何明
     * @time 2018年10月16日 16:14
     * @version V1.0
     * @description 根据id查看医生详情
     */
    @Test
    public void queryDoctorInfoById(){
        doctorController.queryDoctorInfoById(BigInteger.valueOf(1));
    }

}
