package com.kennysoft.model;

public class XRspJson<T> {

    public XRspJson() {
        this.ret = -1;
        this.msg = "";
        this.data = null;
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /*
    编程用记录
    0 成功执行且有预期结果
    1 成功执行无预期结果
    -1 执行失败
     */
    private Integer ret;
    /*
    消息体
    成功执行无消息体
     */

    private String msg;
    /*
    返回执行结果
     */
    private T data;
}
