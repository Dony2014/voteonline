package com.done.analytics.dao;


import com.done.analytics.domain.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dony on 10/27/2014.
 */
@Repository("topicDao")
public class TopicDAOImpl implements TopicDAO {

    private static final Logger logger = LoggerFactory.getLogger(TopicDAOImpl.class);

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public List<Topic> getTopicList() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Topic> topicList = session.createQuery("from Topic").list();
        return topicList;
    }

    @Override
    public Topic create(Topic topic) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(topic);
        return topic;
    }
}
