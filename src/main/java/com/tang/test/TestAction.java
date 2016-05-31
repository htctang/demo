package com.tang.test;

import com.opensymphony.xwork2.ActionContext;
import com.tang.dao.UserDao;
import com.tang.entity.UserTbEntity;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by 唐川htc on 2016/5/29.
 */

public class TestAction {
    @Resource
    private UserDao userDao;
    public String test(){
     /*   System.out.println("---mevan测试----");
        Map<String,Object> session =  ActionContext.getContext().getSession();
        session.put("test","testtttt");
        session.put("tang","唐川");*/
        UserTbEntity userTbEntity = new UserTbEntity();
        userTbEntity.setPassword("test");
        userTbEntity.setName("test");
        userDao.save(userTbEntity);
        return "test";
    }
}
