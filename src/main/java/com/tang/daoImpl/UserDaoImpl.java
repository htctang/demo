package com.tang.daoImpl;

import com.tang.dao.UserDao;
import com.tang.entity.UserTbEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by 唐川htc on 2016/5/30.
 */
@Transactional
@Service
public class UserDaoImpl implements UserDao {
    @Resource private SessionFactory sessionFactory;
    public void save(UserTbEntity entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
    }
}
