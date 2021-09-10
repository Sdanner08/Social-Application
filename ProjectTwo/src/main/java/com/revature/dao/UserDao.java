package com.revature.dao;

import com.revature.model.User;

public interface UserDao {

    //Check if User Is in Database
    User login(User user);

    //Add Users //Creates
    User createUser (User user);

    //Get User by username
    User forGotInfo(String username);

    //Update User info
    void updateUser(User user);

    //Get User by ID
    User getUserById(Integer userId);
}
