package com.jundeli.sslz.hospital.model;


import java.math.BigInteger;
import java.util.Date;

public class Dpartment {

  private BigInteger id;
  private String name;
  private String bigintro;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBigintro() {
    return bigintro;
  }

  public void setBigintro(String bigintro) {
    this.bigintro = bigintro;
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
}
