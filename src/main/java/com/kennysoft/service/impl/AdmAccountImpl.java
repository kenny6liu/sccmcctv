package com.kennysoft.service.impl;

import com.kennysoft.mapper.*;
import com.kennysoft.model.*;
import com.kennysoft.service.IAdmAccount;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AdmAccountImpl")
public class AdmAccountImpl  implements IAdmAccount {
    @Resource
    private AdmAccountMapper mapper;

    @Override
    public AdmAccount get(Integer id) {
        return null;
    }

    @Override
    public AdmAccount get(XQuery xQuery) {
        return null;
    }

    @Override
    public int save(AdmAccount m) {
        int ret =0;
        if(null !=m)
        {
            if(m.getId() >0)
               ret = mapper.updateByPrimaryKey(m);
            else
                ret  = mapper.insert(m);
        }
        return ret;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }

    @Override
    public int delete(XQuery xQuery) {
        return 0;
    }

    @Override
    public int delete(List<XQuery> queries) {
        return 0;
    }

    @Override
    public long total(XQuery xQuery) {
        return 0;
    }

    @Override
    public long total(List<XQuery> queries) {
        return 0;
    }

    @Override
    public XQueryResult<AdmAccount> list(XPagePara xPagePara, XOrder xOrder) {
        //return null;
        AdmAccountExample exa  = new AdmAccountExample();
        AdmAccountExample.Criteria cri= exa.createCriteria();
        cri.andIdIsNotNull();
        cri.andAccountIsNotNull();

        XQueryResult<AdmAccount> ret  = new XQueryResult<AdmAccount>();
        RowBounds rb = new RowBounds();
        exa.setOffset(xPagePara.getOffset());
        exa.setLimit(xPagePara.getLimit());

        List<AdmAccount> list  = mapper.selectByExample(exa);
        ret.setTotal(mapper.countByExample(exa));
        ret.setList((list));

        return ret;

    }

    @Override
    public XQueryResult<AdmAccount> list(XQuery xQuery, XPagePara xPagePara, XOrder xOrder) {
        return null;
    }

    @Override
    public XQueryResult<AdmAccount> list(List<XQuery> queries, XPagePara xPagePara, XOrder xOrder) {
        return null;
    }

    @Override
    public XQueryResult<AdmAccount> list(XQuery xQuery, XPagePara xPagePara, List<XOrder> xOrders) {
        return null;
    }

    @Override
    public XQueryResult<AdmAccount> list(List<XQuery> queries, XPagePara xPagePara, List<XOrder> xOrders) {
        return null;
    }
    @Override
    public ZCustDataResult selectCustDataResult(ZCustDataExample example)
    {
        ZCustDataResult ret = new ZCustDataResult();
        //example.setFstart( new Date("2018-01-01"));
        //example.setFend( new Date("2018-01-01"));
       // ret  = mapper.selectCustDataResult(example);
        return ret;
    }
}
