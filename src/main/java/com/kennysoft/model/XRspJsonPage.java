package com.kennysoft.model;

/**
 *  基于bootstrap分页json格式
 * @param <T>
 */
public class XRspJsonPage<T> extends XRspJson {

    //   //$rsp = array('ret' =>$ret,'draw' => $draw,'recordsTotal'=> $total,'recordsFiltered'=> $total,'data'=>$data);
    public XRspJsonPage() {
        this.draw = 0;
        this.recordsTotal = 0;
        this.recordsFiltered = 0;
        this.setData(new XQueryResult());
        this.setRet(1);
    }
    public XRspJsonPage(XQueryResult<T> ret,int draw) {
        this.draw = draw;
        this.recordsFiltered = ret.getTotal();
        this.recordsTotal = ret.getTotal();

        if (ret.getTotal() == 0) {
            this.setRet(1);
            this.setData(new XQueryResult());
            this.setMsg("没有满足条件的记录！");
        }
        if(ret.getTotal()>0)
        {
            this.setData(ret.getList());
            this.setRet(0);
            this.setMsg("成功！");
        }
    }
    public XRspJsonPage(Integer _ret) {

        //rsp.setRecordsFiltered(0);
        this.setRecordsFiltered(0);
        //rsp.setRecordsTotal(0);
        this.setRecordsTotal(0);
        //rsp.setData(new XQueryResult<App2channelsendview>());
        this.setData(new XQueryResult());
        //rsp.setDraw(0);
        this.setDraw(0);
        //rsp.setRet(0);
        this.setRet(_ret);
        //rsp.setMsg("失败");
        if (_ret == -1) {
            this.setMsg("失败");
        }
        if (_ret == 1) {
            this.setMsg("结果不存在！");
        }
    }
    public XRspJsonPage(Integer _draw,Integer _recordsTotal, Integer _recordsFiltered)
    {
        //this.ret  = _ret;
        this.draw = _draw;
        this.recordsTotal = _recordsTotal;
        this.recordsFiltered = _recordsFiltered;
        //this.data = _t;

    }

    private  int draw;

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public long getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(long recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    private  long recordsTotal;
    private  long recordsFiltered;
}
