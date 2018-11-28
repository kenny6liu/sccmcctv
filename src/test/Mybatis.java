import com.kennysoft.model.XPagePara;
import com.kennysoft.model.*;
import com.kennysoft.model.XQueryResult;
import com.kennysoft.service.IAdmAccount;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  //必须标注，否则不执行spring的注入
public class Mybatis {

    private static Logger logger = Logger.getLogger(Mybatis.class);

    @Resource
    private IAdmAccount service ;

    @Test
    public void mybatis_insert_test() throws Exception
    {
        AdmAccount m;
        for(int i =0;i <1000000;i++) {
            m = new AdmAccount();
            m.setId(0);
            m.setAccount("account_" + i);
            m.setName("name_" + i);
            m.setPassword("password_" + i);
            m.setPhone("phone_" + i);
            m.setRemark("remark_" +i);
            service.save(m);
           // logger.info(m.toString());
        }
        logger.info("over");
    }

    @Test
    public void mybatis_limit_test() throws Exception {
        XPagePara xPagePara= new XPagePara();
        XOrder xOrder = new XOrder();
        xPagePara.setLimit(10);
        xPagePara.setOffset(10000);
        XQueryResult<AdmAccount> ret = service.list(xPagePara,xOrder);

        if(ret.getTotal()>0)
        {
            for (AdmAccount m:
                 ret.getList()) {
                logger.info(m.getId() +"[*]" + m.getName());

            }
        }

    }
    @Test
    public void mybatis_cust_method() throws Exception
    {
        ZCustDataExample example = new ZCustDataExample();
        example.setFstart((new SimpleDateFormat("yyyy-MM-dd")).parse("2019-01-01"));
        example.setFend((new SimpleDateFormat("yyyy-MM-dd")).parse("2019-12-01"));
        ZCustDataResult result =   service.selectCustDataResult(example);
        if(null != result)
            logger.info("success  id[*]   " +  result.getFid()  + " Date " + result.getFdate().toString());
        else
            logger.info("no data found.");

    }

}
