package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.dto.RegistrationRecordDto;
import com.jundeli.sslz.order.model.RegistrationRecord;

import java.util.List;

public interface RegistrationRecordDao {
    int deleteByPrimaryKey(Long id);

    int insert(RegistrationRecord record);

    int insertSelective(RegistrationRecord record);

    RegistrationRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RegistrationRecord record);

    int updateByPrimaryKey(RegistrationRecord record);

    /**
     * 获取用户挂号记录
     * @param userId
     * @return
     */
    List<RegistrationRecordDto> getRegistrationList(Long userId);
}