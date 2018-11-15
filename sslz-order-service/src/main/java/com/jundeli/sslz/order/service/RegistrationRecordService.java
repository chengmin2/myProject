package com.jundeli.sslz.order.service;


import com.jundeli.sslz.order.model.RegistrationRecord;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

import java.util.List;

public interface RegistrationRecordService {
    /**
     *  新增挂号
     * @return
     * @throws Exception
     */
    ResultProtocol insertOrUpdateRegistration(RegistrationRecord registrationRecord) throws Exception;

    /**
     * 获取用户挂号
     * @param userId
     * @return
     * @throws Exception
     */
    ResultProtocol getRegistrationList(Long userId) throws  Exception;
}
