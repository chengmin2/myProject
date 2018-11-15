package com.jundeli.sslz.oauth.controller;

import com.jundeli.sslz.oauth.dto.DoctorDto;
import com.jundeli.sslz.oauth.service.DoctorService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 医生控制器
 * @date 2018年10月12日  上午10:26
 * @address: 四川成都
 */
@RestController
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 医生列表
     * @date 2018年10月12日 上午10:54
     * @address: 四川成都
     */
    @RequestMapping(value = "/doctor/list")
    public ResultProtocol getDoctorList(DoctorDto dto) {
        return doctorService.getDoctorList(dto);
    }


}
