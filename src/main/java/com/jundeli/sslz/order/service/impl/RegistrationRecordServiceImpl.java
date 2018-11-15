package com.jundeli.sslz.order.service.impl;

import com.jundeli.sslz.order.dao.RegistrationRecordDao;
import com.jundeli.sslz.order.dto.RegistrationRecordDto;
import com.jundeli.sslz.order.model.RegistrationRecord;
import com.jundeli.sslz.order.service.RegistrationRecordService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service(value = "registrationRecordService")
public class RegistrationRecordServiceImpl implements RegistrationRecordService {

    @Resource
    RegistrationRecordDao registrationRecordDao;
    @Override
    public ResultProtocol insertOrUpdateRegistration(RegistrationRecord registrationRecord){
        try {
            boolean isOk = false;//返回结果
            if(registrationRecord==null){
                return ErrorProtocol.E_400;
            }else if(registrationRecord.getId()==null){//新增
                registrationRecord.setCreateTime(new Date());
                isOk = registrationRecordDao.insertSelective(registrationRecord)>0;
            }else if(registrationRecord.getId()!=null){//修改
                isOk = registrationRecordDao.updateByPrimaryKeySelective(registrationRecord)>0;
            }
            return  ResultProtocol.builder().code(isOk?200:500).success(isOk).message(isOk?"操作成功":"操作失败").build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }

    @Override
    public ResultProtocol getRegistrationList(Long userId){
        try {
            if(userId==0l){
                return  ErrorProtocol.E_400;
            }
            List<RegistrationRecordDto> registrationRecords = registrationRecordDao.getRegistrationList(userId);
            return ResultProtocol.builder().code(200).success(true).message("返回数据").data(registrationRecords).build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }

}
