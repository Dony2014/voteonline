package com.oracle.emqa.service;

import com.oracle.emqa.model.Topic;
import com.oracle.emqa.model.VoteResult;

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
