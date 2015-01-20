package com.oracle.emqa.dao;

import com.oracle.emqa.model.Topic;

import java.util.List;

/**
 * Created by Dony on 10/27/2014.
 */
public interface TopicDAO {
    public List<Topic> getTopicList();
    public Topic create(Topic topic);
}
