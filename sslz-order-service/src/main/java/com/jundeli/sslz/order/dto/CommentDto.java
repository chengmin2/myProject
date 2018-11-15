package com.jundeli.sslz.order.dto;

import com.jundeli.sslz.order.model.Comment;

public class CommentDto extends Comment {
    private String name;//评论人姓名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
