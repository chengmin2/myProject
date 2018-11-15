package com.jundeli.sslz.hospital.service.impl;

import com.jundeli.sslz.hospital.dao.HospitalDao;
import com.jundeli.sslz.hospital.model.Hospital;
import com.jundeli.sslz.hospital.service.HospitalService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:11
 * @address: 四川成都
 */
@Service(value = "hospitalService")
public class HospitalServiceImpl implements HospitalService {
    @Resource
    private HospitalDao hospitalDao;

    @Override
    public ResultProtocol allHospital() {
        List<Hospital> list = hospitalDao.allHospital();
        return ResultProtocol.builder().success(list.size()>0)
                .message(list.size() > 0 ? "查询成功" : "查询失败").data(list).build();
    }
    /**
      * @author zhm  赵何明
      * @time 2018年10月15日 9:37
      * @param
      * @return   list
      * @version V1.0.0
      * @description  通过预约量降序排序
      */
    
    @Override
    public ResultProtocol allHospitalOrderByDesc() {
        List<Hospital> list = hospitalDao.allHospitalOrderByDesc();
        return ResultProtocol.builder().success(list.size()>0)
                .message(list.size() > 0 ? "查询成功" : "查询失败").data(list).build();
    }

    @Override
    public ResultProtocol hospitalIntroduce(Integer id) {
        Map<String,Object> map= hospitalDao.hospitalIntroduce(id);
        return ResultProtocol.builder().success(map.size()>0)
                .message(map.size() > 0 ? "查询成功" : "查询失败").data(map).build();
    }

    @Override
    public ResultProtocol queryHospitalByName(String name) {
        Hospital hospital=hospitalDao.queryHospitalByName(name);
        System.out.println(hospital);
        return ResultProtocol.builder().success(hospital==null)
                .message(hospital==null ? "没有这家医院" : "查询成功").data(hospital).build();
    }

    @Override
    @Transactional
    public ResultProtocol insertHospital(Hospital hospital) {
        boolean column = hospitalDao.insertHospital(hospital) > 0;
        return ResultProtocol.builder().success(column).code(column ? 200 : 500).message(column ? "成功" : "失败").build();
    }

    @Override
    @Transactional
    public ResultProtocol deleteHospital(Integer id) {
        boolean column = hospitalDao.deleteHospital(id) > 0;
        return ResultProtocol.builder().success(column).code(column ? 200 : 500).message(column ? "成功" : "失败").build();
    }

    @Override
    @Transactional
    public ResultProtocol updateHospital(Hospital hospital) {
        boolean column = hospitalDao.updateHospital(hospital) > 0;
        return ResultProtocol.builder().success(column).code(column ? 200 : 500).message(column ? "成功" : "失败").build();
    }


}
