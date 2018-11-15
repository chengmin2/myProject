package com.jundeli.sslz.hospital.service.impl;

import com.jundeli.sslz.hospital.dao.DepartmentDao;
import com.jundeli.sslz.hospital.model.Dpartment;
import com.jundeli.sslz.hospital.model.HospitalDpartment;
import com.jundeli.sslz.hospital.service.DepartmentService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

/**
 * @author zhm  赵何明
 * @version V1.0.0
 * @time 2018年10月12日 10:10
 * @description 科室逻辑层
 */

@Service(value = "departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 10:10
     * @version V1.0
     * @description 通过医院名字查询科室
     */
    @Override
    public ResultProtocol queryByHospitalName(String name) {
        List<Dpartment> list = departmentDao.queryByHospitalName(name);
        return ResultProtocol.builder().success(list.size() > 0)
                .message(list.size() > 0 ? "查询成功" : "查询失败").data(list).build();
    }

    /**
     * @author zhm  赵何明
     * @time 2018年10月12日 11:31
     * @version V1.0
     * @description 给医院增加科室
     */
    @Override
    @Transactional
    public ResultProtocol insertHospitalDepartment(BigInteger hplId, Dpartment dpartment) {
        int count = departmentDao.insertDepartment(dpartment);
        BigInteger dptId = dpartment.getId();
        if (count > 0) {
            HospitalDpartment hospitalDpartment = new HospitalDpartment();
            hospitalDpartment.setHplId(hplId);
            hospitalDpartment.setDptId(dptId);
            boolean column = departmentDao.insertHospitalDepartment(hospitalDpartment) > 0;
            return ResultProtocol.builder().success(column).code(column ? 200 : 500).message(column ? "成功" : "失败").build();
        }
        return ResultProtocol.builder().success(false).code(500).message("失败").build();

    }

    /**
     * @param
     * @return
     * @author zhm  赵何明
     * @time 2018年10月15日 10:25
     * @version V1.0
     * @description 删除医院科室
     */


    @Override
    @Transactional
    public ResultProtocol deleteHospitalDepartment(HospitalDpartment hospitalDpartment) {
        if (hospitalDpartment != null) {
            BigInteger hospitalId = hospitalDpartment.getHplId();
            BigInteger departmentId = hospitalDpartment.getDptId();

            if (departmentId == null) {
                return ResultProtocol.builder().code(400).message("科室id不能为空").build();
            }
            if (hospitalId == null) {
                return ResultProtocol.builder().code(400).message("医院id不能为空").build();
            }
            boolean count = departmentDao.deleteHospitalDepartment(hospitalDpartment) > 0;
            return ResultProtocol.builder().success(count).code(count ? 200 : 500).message(count ? "成功" : "失败").build();
        } else {
            return ErrorProtocol.E_400;
        }

    }
}

