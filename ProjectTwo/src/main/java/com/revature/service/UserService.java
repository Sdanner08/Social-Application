package com.revature.service;

import com.revature.dao.UserDao;
import com.revature.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("userService")
public class UserService {

/*    //Check if User Is in Database
    User login(User user);

    //Add Users to database
    User register(User user);

    //Get User by username
    User forGotInfo(String username);

    //Update User
    void updateUser(User user);

    //Get Users by ID
    User getUserById(Integer userId);*/


    UserDao userDao;


    @Autowired
    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public User register(User user) { return this.userDao.createUser(user);}
/*    public User login(User user){ return this.userDao.login(user); }


    public User register(User user) { return this.userDao.createUser(user);}


    public User forGotInfo(String username) { return this.userDao.forGotInfo(username); }


    public void updateUser(User user) { this.userDao.updateUser(user); }


    public User getUserById(Integer userId) { return this.userDao.getUserById(userId);}*/


/*
https://www.tutorialspoint.com/spring_boot/spring_boot_service_components.htm
*/


    ///Putting this here so I don't loose it This is for password encryption
    /*https://www.devglan.com/spring-security/spring-boot-security-password-encoding-bcrypt-encoder*/
/*
    https://jar-download.com/artifacts/org.springframework.security/spring-security-crypto/4.1.3.RELEASE/source-code/org/springframework/security/crypto/bcrypt/BCryptPasswordEncoder.java
*/

    ///This is for email sending
/*    https://java.tutorials24x7.com/blog/how-to-send-email-in-java*/

    //Was a good source of ideas
/*    https://medium.com/javarevisited/a-simple-user-authentication-api-made-with-spring-boot-4a7135ff1eca*/

}
