package com.jundeli.sslz.oauth.service;

import com.jundeli.sslz.oauth.dto.DoctorDto;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 医生相关逻辑接口
 * @date 2018年10月12日  上午11:31
 * @address: 四川成都
 */
public interface DoctorService {
    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 获取医生列表
     * @date 2018年10月12日 上午11:32
     * @address: 四川成都
     */
    ResultProtocol getDoctorList(DoctorDto dto);
}
