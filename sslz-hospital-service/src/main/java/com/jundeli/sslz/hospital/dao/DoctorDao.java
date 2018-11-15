package com.jundeli.sslz.hospital.dao;

import com.jundeli.sslz.hospital.model.Doctor;


import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/**
 * @author zhm  赵何明
 * @version V1.0
 * @time 2018年10月16日 9:45
 * @description 医生相关数据接口
 */

public interface DoctorDao {
    //查询医院科室的医生
    List<Doctor> queryAllDoctor(Doctor doctor);

    //根据id查看医生资料
    Map<Object,Object> queryDoctorInfoById(BigInteger id);
}
