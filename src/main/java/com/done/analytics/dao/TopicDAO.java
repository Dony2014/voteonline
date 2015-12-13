package com.done.analytics.dao;

import com.done.analytics.domain.Topic;

import java.util.List;

/**
 * Created by Dony on 10/27/2014.
 */
public interface TopicDAO {
    public List<Topic> getTopicList();
    public Topic create(Topic topic);
}
