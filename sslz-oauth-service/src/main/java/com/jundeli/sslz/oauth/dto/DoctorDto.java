package com.jundeli.sslz.oauth.dto;

import java.math.BigInteger;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 医生相关的数据封装
 * @date 2018年10月12日  上午10:43
 * @address: 四川成都
 */
public class DoctorDto {
    private BigInteger userId;
    private String uId;
    private BigInteger doctorId;
    private String dId;
    private String doctorName;
    private BigInteger hospitalId;
    private String hpId;
    private BigInteger departmentId;
    private String dpId;
    private String doctorHeadPortrait;
    private String doctorQualifications;
    private String doctorDescription;
    private String hospitalName;
    private String hospitalAddress;
    private String departmentName;
    /**
     * 无号
     */
    private boolean isNotNumber;

    public DoctorDto() {
    }

    private DoctorDto(Builder builder) {
        setUserId(builder.userId);
        setuId(builder.uId);
        setDoctorId(builder.doctorId);
        setdId(builder.dId);
        setDoctorName(builder.doctorName);
        setHospitalId(builder.hospitalId);
        setHpId(builder.hpId);
        setDepartmentId(builder.departmentId);
        setDpId(builder.dpId);
        setDoctorHeadPortrait(builder.doctorHeadPortrait);
        setDoctorQualifications(builder.doctorQualifications);
        setDoctorDescription(builder.doctorDescription);
        setHospitalName(builder.hospitalName);
        setHospitalAddress(builder.hospitalAddress);
        setDepartmentName(builder.departmentName);
        setNotNumber(builder.isNotNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public BigInteger getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(BigInteger doctorId) {
        this.doctorId = doctorId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public BigInteger getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(BigInteger hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHpId() {
        return hpId;
    }

    public void setHpId(String hpId) {
        this.hpId = hpId;
    }

    public BigInteger getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(BigInteger departmentId) {
        this.departmentId = departmentId;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getDoctorHeadPortrait() {
        return doctorHeadPortrait;
    }

    public void setDoctorHeadPortrait(String doctorHeadPortrait) {
        this.doctorHeadPortrait = doctorHeadPortrait;
    }

    public String getDoctorQualifications() {
        return doctorQualifications;
    }

    public void setDoctorQualifications(String doctorQualifications) {
        this.doctorQualifications = doctorQualifications;
    }

    public String getDoctorDescription() {
        return doctorDescription;
    }

    public void setDoctorDescription(String doctorDescription) {
        this.doctorDescription = doctorDescription;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public boolean isNotNumber() {
        return isNotNumber;
    }

    public void setNotNumber(boolean notNumber) {
        isNotNumber = notNumber;
    }

    public static final class Builder {
        private BigInteger userId;
        private String uId;
        private BigInteger doctorId;
        private String dId;
        private String doctorName;
        private BigInteger hospitalId;
        private String hpId;
        private BigInteger departmentId;
        private String dpId;
        private String doctorHeadPortrait;
        private String doctorQualifications;
        private String doctorDescription;
        private String hospitalName;
        private String hospitalAddress;
        private String departmentName;
        private boolean isNotNumber;

        private Builder() {
        }

        public Builder userId(BigInteger userId) {
            this.userId = userId;
            return this;
        }

        public Builder uId(String uId) {
            this.uId = uId;
            return this;
        }

        public Builder doctorId(BigInteger doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder dId(String dId) {
            this.dId = dId;
            return this;
        }

        public Builder doctorName(String doctorName) {
            this.doctorName = doctorName;
            return this;
        }

        public Builder hospitalId(BigInteger hospitalId) {
            this.hospitalId = hospitalId;
            return this;
        }

        public Builder hpId(String hpId) {
            this.hpId = hpId;
            return this;
        }

        public Builder departmentId(BigInteger departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder dpId(String dpId) {
            this.dpId = dpId;
            return this;
        }

        public Builder doctorHeadPortrait(String doctorHeadPortrait) {
            this.doctorHeadPortrait = doctorHeadPortrait;
            return this;
        }

        public Builder doctorQualifications(String doctorQualifications) {
            this.doctorQualifications = doctorQualifications;
            return this;
        }

        public Builder doctorDescription(String doctorDescription) {
            this.doctorDescription = doctorDescription;
            return this;
        }

        public Builder hospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
            return this;
        }

        public Builder hospitalAddress(String hospitalAddress) {
            this.hospitalAddress = hospitalAddress;
            return this;
        }

        public Builder departmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder isNotNumber(boolean isNotNumber) {
            this.isNotNumber = isNotNumber;
            return this;
        }

        public DoctorDto build() {
            return new DoctorDto(this);
        }
    }
}
