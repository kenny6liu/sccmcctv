package com.kennysoft.model;


import java.io.Serializable;
import java.util.Date;

public class ZCustDataResult implements Serializable {
    private  Integer fid;
     private  Date fdate;
    private  String  ftxt;
    private  String fresult;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getFtxt() {
        return ftxt;
    }

    public void setFtxt(String ftxt) {
        this.ftxt = ftxt;
    }

    public String getFresult() {
        return fresult;
    }

    public void setFresult(String fresult) {
        this.fresult = fresult;
    }

}
