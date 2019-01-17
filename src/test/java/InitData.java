import java.io.File;
import java.util.Iterator;
import java.util.List;


import com.kennysoft.mapper.KsMenuMapper;
import com.kennysoft.model.TmpMenu;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.annotation.Resource;
import javax.print.DocFlavor;


public class InitData {
    private static Logger logger = Logger.getLogger(InitData.class);
    @Resource
    private static KsMenuMapper ksMenuMapper;

    @Test
    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(InitData.class.getResource("menu.xml").getPath()));

            String xpath = "/root/menu";
            List  list = document.selectNodes(xpath);


            TmpMenu menu = new TmpMenu();
            Iterator iterator = list.listIterator();
            while(iterator.hasNext())
            {
                Element element = (Element)iterator.next();
                menu= new TmpMenu();
                menu.setText(element.attributeValue("text"));
                menu.setValue(element.attributeValue("value"));
                menu.setOrder(element.attributeValue("order"));
                menu.setIcon(element.attributeValue("icon"));

                logger.info("size[*]"+ element.selectNodes("menu").size());
                ksMenuMapper.insert(menu);

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