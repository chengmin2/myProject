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
 * @description: 用户表
 * @date 2018年10月11日  上午9:48
 * @address: 四川成都
 */
@Entity(name = "user")
@Table(appliesTo = "user", comment = "用户表")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint comment '主键id'")
    private BigInteger id;
    @Column(nullable = false, unique = true, columnDefinition = "varchar(20) comment '登录帐号'")
    private String username;
    @Column(columnDefinition = "varchar(11) comment '手机号'")
    private String phone;
    @Column(columnDefinition = "varchar(30) comment '姓名'")
    private String name;
    @Column(columnDefinition = "bit(1) comment '性别'")
    private boolean gender;
    @Column(columnDefinition = "tinyint(3) comment '年龄'")
    private int age;
    @Column(name = "mel_card", columnDefinition = "varchar(20) comment '就诊卡号'")
    private String melCard;
    @Column(name = "id_card", columnDefinition = "varchar(20) comment '身份证号'")
    private String idCard;
    @Column(name = "create_time", columnDefinition = "datetime default now() comment '创建时间'")
    private Date createTime;
    @Column(columnDefinition = "varchar(255) comment '备注'")
    private String remark;
    @Column(columnDefinition = "varchar(20) comment '预留字段1'")
    private String field1;
    @Column(columnDefinition = "varchar(20) comment '预留字段2'")
    private String field2;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMelCard() {
        return melCard;
    }

    public void setMelCard(String melCard) {
        this.melCard = melCard == null ? null : melCard.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
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
}
