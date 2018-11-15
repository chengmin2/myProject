package com.jundeli.sslz.hospital.controller;

import com.jundeli.sslz.hospital.service.DoctorService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

/**
  * @author zhm  赵何明
  * @time 2018年10月16日 9:36
  * @version V1.0
  * @description  医生控制器
  */
@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    /**
      * @author zhm  赵何明
      * @time 2018年10月16日 10:02
      * @version V1.0
      * @description  医生列表
      */
    public ResultProtocol queryAllDoctor(BigInteger hplId,BigInteger dptId){
        return doctorService.queryAllDoctor(hplId,dptId);
    }
    /**
     * @author zhm  赵何明
     * @time 2018年10月16日 14:14
     * @version V1.0
     * @description 根据id查看医生详情
     */
    public ResultProtocol queryDoctorInfoById(BigInteger id){
        return doctorService.queryDoctorInfoById(id);
    }
}
