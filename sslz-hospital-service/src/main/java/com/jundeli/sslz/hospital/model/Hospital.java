package com.jundeli.sslz.hospital.model;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 用途
 * @date 2018年10月09日  下午5:06
 * @address: 四川成都
 */
public class Hospital {
    private BigInteger id;
    private String name;//医院名字
    private String rank;//医院等级
    private String address;//医院地址
    private String bigintro;//医院简介
    private String thuthumbnail;//医院缩略图
    private String tel;    //医院电话
    private Date create_time;//创建时间
    private String remark;//备注
    private String quantity;//预约量
    private String longitude;//经度
    private String latitude;//维度
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBigintro() {
        return bigintro;
    }

    public void setBigintro(String bigintro) {
        this.bigintro = bigintro;
    }

    public String getThuthumbnail() {
        return thuthumbnail;
    }

    public void setThuthumbnail(String thuthumbnail) {
        this.thuthumbnail = thuthumbnail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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
