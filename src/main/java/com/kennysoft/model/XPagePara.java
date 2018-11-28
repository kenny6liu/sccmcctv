package com.kennysoft.model;

public   class XPagePara {
    int offset;   //start from 0

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    Integer limit;

    public  XPagePara()
    {
        this.offset = 0;
        this.limit =1000;

    }
    public  XPagePara(Integer _offset,int _limit)
    {
        this.offset = _offset;
        this.limit =_limit;

    }
}