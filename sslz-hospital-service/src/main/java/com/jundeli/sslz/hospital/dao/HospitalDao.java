package com.jundeli.sslz.hospital.dao;

import com.jundeli.sslz.hospital.model.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午2:11
 * @address: 四川成都
 */
public interface HospitalDao {
    //查询所有医院
    List<Hospital> allHospital();

    //通过预约量降序排序
    List<Hospital> allHospitalOrderByDesc();

    //医院简介
    Map<String, Object> hospitalIntroduce(Integer id);

    //根据名字查询医院
    Hospital queryHospitalByName(String name);

    //添加医院
    int insertHospital(Hospital hospital);

    //删除医院
    int deleteHospital(Integer id);

    //更新医院
    int updateHospital(Hospital hospital);



}
