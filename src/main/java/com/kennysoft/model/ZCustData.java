package com.kennysoft.model;

import java.io.Serializable;
import java.util.Date;

public class ZCustData implements Serializable {


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFtxt() {
        return ftxt;
    }

    public void setFtxt(String ftxt) {
        this.ftxt = ftxt;
    }
    private  Integer fid;
    private  String  ftxt;
}
