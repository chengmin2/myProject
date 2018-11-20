package com.jundeli.sslz.order.service.impl;

import com.jundeli.sslz.order.dao.UsersDao;
import com.jundeli.sslz.order.model.Users;
import com.jundeli.sslz.order.service.UsersService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
@Service(value = "usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    UsersDao usersDao;

    @Override
    public ResultProtocol insertOrUpdateUsers(Users users) {
        try {
            boolean isOk=false;//接收操作结果
            if(users==null){
                return ErrorProtocol.E_400;
            }else if(users.getId()!=null){//修改用户数据
                isOk = usersDao.updateByPrimaryKeySelective(users)>0;
            }else if(users.getId()==null){//新增用户
                isOk = usersDao.insertSelective(users)>0;
            }
            return  ResultProtocol.builder().code(isOk?200:500).success(isOk).message(isOk?"操作成功":"操作失败").build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }
}
