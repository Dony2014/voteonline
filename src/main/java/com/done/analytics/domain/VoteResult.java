package com.done.analytics.domain;

/**
 * Created by Dony on 10/28/2014.
 */
public class VoteResult implements Comparable {
    private String topicName;
    private String percentage;
    private String topicOwner;
    private  String presentor;



    @Override
    public int compareTo(Object o) {
        VoteResult temp = (VoteResult) o;
        if (this.topicName.compareTo(temp.getTopicName()) > 0) {
            return 1;
        } else if (this.topicName.compareTo(temp.getTopicName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getPresentor() {
        return presentor;
    }

    public void setPresentor(String presentor) {
        this.presentor = presentor;
    }

    public String getTopicOwner() {
        return topicOwner;
    }

    public void setTopicOwner(String topicOwner) {
        this.topicOwner = topicOwner;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
