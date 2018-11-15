package com.jundeli.sslz.hospital.model;


import java.math.BigInteger;
import java.util.Date;

public class HospitalDpartment {

    private BigInteger id;
    private BigInteger hplId;
    private BigInteger dptId;
    private Date createTime;
    private String remark;
    private String field1;
    private String field2;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getHplId() {
        return hplId;
    }

    public void setHplId(BigInteger hplId) {
        this.hplId = hplId;
    }

    public BigInteger getDptId() {
        return dptId;
    }

    public void setDptId(BigInteger dptId) {
        this.dptId = dptId;
    }

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
        this.remark = remark;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "HospitalDpartment{" +
                "id=" + id +
                ", hplId=" + hplId +
                ", dptId=" + dptId +
                ", createTime=" + createTime +
                ", remark='" + remark + '\'' +
                ", field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                '}';
    }
}
