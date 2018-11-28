package com.kennysoft.model;

import java.util.List;

public class XQueryResult<T> {
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public XQueryResult()
    {
        this.setTotal(0l);
        this.setList(null);

    }
    /*
    满足条件的总记录数
     */
    private Long total;
    /*
     * 当前页码内记录列表
     */
    private List<T> list;
}
