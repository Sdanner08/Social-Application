package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;
import com.revature.model.User;

import java.util.List;

public interface UserService {
    User login(User user);

    //Check if User Is in Database
/*    User getOneUser(String uname, String pass){return userDao.getOneUser(uname, pass);};*/

    User register(User user);
    //Add Users //Creates
/*    public void createUser(User user){userDao.createUser(user);};*/



/*    //Get User by username
    User forGotInfo(String username){return userDao.forGotInfo(username);}

    //Update User password
    void updateUser(String uname, String pass){userDao.updateUser(uname, pass);}

    //Get Users by ID
    List<User> getUserById(Integer userId){return userDao.getUserById(userId);}*/


}
