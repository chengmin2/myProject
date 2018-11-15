package com.jundeli.sslz.hospital.controller;


import com.jundeli.sslz.hospital.model.Hospital;
import com.jundeli.sslz.hospital.service.HospitalService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:09
 * @address: 四川成都
 */
@RestController
public class HospitalController {
    @Resource
    private HospitalService hospitalService;

    @RequestMapping(value = "allHospital")
    public ResultProtocol allHospital() {
        return hospitalService.allHospital();
    }
    @RequestMapping(value = "allHospitalOrderByDesc")
    public ResultProtocol allHospitalOrderByDesc(){
        return hospitalService.allHospitalOrderByDesc();
    }

    @RequestMapping(value = "hospitalIntroduce", method = RequestMethod.POST)
    public ResultProtocol hospitalIntroduce(Integer id) {
        return hospitalService.hospitalIntroduce(id);
    }
    @RequestMapping(value = "queryHospitalByName", method = RequestMethod.POST)
    public ResultProtocol queryHospitalByName(String  name) {
        return hospitalService.queryHospitalByName(name);
    }

    @RequestMapping(value = "insertHospital", method = RequestMethod.POST)
    public ResultProtocol insertHospital(Hospital hospital) {
        return hospitalService.insertHospital(hospital);
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public ResultProtocol deleteHospital(Integer id) {
        return hospitalService.deleteHospital(id);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultProtocol updateHospital(Hospital hospital) {
        return hospitalService.updateHospital(hospital);
    }


}
