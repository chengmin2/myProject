package com.jundeli.sslz.hospital.service;

import com.jundeli.sslz.hospital.model.Hospital;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

import java.util.List;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:11
 * @address: 四川成都
 */
public interface HospitalService {

    ResultProtocol allHospital();

    ResultProtocol allHospitalOrderByDesc();

    ResultProtocol hospitalIntroduce(Integer id);

    ResultProtocol queryHospitalByName(String name);

    ResultProtocol insertHospital(Hospital hospital);

    ResultProtocol deleteHospital(Integer id);

    ResultProtocol updateHospital(Hospital hospital);


}
