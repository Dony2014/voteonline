package com.done.analytics.service;

import com.done.analytics.dao.TopicDAO;
import com.done.analytics.dao.UserDAO;
import com.done.analytics.domain.Topic;
import com.done.analytics.domain.VoteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dony on 10/27/2014.
 */

@Service("topicService")
public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO;
    private UserDAO userDAO;

    @Autowired
    public void setTopicDAO(TopicDAO topicDAO) {
        this.topicDAO = topicDAO;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<Topic> listTopics() {
        List<Topic> resultList = this.topicDAO.getTopicList();
        Collections.sort(resultList);
        return resultList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Topic> listTopics(String selectedTopics) {
        List<Topic> topicList = this.topicDAO.getTopicList();
        for (Topic topic : topicList) {
            if (selectedTopics.contains(new Integer(topic.getId()).toString())) {
                topic.setIsSelected(true);
            }
        }
        return topicList;
    }

    @Override
    @Transactional
    public void updateTopicsVote(String selectedTopics) {

        for (Topic topic : this.topicDAO.getTopicList()) {
            if (selectedTopics.contains(new Integer(topic.getId()).toString())) {
                topic.setTicketCount(topic.getTicketCount() + 1);
            }
        }
    }

    @Override
    @Transactional
    public List<VoteResult> getVoteResult(boolean flag) {
        int userCount = this.userDAO.getUserCount();
        List<VoteResult> resultList = new ArrayList<VoteResult>();
        for (Topic topic : this.topicDAO.getTopicList()) {
            VoteResult result = new VoteResult();
            result.setTopicOwner(topic.getOwnerID());
            result.setTopicName(topic.getTopicName());
            result.setPresentor(topic.getPresentor());
            double percentage = (topic.getTicketCount() / (double) userCount) * 100;
            percentage = Math.round(percentage);
            result.setPercentage(percentage + "%");
            resultList.add(result);
        }
        if (flag) {
            Collections.reverse(resultList);
        } else {
            Collections.sort(resultList);
        }

        return resultList;
    }

    @Override
    @Transactional
    public Topic addTopic(Topic topic) {
        return topicDAO.create(topic);
    }


    private String UpFirstCase(String str) {
        char[] items = str.toCharArray();
        if (Character.isLetter(items[0])) {
            items[0] = Character.toUpperCase(items[0]);
            return new String(items);
        } else {
            return str;
        }
    }
}
