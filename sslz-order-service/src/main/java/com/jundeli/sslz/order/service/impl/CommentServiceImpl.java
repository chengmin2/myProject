package com.jundeli.sslz.order.service.impl;

import com.jundeli.sslz.order.dao.CommentDao;
import com.jundeli.sslz.order.model.Comment;
import com.jundeli.sslz.order.service.CommentService;
import com.jundeli.sslz.tool.protocol.ErrorProtocol;
import com.jundeli.sslz.tool.protocol.ResultProtocol;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service(value = "commentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    CommentDao commentDao;
    @Override
    public ResultProtocol insertComment(Comment comment){
        try {
            if(comment==null){
                return ErrorProtocol.E_400;
            }
                boolean isOk  = commentDao.insertSelective(comment)>0;
            return  ResultProtocol.builder().code(isOk?200:500).success(isOk).message(isOk?"操作成功":"操作失败").build();
        } catch (Exception e) {
            e.printStackTrace();
            return  ErrorProtocol.E_500;
        }
    }
}
