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
 * @description: 用户登录记录表
 * @date 2018年10月11日  上午10:48
 * @address: 四川成都
 */
@Entity(name = "user_login_record")
@Table(appliesTo = "user_login_record", comment = "用户登录记录表")
public class UserLoginRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键id'")
    private BigInteger id;
    @Column(name = "user_id", nullable = false, unique = true, columnDefinition = "bigint comment '用户id'")
    private BigInteger userId;
    @Column(name = "ip_address", columnDefinition = "varchar(30) comment 'ip地址'")
    private String ipAddress;
    @Column(columnDefinition = "varchar(255) comment '登录地理位置'")
    private String position;
    @Column(name = "device_type", columnDefinition = "varchar(20) comment '登录设备类型'")
    private String deviceType;
    @Column(name = "last_login_time", columnDefinition = "datetime default now() comment '最近一次登录时间'")
    private Date lastLoginTime;
    @Column(name = "login_org_id", columnDefinition = "bigint comment '登录机构id,意思是用户登录的是哪一个机构,适用于医生或者管理员登录'")
    private BigInteger loginOrgId;
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

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public Date getLastLoginTime() {
        if (lastLoginTime != null) {
            return (Date) lastLoginTime.clone();
        }
        return null;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        if (lastLoginTime != null) {
            this.lastLoginTime = (Date) lastLoginTime.clone();
        }
    }

    public BigInteger getLoginOrgId() {
        return loginOrgId;
    }

    public void setLoginOrgId(BigInteger loginOrgId) {
        this.loginOrgId = loginOrgId;
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
