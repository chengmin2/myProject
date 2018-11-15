package com.jundeli.sslz.oauth.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用户角色表
 * @date 2018年10月10日  下午3:27
 * @address: 四川成都
 */
@Entity(name = "user_role")
@Table(appliesTo = "user_role", comment = "用户角色表")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键id'")
    private BigInteger id;
    @Column(name = "user_id", nullable = false, columnDefinition = "bigint comment '用户id'")
    private BigInteger userId;
    @Column(name = "role_id", nullable = false, columnDefinition = "int comment '角色表id'")
    private int roleId;
    @Column(name = "create_time", columnDefinition = "datetime default now() comment '创建时间'")
    private Date createTime;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Date getCreateTime() {
        if (createTime != null) {
            return (Date) createTime.clone();
        }
        return null;
    }

    public void setCreateTime(Date createTime) {
        if (createTime != null) {
            this.createTime = (Date) createTime.clone();
        }
    }
}
