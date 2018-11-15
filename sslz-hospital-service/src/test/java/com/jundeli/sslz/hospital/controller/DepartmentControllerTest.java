package com.jundeli.sslz.hospital.controller;

import com.jundeli.sslz.hospital.model.Dpartment;
import com.jundeli.sslz.hospital.model.HospitalDpartment;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @author zhm  赵何明
 * @version V1.0
 * @time 2018年10月12日 10:22
 * @description 科室控制器测试类
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentControllerTest {
    @Resource
    private DepartmentController departmentController;

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 10:24
     * @version V1.0
     * @description 通过医院名字查询科室测试
     */
    @Test
    public void queryByHospitalName() {
        ResultProtocol resultProtocol = departmentController.queryByHospitalName("泸州医学院");
    }

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 13:13
     * @version V1.0
     * @description 给医院添加科室测试
     */
    @Test
    public void insertHospitalDepartment() {
        Dpartment dpartment = new Dpartment();
        dpartment.setName("测试科");
        departmentController.insertHospitalDepartment(BigInteger.valueOf(1), dpartment);
    }
    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 14:13
     * @version V1.0
     * @description 删除医院科室
     */
    @Test
    public void deleteHospitalDepartment(){
        HospitalDpartment hospitalDpartment=new HospitalDpartment();
        hospitalDpartment.setHplId(BigInteger.valueOf(1));
        hospitalDpartment.setDptId(BigInteger.valueOf(19));
        departmentController.deleteHospitalDepartment(hospitalDpartment);

    }
}
