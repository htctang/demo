package com.tang.test;


import com.tang.dao.UserDao;
import com.tang.entity.UserTbEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 唐川htc on 2016/5/29.
 */
public class Mtest {
    @Test
    public void fitstTest(){

        System.out.println("唐testt");
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
        Session session = sf.openSession();
        UserTbEntity entity = new UserTbEntity();
        entity.setName("testtt");
        entity.setPassword("ttt");
        session.save(entity);
    }

}
