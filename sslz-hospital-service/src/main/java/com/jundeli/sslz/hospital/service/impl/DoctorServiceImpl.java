package com.jundeli.sslz.hospital.service.impl;

import com.jundeli.sslz.hospital.dao.DoctorDao;
import com.jundeli.sslz.hospital.model.Doctor;
import com.jundeli.sslz.hospital.service.DoctorService;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @author zhm  赵何明
 * @version V1.0
 * @time 2018年10月16日 9:43
 * @description 医生逻辑接口实现类
 */


@Service(value = "doctorService")
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorDao doctorDao;

    /**
     * @return : com.jundeli.sslz.tool.protocol.ResultProtocol
     * @author zhm  赵何明
     * @time 2018年10月16日 11:52
     * @params [hplId, dptId]
     * @version V1.0
     * @description 查询医院科室下的医生
     */

    @Override
    public ResultProtocol queryAllDoctor(BigInteger hplId, BigInteger dptId) {
        if (hplId == null) {
            return ResultProtocol.builder().code(400).message("科室id不能为空").build();
        }
        if (dptId == null) {
            return ResultProtocol.builder().code(400).message("医院id不能为空").build();
        }
        Doctor doctor=new Doctor();
        doctor.setHplId(hplId);
        doctor.setDptId(dptId);
        List<Doctor> list = doctorDao.queryAllDoctor(doctor);
        return ResultProtocol.builder().success(list.size() > 0)
                .message(list.size() > 0 ? "查询成功" : "暂无数据").data(list).build();
    }
    /**
     * @author zhm  赵何明
     * @time 2018年10月16日 14:32
     * @params [id]
     * @return : com.jundeli.sslz.tool.protocol.ResultProtocol
     * @version V1.0
     * @description 根据id查看医生资料
     */
    @Override
    public ResultProtocol queryDoctorInfoById(BigInteger id) {
        if (id == null) {
            return ResultProtocol.builder().code(400).message("医生id不能为空").build();
        }
        Map<Object,Object> doctor = doctorDao.queryDoctorInfoById(id);
        return ResultProtocol.builder().success(doctor==null).message(doctor==null? "该医生不存在" : "查询成功").data(doctor).build();
    }

}
