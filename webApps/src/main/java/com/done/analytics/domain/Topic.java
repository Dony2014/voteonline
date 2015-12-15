package com.done.analytics.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Dony on 10/27/2014.
 */
@Component
@Entity
public class Topic implements Comparable<Topic> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String topicName;

    @Column(nullable = false)
    private int ticketCount = 0;

    @Column
    private String description;

    @Column
    private String ownerID;

    @Column
    private Boolean isSelected;

    @Column
    private String presentor;

    public String getPresentor() {
        return presentor;
    }

    public void setPresentor(String presentor) {
        this.presentor = presentor;
    }

    public Boolean getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }


    public int getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        if (id != topic.id) return false;
        if (!topicName.equals(topic.topicName)) return false;
        return ownerID.equals(topic.ownerID) && this.compareTo(topic) == 0;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + topicName.hashCode();
        result = 31 * result + ownerID.hashCode();
        return result;
    }

    @Override
    public int compareTo(Topic topic) {
        if (this.hashCode() == topic.hashCode()) {
            return 0;
        } else if (this.hashCode() > topic.hashCode()) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Topic topic1 = new Topic();
        Topic topic2 = new Topic();
        topic1.setId(2);
        topic1.setOwnerID("22");
        topic1.setTopicName("2");

        topic2.setId(2);
        topic2.setOwnerID("22");
        topic2.setTopicName("2");

        System.out.println(topic1.compareTo(topic2));
        System.out.println(topic1.hashCode());
        System.out.println(topic2.hashCode());
    }

}

