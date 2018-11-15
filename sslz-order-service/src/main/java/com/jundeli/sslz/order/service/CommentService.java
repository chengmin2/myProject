package com.jundeli.sslz.order.service;

import com.jundeli.sslz.order.model.Comment;
import com.jundeli.sslz.tool.protocol.ResultProtocol;

public interface CommentService {
    /**
     * 添加评论信息
     * @param comment
     * @return
     */
    ResultProtocol insertComment(Comment comment) throws  Exception;
}
