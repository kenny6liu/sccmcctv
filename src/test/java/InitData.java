import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.kennysoft.model.KsMenu;
import com.kennysoft.model.TmpMenu;
import com.kennysoft.service.IKsMenu;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  //必须标注，否则不执行spring的注入
public class InitData {
    private static Logger logger = Logger.getLogger(InitData.class);

    @Resource
    private  IKsMenu service;

    @Test
    public   void menuTest() {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(InitData.class.getResource("menu.xml").getPath()));

            String xpath = "/root/menu";
            List  list = document.selectNodes(xpath);


            TmpMenu menu = new TmpMenu();
            Iterator iterator = list.listIterator();
            int ret =0;
            while(iterator.hasNext())
            {
                Element element = (Element)iterator.next();
                menu= new TmpMenu();
                menu.setText(element.attributeValue("text"));
                menu.setValue(element.attributeValue("value"));
                menu.setOrder(element.attributeValue("order"));
                menu.setIcon(element.attributeValue("icon"));

                logger.info("children size[*]"+ element.selectNodes("menu").size());

                KsMenu ksMenu = new KsMenu();
                ksMenu.setId(0);
                ksMenu.setKsText(menu.getText());
                ksMenu.setKsValue(menu.getValue());
                ret = service.save(ksMenu);

                for(Object o : element.selectNodes("menu"))
                {
                    logger.info(((Element)o).attributeValue("text"));
                }
            }

        } catch (Exception ex) {
            logger.info("error[*]" + ex.getMessage());
        }
    }
}