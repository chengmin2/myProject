package com.jundeli.sslz.oauth.service.impl;

import com.jundeli.sslz.oauth.dao.DoctorDao;
import com.jundeli.sslz.oauth.dto.DoctorDto;
import com.jundeli.sslz.oauth.service.DoctorService;
import com.jundeli.sslz.tool.encrypt.AESUtil;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 医生逻辑接口实现类
 * @date 2018年10月12日  上午11:32
 * @address: 四川成都
 */
@Service(value = "doctorService")
public class DoctorServiceImpl implements DoctorService {
    @Resource
    private DoctorDao doctorDao;

    /**
     * @param dto 基本参数，医院id，科室id
     * @author yxl 余秀良
     * @version 1.0
     * @description: 获取医生列表
     * @date 2018年10月12日 上午11:32
     * @address: 四川成都
     */
    @Override
    public ResultProtocol getDoctorList(DoctorDto dto) {
        if (dto != null) {
            //科室id
            BigInteger departmentId = dto.getDepartmentId();
            //医院id
            BigInteger hospitalId = dto.getHospitalId();

            if (departmentId == null) {
                return ResultProtocol.builder().code(400).message("科室id不能为空").build();
            }
            if (hospitalId == null) {
                return ResultProtocol.builder().code(400).message("医院id不能为空").build();
            }
            //查询数据库
            List<DoctorDto> doctorDtos = doctorDao.selectList(dto);
            boolean success = false;
            String message = "暂无数据";
            if (doctorDtos != null && doctorDtos.size() > 0) {
                success = true;
                message = "查询成功";
                doctorDtos.forEach(doctor -> {
                    //把前端需要的用户表id转码
                    doctor.setuId(AESUtil.encryptBase64(String.valueOf(doctor.getUserId())));
                    //把前端需要的医生表id转码
                    doctor.setdId(AESUtil.encryptBase64(String.valueOf(doctor.getDoctorId())));
                    doctor.setUserId(null);
                    doctor.setDoctorId(null);
                });
            }
            return ResultProtocol.builder().success(success).data(doctorDtos).message(message).build();
        } else {
            return ErrorProtocol.E_400;
        }
    }
}
