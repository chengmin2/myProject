package com.jundeli.sslz.hospital.controller;

import com.jundeli.sslz.hospital.model.Hospital;
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
 * @description: 医院控制器测试类
 * @date 2018年10月10日  下午2:41
 * @address: 四川成都
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HospitalControllerTest {
    @Resource
    private HospitalController controller;

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 添加医院测试用例
     * @date 2018年10月11日 上午9:08
     * @address: 四川成都
     */
    @Test
    public void insert() {
        Hospital hospital = new Hospital();
        hospital.setAddress("泸州龙马潭区");
        hospital.setName("泸州医学院");
        ResultProtocol resultProtocol = controller.insertHospital(hospital);
        Assert.assertTrue(resultProtocol.getSuccess());
        Assert.assertEquals(resultProtocol.getCode(), 200);
    }

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 查询医院测试用例
     * @date 2018年10月11日 上午9:08
     * @address: 四川成都
     */

    @Test
    public void allHospital() {
        ResultProtocol resultProtocol = controller.allHospital();
        System.out.println(resultProtocol);
        Assert.assertTrue(resultProtocol.getSuccess());
        Assert.assertEquals(resultProtocol.getCode(), 200);
    }
    /**
      * @author zhm  赵何明
      * @time 2018年10月11日 15:23
      * @version V1.0
      * @description 医院介绍测试
      */

    @Test
    public void hospitalIntroduce(){
        ResultProtocol resultProtocol =controller.hospitalIntroduce(1);
    }
    /**
      * @author zhm  赵何明
      * @time 2018年10月11日 15:53
      * @version V1.0
      * @description 通过名字找医院测试
      */

    @Test
    public void queryHospitalByName(){
        ResultProtocol resultProtocol=controller.queryHospitalByName("泸州医学院");
    }

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 删除医院测试用例
     * @date 2018年10月11日 上午9:09
     * @address: 四川成都
     */

    @Test
    public void deleteHospital() {
        ResultProtocol resultProtocol = controller.deleteHospital(2);
        Assert.assertTrue(resultProtocol.getSuccess());
        Assert.assertEquals(resultProtocol.getCode(), 200);
    }

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 修改医院测试用例
     * @date 2018年10月11日 上午9:09
     * @address: 四川成都
     */

    @Test
    public void updateHospital() {
        Hospital hospital = new Hospital();
        hospital.setId(BigInteger.valueOf(1));
        hospital.setName("泸州医学院");
        hospital.setQuantity("123");
        ResultProtocol resultProtocol = controller.updateHospital(hospital);
        Assert.assertTrue(resultProtocol.getSuccess());
        Assert.assertEquals(resultProtocol.getCode(), 200);
    }
    @Test
     public void allHospitalOrderByDesc(){
        ResultProtocol resultProtocol = controller.allHospitalOrderByDesc();
    }
}