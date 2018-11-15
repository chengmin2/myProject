package com.jundeli.sslz.oauth.dao;

import com.jundeli.sslz.oauth.dto.DoctorDto;

import java.util.List;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 医生相关的数据接口
 * @date 2018年10月12日  上午10:56
 * @address: 四川成都
 */
public interface DoctorDao {
    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 查询医生列表
     * @date 2018年10月12日 上午10:57
     * @address: 四川成都
     */
    List<DoctorDto> selectList(DoctorDto dto);
}
