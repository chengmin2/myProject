package com.jundeli.sslz.hospital.controller;

import com.jundeli.sslz.hospital.model.Dpartment;
import com.jundeli.sslz.hospital.model.HospitalDpartment;
import com.jundeli.sslz.hospital.service.DepartmentService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * @author zhm  赵何明
 * @version V1.0
 * @time 2018年10月12日 9:35
 * @description 科室控制器
 */
@RestController
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 10:02
     * @version V1.0
     * @description 通过医院名字查找科室
     */

    @RequestMapping(value = "queryByHospitalName")
    public ResultProtocol queryByHospitalName(String name) {
        return departmentService.queryByHospitalName(name);
    }

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 10:43
     * @version V1.0
     * @description 给医院增加科室
     */

    @RequestMapping(value = "addDepartment")
    public ResultProtocol insertHospitalDepartment(BigInteger hplId, Dpartment dpartment) {
        return departmentService.insertHospitalDepartment(hplId, dpartment);
    }
    /**
      * @author zhm  赵何明
      * @time 2018年10月15日 9:53
      * @version V1.0
      * @description 删除医院科室
      */
    @RequestMapping(value = "deleteHospitalDepartment")
    public ResultProtocol deleteHospitalDepartment(HospitalDpartment hospitalDpartment){
        return departmentService.deleteHospitalDepartment(hospitalDpartment);
    }



}

