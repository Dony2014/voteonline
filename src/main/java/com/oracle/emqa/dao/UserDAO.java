package com.oracle.emqa.dao;

import com.oracle.emqa.model.User;

/**
 * Created by Dony on 10/24/2014.
 */


public interface UserDAO {
    public boolean addUser();

    public boolean updateUser(User user);

    public User quertUser(User user);

    public User  getUserById(int id);

    public int getUserCount();


}
