package com.oracle.emqa.dao;

import com.oracle.emqa.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dony on 10/24/2014.
 */

@Repository
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public boolean addUser() {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
        return true;
    }

    @Override
    public User quertUser(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        String hql = "from User where userName = ? and password= ?";
        Query query = session.createQuery(hql);
        query.setParameter(0, user.getUserName());
        query.setParameter(1, user.getPassword());
        if (query.list().size() > 0) {
            List<User> result = (List<User>) session.createQuery("from User").list();

        }

        logger.info(user.toString());
        return user;
    }

    @Override
    public int getUserCount() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from User").list().size();
    }

    @Override
    public User getUserById(int id) {
        return null;
    }
}
