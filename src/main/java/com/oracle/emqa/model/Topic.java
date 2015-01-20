package com.oracle.emqa.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Dony on 10/27/2014.
 */
@Component
@Entity
@Table(name = "TOPIC")
public class Topic implements Comparable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "topicname")
    private String topicName;

    @Column(name = "ticketcount", nullable = false)
    private int ticketCount = 0;

    @Column(name = "description")
    private String description;

    @Column(name = "ownerid")
    private String ownerID;

    @Column(name = "isSelected")
    private Boolean isSelected;

    @Column(name = "presentor")
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
    public int compareTo(Object o) {
        Topic temp = (Topic) o;
        if (this.getTopicName().compareTo(temp.getTopicName()) > 1) {
            return 1;
        } else if (this.getTopicName().compareTo(temp.getTopicName()) < 1) {
            return -1;
        } else {
            return 0;

        }
    }
}

