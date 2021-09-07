package com.revature.dao;

import com.revature.model.User;

import java.util.List;

public interface UserDao {

    //Check if User Is in Database
    User getOneUser(String uname, String pass);

    //Add Users //Creates
    void createUser (User user);

    //Get User by username
    User forGotInfo(String username);

    //Update User password
    void updateUser(String uname, String pass);

    //Get Users by ID
    List<User> getUserById(Integer userId);
}
