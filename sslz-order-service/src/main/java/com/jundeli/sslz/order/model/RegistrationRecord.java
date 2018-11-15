package com.jundeli.sslz.order.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class RegistrationRecord {
    private Long id;

    private Long dctId;

    private Long userId;

    private Integer numbers;

    private Date createTime;

    private String remark;

    private String filed1;

    private String filed2;

    private Long hstlId;//医院id

    private Long datId;//科室id

    private BigDecimal money;//挂号金额

    private Date outpatientTime;//门诊时间

    public Long getHstlId() {
        return hstlId;
    }

    public void setHstlId(Long hstlId) {
        this.hstlId = hstlId;
    }

    public Long getDatId() {
        return datId;
    }

    public void setDatId(Long datId) {
        this.datId = datId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getOutpatientTime() {
        return outpatientTime;
    }

    public void setOutpatientTime(Date outpatientTime) {
        this.outpatientTime = outpatientTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDctId() {
        return dctId;
    }

    public void setDctId(Long dctId) {
        this.dctId = dctId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1 == null ? null : filed1.trim();
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2 == null ? null : filed2.trim();
    }
}