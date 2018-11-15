package com.jundeli.sslz.hospital;

import com.jundeli.sslz.hospital.controller.HospitalController;
import com.jundeli.sslz.hospital.dao.HospitalDao;
import com.jundeli.sslz.hospital.model.Hospital;
import com.jundeli.sslz.hospital.service.impl.HospitalServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月10日  上午11:13
 * @address: 四川成都
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SslzHospitalServiceApplicationTest {
    @Resource
    private HospitalController controller;

    @Test
    public void contextLoads() {
        controller.allHospital();
//        Hospital hospital=new Hospital();
//        hospital.setAddress("泸州龙马潭区");
//        hospital.setName("泸州医学院");
//        controller.insertHospital(hospital);
//        controller.deleteHospital(3);
//        controller.updateHospital(4, "人民医院", "888");//没成功
    }
}