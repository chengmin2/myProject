package com.jundeli.sslz.order.model;

import java.util.Date;

public class CaseHistory {
    private Long id;

    private Long userId;

    private Long hplId;

    private String inpatientWard;

    private String bedNo;

    private String haspitalNo;

    private String nativePlace;

    private String nationality;

    private String address;

    private String workUnit;

    private String job;

    private String maritalStatus;

    private String allergicHistory;

    private Date beHospitalizedDate;

    private Date chCollectTime;

    private String chRecite;

    private Date recordTime;

    private String narrate;

    private String primaryDiagnosis;

    private String recorder;

    private Date createTime;

    private String remark;

    private String field1;

    private String field2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getHplId() {
        return hplId;
    }

    public void setHplId(Long hplId) {
        this.hplId = hplId;
    }

    public String getInpatientWard() {
        return inpatientWard;
    }

    public void setInpatientWard(String inpatientWard) {
        this.inpatientWard = inpatientWard == null ? null : inpatientWard.trim();
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getHaspitalNo() {
        return haspitalNo;
    }

    public void setHaspitalNo(String haspitalNo) {
        this.haspitalNo = haspitalNo == null ? null : haspitalNo.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit == null ? null : workUnit.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public Date getBeHospitalizedDate() {
        return beHospitalizedDate;
    }

    public void setBeHospitalizedDate(Date beHospitalizedDate) {
        this.beHospitalizedDate = beHospitalizedDate;
    }

    public Date getChCollectTime() {
        return chCollectTime;
    }

    public void setChCollectTime(Date chCollectTime) {
        this.chCollectTime = chCollectTime;
    }

    public String getChRecite() {
        return chRecite;
    }

    public void setChRecite(String chRecite) {
        this.chRecite = chRecite == null ? null : chRecite.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getNarrate() {
        return narrate;
    }

    public void setNarrate(String narrate) {
        this.narrate = narrate == null ? null : narrate.trim();
    }

    public String getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }

    public void setPrimaryDiagnosis(String primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis == null ? null : primaryDiagnosis.trim();
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
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