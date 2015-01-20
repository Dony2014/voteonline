package com.oracle.emqa.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Dony on 10/24/2014.
 */
@Component
@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "isvoted", nullable = false)
    private Boolean isVoted = false;

    @Column(name = "votedtopics")
    private String votedTopics = "";

    @Column(name = "availablecount")
    private int availableCount ;

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

