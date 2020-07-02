package com.hr;

import com.hr.dao.impl.AccountDaoImpl;
import com.hr.service.IAccountService;
import com.hr.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {
//        testIoc01();
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as = (IAccountService) applicationContext.getBean("accountService");
        //手动关闭容器
        applicationContext.close();

    }

    private static void testIoc01() {
        //        /*-------------ApplicationContext-------------*/
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        AccountServiceImpl accountService = (AccountServiceImpl) ac.getBean("accountService");
//        AccountDaoImpl accountDao = (AccountDaoImpl) ac.getBean("accountDao");
//        System.out.println(accountService);
//        System.out.println(accountDao);


        //        /*-------------BeanFactory-------------*/
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        AccountServiceImpl accountService = (AccountServiceImpl) factory.getBean("accountService");
        System.out.println(accountService);
    }
}
