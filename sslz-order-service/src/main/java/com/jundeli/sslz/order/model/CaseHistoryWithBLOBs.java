package com.jundeli.sslz.order.model;

public class CaseHistoryWithBLOBs extends CaseHistory {
    private String nMdlHistory;

    private String bMdlHistory;

    private String pMdlHistory;

    private String fMdlHistory;

    private String mMdlHistory;

    public String getnMdlHistory() {
        return nMdlHistory;
    }

    public void setnMdlHistory(String nMdlHistory) {
        this.nMdlHistory = nMdlHistory == null ? null : nMdlHistory.trim();
    }

    public String getbMdlHistory() {
        return bMdlHistory;
    }

    public void setbMdlHistory(String bMdlHistory) {
        this.bMdlHistory = bMdlHistory == null ? null : bMdlHistory.trim();
    }

    public String getpMdlHistory() {
        return pMdlHistory;
    }

    public void setpMdlHistory(String pMdlHistory) {
        this.pMdlHistory = pMdlHistory == null ? null : pMdlHistory.trim();
    }

    public String getfMdlHistory() {
        return fMdlHistory;
    }

    public void setfMdlHistory(String fMdlHistory) {
        this.fMdlHistory = fMdlHistory == null ? null : fMdlHistory.trim();
    }

    public String getmMdlHistory() {
        return mMdlHistory;
    }

    public void setmMdlHistory(String mMdlHistory) {
        this.mMdlHistory = mMdlHistory == null ? null : mMdlHistory.trim();
    }
}