package com.jundeli.sslz.hospital.service;

import com.jundeli.sslz.tool.protocol.ResultProtocol;

import java.math.BigInteger;

/**
 * @author zhm  赵何明
 * @time 2018年10月16日 9:36
 * @version V1.0
 * @description  医生相关逻辑接口
 */
public interface DoctorService {
    //查询医院科室的医生
    ResultProtocol queryAllDoctor(BigInteger hplId, BigInteger dptId);
    //根据id查看医生详情
    ResultProtocol queryDoctorInfoById(BigInteger id);
}
