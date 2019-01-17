package com.kennysoft.service.impl;

import com.kennysoft.comm.ExampleUitl;
import com.kennysoft.mapper.KsMenuMapper;
import com.kennysoft.model.*;
import com.kennysoft.service.IKsMenu;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import sun.reflect.annotation.ExceptionProxy;

import javax.annotation.Resource;
import javax.net.ssl.KeyManagerFactorySpi;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service("KsMenuImpl")
public class KsMenuImpl implements IKsMenu {
    private static Logger logger = Logger.getLogger(KsMenuImpl.class);
    @Resource
    private KsMenuMapper mapper;

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public com.kennysoft.model.KsMenu get(Integer id) {
        KsMenu m  = null;
        try
        {
           mapper.selectByPrimaryKey(id);

        }catch (Exception ex)
        {
            logger.error("faile[X]" + ex.getMessage());
        }
           return m;
    }

    @Override
    public com.kennysoft.model.KsMenu get(XQuery xQuery) {

        KsMenu m = null;
        try
        {
            XPagePara xPagePara=new XPagePara();
            xPagePara.setLimit(1);
            xPagePara.setOffset(0);
            XOrder xOrder =null;
            XQueryResult<KsMenu> ret  = list(xQuery,xPagePara,xOrder);
            if(ret.getTotal()> 0)
            {
                m = ret.getList().get(0);
            }
        }
        catch (Exception ex)
        {
          logger.error("faile[X]" + ex.getMessage());
        }
        return m;

    }

    @Override
    public int save(com.kennysoft.model.KsMenu m) {
        int ret = 0;
        try {
            if (m.getId() == 0)
                ret = mapper.insert(m);
            else
                ret = mapper.updateByPrimaryKey(m);
        }
        catch (Exception ex)
        {
            ret =-1;
            logger.error("faile[x]" + ex.getMessage());
        }

        return ret;
    }

    @Override
    public int delete(Integer id) {
        int ret  =0;
        try {
            ret = mapper.deleteByPrimaryKey(id);
        }
        catch (Exception ex)
        {
            ret =-1;
            logger.error("faile[x]" + ex.getMessage());
        }
        return ret;
    }

    @Override
    public int delete(XQuery xQuery) {
        List<XQuery> xQueries =new  ArrayList();
        xQueries.add(xQuery);

        return delete(xQueries);
    }


    @Override
    public int delete(List<XQuery> xQueries) {

        int ret =0;
        try {
            KsMenuExample example = new KsMenuExample();
            ExampleUitl<KsMenuExample> util = new ExampleUitl<>();
            util.getExample(example, xQueries);

            ret = mapper.deleteByExample(example);
        }
        catch (Exception ex)
        {
            ret =-1;
            logger.error("faile[x]" + ex.getMessage());
        }
        return ret;
    }

    @Override
    public long total(XQuery xQuery) {

        List<XQuery> xQueries = new ArrayList<>();
        xQueries.add(xQuery);

        return total(xQueries);
    }

    @Override
    public long total(List<XQuery> xQueries) {
        long ret =0;
        try {
            ExampleUitl<KsMenuExample> util = new ExampleUitl<>();
            KsMenuExample example = new KsMenuExample();
            util.getExample(example, xQueries);
            ret = mapper.countByExample(example);
        }
        catch (Exception ex)
        {
            ret = -1;
            logger.error("faile[x]" + ex.getMessage());
        }
        return ret;
    }

    @Override
    public XQueryResult<com.kennysoft.model.KsMenu> list(XPagePara xPagePara, XOrder xOrder) {
        XQuery xQuery =null;
        return  list(xQuery,xPagePara,xOrder);
    }

    @Override
    public XQueryResult<com.kennysoft.model.KsMenu> list(XQuery xQuery, XPagePara xPagePara, XOrder xOrder)
    {
        List<XQuery> xQueries = new ArrayList<>();
        if(xQuery !=null)
            xQueries.add(xQuery);
        List<XOrder> xOrders= new ArrayList<>();
        if(xOrder!=null)
            xOrders.add(xOrder);
        return list(xQueries,xPagePara,xOrders);
    }

    @Override
    public XQueryResult<com.kennysoft.model.KsMenu> list(List<XQuery> xQueries, XPagePara xPagePara, XOrder xOrder) {
        List<XOrder> xOrders= new ArrayList<>();
        if(xOrder!=null)
            xOrders.add(xOrder);
        return list(xQueries,xPagePara,xOrders);
    }

    @Override
    public XQueryResult<com.kennysoft.model.KsMenu> list(XQuery xQuery, XPagePara xPagePara, List<XOrder> xOrders) {
        List<XQuery> xQueries = new ArrayList<>();
        if(xQuery !=null)
            xQueries.add(xQuery);
        return list(xQueries,xPagePara,xOrders);
    }

    @Override
    public XQueryResult<com.kennysoft.model.KsMenu> list(List<XQuery> xQueries, XPagePara xPagePara, List<XOrder> xOrders) {

        XQueryResult ret = new XQueryResult();
        try{
            KsMenuExample example = new KsMenuExample();
            ExampleUitl<KsMenuExample> util  = new ExampleUitl();
            util.getExample(example,xQueries);
            if(xPagePara!=null)
            {
                example.setLimit(xPagePara.getLimit());
                example.setOffset(xPagePara.getOffset());
            }
            if(xOrders.size() > 0)
            {
                for(XOrder xOrder : xOrders)
                {
                    example.setOrderByClause(xOrder.getField() + " " +xOrder.getStyle());
                }
            }

           List<KsMenu> list  =  mapper.selectByExample(example);
           long total = this.total(xQueries);
           if(total > 0) {
               ret.setTotal(total);
               ret.setList(list);
           }
        }
        catch (Exception ex)
        {
            long fret =-1;
            ret.setTotal(fret);

        }


        return ret;
    }
}
