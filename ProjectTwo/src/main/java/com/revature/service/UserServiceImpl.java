package com.revature.service;

import com.revature.model.User;

public class UserServiceImpl implements UserServiceInterface{
    public User login(User user){
        System.out.println("UserService.login");
        //First, make sure the username exists
        User tempUser = userDao.getOneUser(user.getUsername());

        //If no user is found, or if the password retrieved doesn't match the password given, it returns null...
        if(tempUser == null || !tempUser.getPassword().equals(user.getPassword()))
            return null;

        return tempUser;
    }
}
