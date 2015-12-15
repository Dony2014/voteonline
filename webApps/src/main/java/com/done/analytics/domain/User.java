package com.done.analytics.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Dony on 10/24/2014.
 */
@Component
@Entity
@Table
public class User implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String userName;

    @Column
    private String password;

    @Column(nullable = false)
    private Boolean isVoted = false;

    @Column(nullable = false)
    private String votedTopics;

    @Column
    private int availableCount;

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public Boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(Boolean isVoted) {
        this.isVoted = isVoted;
    }

    public String getVotedTopics() {
        return votedTopics;
    }

    public void setVotedTopics(String votedTopics) {
        this.votedTopics = votedTopics;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id =" + this.getId() + ", userName=" + this.getUserName() + ", password=" + this.getPassword();
    }
}

