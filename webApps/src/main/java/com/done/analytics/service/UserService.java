package com.done.analytics.service;


import com.done.analytics.domain.User;

/**
 * Created by Dony on 10/24/2014.
 */
public interface UserService {
    public User queryUser(User user);
    public  void updateVoteStatus(User user);
    public void updateAvailableCount(User user);
}
