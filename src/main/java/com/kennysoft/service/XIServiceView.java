package com.kennysoft.service;

import com.kennysoft.model.XOrder;
import com.kennysoft.model.XPagePara;
import com.kennysoft.model.XQuery;
import com.kennysoft.model.XQueryResult;

import java.util.List;

public interface XIServiceView<T>  {

    /**
     *  通过数据库ID获取单对象
     * @param id 主键
     * @return 满足条件的对象
     */
    public T get(Integer id);
    public long total(XQuery xQuery);

    /**
     * 根据条件集统计记录数据
     * @param xQueries
     * @return
     */
    public long total(List<XQuery> xQueries);

    /**
     * 分页查询对象集
     * @param xPagePara 分页参数
     * @param xOrder 排序参数
     * @return 返回含有满足条件总及当前面的对象集
     */
    public XQueryResult<T> list(XPagePara xPagePara, XOrder xOrder);

    /**
     * 根据条件分页查询
     * @param xQuery 查询单条件
     * @param xPagePara 分页参数
     * @param xOrder 排序参数
     * @return 返回含有满足条件总及当前面的对象集
     */
    public XQueryResult<T> list(XQuery xQuery, XPagePara xPagePara, XOrder xOrder);

    /**
     * 根据条件分页查询
     * @param xQueries 查询多条件
     * @param xPagePara 分页参数
     * @param xOrder 排序参数
     * @return 返回含有满足条件总及当前面的对象集
     */
    public XQueryResult<T> list(List<XQuery> xQueries, XPagePara xPagePara, XOrder xOrder);

    /**
     *
     * @param xQuery 多条件
     * @param xPagePara 分页参数
     * @param xOrders 排序多参数
     * @return 返回含有满足条件总及当前面的对象集
     */
    public XQueryResult<T> list(XQuery xQuery, XPagePara xPagePara, List<XOrder> xOrders);

    /**
     *
     * @param xQueries 多条件
     * @param xPagePara 分页参数
     * @param xOrders  排序多条件
     * @return 返回含有满足条件总及当前面的对象集
     */
    public XQueryResult<T> list(List<XQuery> xQueries, XPagePara xPagePara, List<XOrder> xOrders);
}