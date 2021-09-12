package com.ocean.services;

import com.ocean.models.User;
import com.ocean.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao){this.userDao = userDao;}
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    //Login
    public User login(User user){
        User tempUser = checkForUser(user.getUsername());
        //checks if the search returns a user object
        if(tempUser != null){
            //Checks to make sure their passwords match
            System.out.println("-------------");
            System.out.println(tempUser.getPassword());
            System.out.println("-------------");
            boolean isPasswordMatch = passwordEncoder.matches(user.getPassword(), tempUser.getPassword());
            System.out.println(isPasswordMatch);
            if(isPasswordMatch == true){
                return tempUser;
            }
        }
        return null;
    }

    //Checks for if a User is in the Database
    public User checkForUser(String username){ return this.userDao.findUserByUsername(username); }

    //Register/signUp user
    public User createUser(User user) {
        //check to see if user is already in database
        User tempUser = checkForUser(user.getUsername());
        //If username is not found in database it will create the user
        if (tempUser == null) {
            String bcPass = user.getPassword();
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String encode = passwordEncoder.encode(bcPass);
            user.setPassword(encode);
            return this.userDao.save(user);
        }
        //if tempUser returns something from database it'll return null as username is in use
        return null;
    }

    //If User forgot login info
    public User forGotInfo(String username) {
        //check to see if user is already in database
        User tempUser = checkForUser(username);
        if(tempUser != null){
            return tempUser;
            //need to input email stuff here!!!!!!!!!!!!!!!!!!!!!!!!!
        }
        return null;
    }

    //Will update User
    public User updateUser(User user) {
        //Gets the user from Database
        User dataBaseUser =this.userDao.findUserByUsername(user.getUsername());
        //Checks to see if a result was returned
        if(dataBaseUser != null){
            //To make sure the ID doesn't get changed by anyone
            user.setUserId(dataBaseUser.getUserId());
            //Executes the update
            this.userDao.save(user);
            //Returns the updated user
            return user;
        }
        return null;
    }

    //Will get a user by Id
    public User getUserById(Integer userId) {
        return this.userDao.findById(userId).orElse(null);
    }

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


