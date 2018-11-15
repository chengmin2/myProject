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
 * @description: 用户登录表
 * @date 2018年10月11日  上午9:48
 * @address: 四川成都
 */
@Entity(name = "user_login")
@Table(appliesTo = "user_login", comment = "用户登录表")
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键id'")
    private BigInteger id;
    @Column(name = "user_id", nullable = false, unique = true, columnDefinition = "bigint comment '用户id'")
    private BigInteger userId;
    @Column(nullable = false, columnDefinition = "varchar(30) comment '登录密码'")
    private String password;
    @Column(name = "verification_code", columnDefinition = "varchar(20) comment '验证码,适用于手机验证码'")
    private String verificationCode;
    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 如果该状态设为禁止登录的话，该用户不能登录平台(如果是医生则不能登录所有的医院)，相当于被平台拉黑
     * @date 2018年10月11日 下午2:20
     * @address: 四川成都
     */
    @Column(name = "account_status", columnDefinition = "tinyint(1) default 0 comment '帐号状态 0允许登录,1禁止登录,其他状态需要的时候定义'")
    private int accountStatus;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode == null ? null : verificationCode.trim();
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
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
