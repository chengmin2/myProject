package com.jundeli.sslz.order.dto;

import com.jundeli.sslz.order.model.RegistrationRecord;

public class RegistrationRecordDto extends RegistrationRecord {
    private  String doctorName;//医生姓名
    private  String dpartmentName;//科室名称
    private  String hospitalName;//医院名称
    private  String userName;//用户名

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDpartmentName(String dpartmentName) {
        this.dpartmentName = dpartmentName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
