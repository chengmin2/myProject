package com.jundeli.sslz.hospital.model;


import java.math.BigInteger;
import java.util.Date;
/**
  * @author zhm  赵何明
  * @time 2018年10月16日 10:47
  * @version V1.0
  * @description  医生表
  */

public class Doctor {
  private BigInteger id;
  private BigInteger hplId;
  private BigInteger dptId;
  private String name;
  private String headPortrait;
  private String qualifications;
  private String bigintro;
  private String quantity;
  private String score;
  private String appointmentTime;
  private String cost;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHeadPortrait() {
    return headPortrait;
  }

  public void setHeadPortrait(String headPortrait) {
    this.headPortrait = headPortrait;
  }

  public String getQualifications() {
    return qualifications;
  }

  public void setQualifications(String qualifications) {
    this.qualifications = qualifications;
  }

  public String getBigintro() {
    return bigintro;
  }

  public void setBigintro(String bigintro) {
    this.bigintro = bigintro;
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public String getAppointmentTime() {
    return appointmentTime;
  }

  public void setAppointmentTime(String appointmentTime) {
    this.appointmentTime = appointmentTime;
  }

  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
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
    return "Doctor{" +
            "id=" + id +
            ", hplId=" + hplId +
            ", dptId=" + dptId +
            ", name='" + name + '\'' +
            ", headPortrait='" + headPortrait + '\'' +
            ", qualifications='" + qualifications + '\'' +
            ", bigintro='" + bigintro + '\'' +
            ", quantity='" + quantity + '\'' +
            ", score='" + score + '\'' +
            ", appointmentTime='" + appointmentTime + '\'' +
            ", cost='" + cost + '\'' +
            ", createTime=" + createTime +
            ", remark='" + remark + '\'' +
            ", field1='" + field1 + '\'' +
            ", field2='" + field2 + '\'' +
            '}';
  }
}
