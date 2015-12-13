package com.done.analytics.service;

import com.done.analytics.domain.Topic;
import com.done.analytics.domain.VoteResult;

import java.util.List;

/**
 * Created by Dony on 10/27/2014.
 */
public interface TopicService {
    public List<Topic> listTopics();
    public List<Topic> listTopics(String selectedTopics);
    public void updateTopicsVote(String selectedTopics);
    public List<VoteResult>getVoteResult(boolean flag);
    public Topic addTopic(Topic topic);

}
