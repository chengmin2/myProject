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
 * @description: 用途
 * @date 2018年10月11日  下午1:56
 * @address: 四川成都
 */
@Entity(name = "doctor")
@Table(appliesTo = "doctor", comment = "医生表")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键id'")
    private BigInteger id;
    @Column(name = "user_id", nullable = false, columnDefinition = "bigint comment '用户表id'")
    private BigInteger userId;
    @Column(name = "hospital_id", nullable = false, columnDefinition = "bigint comment '医院表id'")
    private BigInteger hospitalId;
    @Column(name = "department_id", nullable = false, columnDefinition = "bigint comment '科室表id'")
    private BigInteger departmentId;
    /**
     * @author yxl 余秀良
     * @version 1.0
     * @description: 该字段用于标识该医生是否可以登录该医院，如果该医生在该医院离职直接删除数据的话不利于以后做统计
     * @date 2018年10月11日 下午2:12
     * @address: 四川成都
     */
    @Column(name = "account_status", columnDefinition = "tinyint(1) default 0 comment '帐号状态 0允许登录,1禁止登录,其他状态需要的时候定义'")
    private int accountStatus;
    @Column(name = "head_portrait", columnDefinition = "varchar(50) comment '头像'")
    private String headPortrait;
    @Column(columnDefinition = "varchar(50) comment '资历,例如:一级专家，教授，主任医师等'")
    private String qualifications;
    @Column(columnDefinition = "text comment '医生简介'")
    private String description;
    @Column(columnDefinition = "varchar(255) comment '备注'")
    private String remark;
    @Column(columnDefinition = "varchar(20) comment '预留字段1'")
    private String field1;
    @Column(columnDefinition = "varchar(20) comment '预留字段2'")
    private String field2;
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

    public BigInteger getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(BigInteger hospitalId) {
        this.hospitalId = hospitalId;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait == null ? null : headPortrait.trim();
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications == null ? null : qualifications.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1 == null ? null : field1.trim();
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2 == null ? null : field2.trim();
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
