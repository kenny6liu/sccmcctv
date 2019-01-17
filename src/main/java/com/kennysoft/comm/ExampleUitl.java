package com.kennysoft.comm;

import com.kennysoft.model.*;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.util.List;

public class ExampleUitl<T> {

    private static Logger logger = Logger.getLogger(ExampleUitl.class);

    public void getExample(T example, XQuery xQuery) throws  Exception {

        Method create = example.getClass().getDeclaredMethod("createCriteria");
        Object criteria = create.invoke(example);
        // T t =null;
        //logger.info("T[i]class name:" + t.getClass().getName());
        // Class cz = Class.forName(example.getClass().getName()+".criteria");


        Class cCrit = criteria.getClass();

            /*for(Method m : cCrit.getMethods())
            {
                logger.info("debug[*]" + m.getName());
            }
            */

        Method query = cCrit.getDeclaredMethod("and" + xQuery.getField() + xQuery.getStyle(), xQuery.getValue().getClass());

        query.invoke(criteria, xQuery.getValue());

        // KsMenuExample example1 = new KsMenuExample();
        // KsMenuExample.Criteria  criteria1 =  example1.createCriteria();
        // criteria1.andKsTextLike()
        // criteria.andIdIn()
        logger.info("success[i]rebulid example success.");

        //return example;


    }

    public void getExample(T example, List<XQuery> xQueries) throws Exception {

        Method create = example.getClass().getDeclaredMethod("createCriteria");
        Object criteria = create.invoke(example);
        Class cCrit = criteria.getClass();
        for (XQuery xQuery : xQueries) {
            Method query = cCrit.getDeclaredMethod("and" + xQuery.getField() + xQuery.getStyle(), xQuery.getValue().getClass());

            query.invoke(criteria, xQuery.getValue());
        }

    }
}
