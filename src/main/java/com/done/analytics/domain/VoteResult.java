package com.done.analytics.domain;

/**
 * Created by Dony on 10/28/2014.
 */
public class VoteResult implements Comparable<VoteResult> {
    private String topicName;
    private String percentage;
    private String topicOwner;
    private String presenter;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VoteResult)) return false;

        VoteResult that = (VoteResult) o;

        if (!getTopicName().equals(that.getTopicName())) return false;
        if (getPercentage() != null ? !getPercentage().equals(that.getPercentage()) : that.getPercentage() != null)
            return false;
        if (getTopicOwner() != null ? !getTopicOwner().equals(that.getTopicOwner()) : that.getTopicOwner() != null)
            return false;
        if (this.compareTo(that) != 0) {
            return false;
        }
        return !(getPresenter() != null ? !getPresenter().equals(that.getPresenter()) : that.getPresenter() != null);

    }

    @Override
    public int hashCode() {
        int result = getTopicName().hashCode();
        result = 31 * result + (getPercentage() != null ? getPercentage().hashCode() : 0);
        result = 31 * result + (getTopicOwner() != null ? getTopicOwner().hashCode() : 0);
        result = 31 * result + (getPresenter() != null ? getPresenter().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(VoteResult o) {

        if (this.getTopicName().equals(o.getTopicName()) && this.getTopicOwner().equals(o.getTopicOwner())) {
            return 0;
        } else if (this.hashCode() > o.hashCode()) {
            return 1;
        } else {
            return -1;
        }
    }
}
