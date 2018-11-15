package com.jundeli.sslz.hospital.dao;

import com.jundeli.sslz.hospital.model.Dpartment;
import com.jundeli.sslz.hospital.model.HospitalDpartment;

import java.util.List;

public interface DepartmentDao {
    //通过医院名字查询科室
    List<Dpartment> queryByHospitalName(String name);
    //增加科室取到科室id
    int insertDepartment(Dpartment dpartment);
    //给医院增加科室
    int insertHospitalDepartment(HospitalDpartment hospitalDpartment);
    //删除医院科室
    int deleteHospitalDepartment(HospitalDpartment hospitalDpartment);
}
