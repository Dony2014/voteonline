package com.done.analytics.service;

import com.done.analytics.dao.UserDAO;
import com.done.analytics.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dony on 10/24/2014.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDAO userDao;

    @Autowired
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public User queryUser(User user) {
        user = userDao.quertUser(user);
        if (user.getId() != 0) {
            return user;
        } else {
            return null;
        }

    }

    @Override
    @Transactional
    public void updateVoteStatus(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void updateAvailableCount(User user) {
        userDao.updateUser(user);
    }
}
