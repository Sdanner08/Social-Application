package com.ocean.services;

import com.ocean.models.User;
import com.ocean.repository.UserDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    UserService userService;
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    UserDao userDao;
    User shane;

    @BeforeEach
    void setUp() { this.userService = new UserService(userDao);
        shane = mock(User.class);

    }

/*    @Test
    void loginReturnNotNull() {
        User user = new User("Shane","password123");
        String encoded = "$2a$10$JOaTsw47QIBUVYn.E7HBZeJWFQkzr/AYkv1ciZedQJ0aiR2emg18.";

        Mockito.when(userService.checkForUser(user.getUsername())).thenReturn(user);
        boolean isPasswordMatch = bCryptPasswordEncoder.matches(encoded, user.getPassword());

        assertTrue(isPasswordMatch == true);
       // assertTrue(this.userService.login(user) == user);
       // Mockito.verify(userDao, Mockito.times(1)).login(user);
    }*/



    /*
    @Test
    void createUser() {
        User user = new User("Shane","password123");
        String encode = bCryptPasswordEncoder.encode(user.getPassword());
        assertTrue(bCryptPasswordEncoder.matches(encode, user.getPassword()));

    }
    */

    /*    public User forGotInfo(String username) {
        //check to see if user is already in database
        User tempUser = checkForUser(username);
        if(tempUser != null){
            return tempUser;
        }
        return null;
    }

*/

    @Test
    void forGotInfo() {

        //when(shane.getUserId()).thenReturn(1);
        //when(shane.getUsername()).thenReturn("Shane");
        //Okay do not use these whens.

        when(userService.checkForUser("Shane")).thenReturn(shane);

        assertNull(userService.forGotInfo("NotARealUsername"));
        assertNotNull(userService.forGotInfo("Shane"));
    }

    /*    //Will update User
    public User updateUser(User user) {
        //Gets the user from Database
        User dataBaseUser =this.userDao.findUserByUsername(user.getUsername());
        //Checks to see if a result was returned
        if(dataBaseUser != null){
            //To make sure the ID & Password doesn't get changed by anyone
            user.setUserId(dataBaseUser.getUserId());
            user.setPassword(dataBaseUser.getPassword());
            //Executes the update
            this.userDao.save(user);
            //Returns the updated user
            return user;
        }
        return null;
    }*/

    @Test
    void updateUser() {

    }

    @Test
    void getUserById() {

        /*
        David: Okay so I don't know why, but I can call a UserDao that doesn't seem to actually exist in my copy
        of the program. It seems to be calling an interface, I'm not sure if that's a JPArepository thing or whatever.

        I left what's here in a basic approximation of what I'm trying to do.*/


        /*
        int testId = 1;
        int falseId = 999999;

        when(userDao.findById(1)).thenReturn(shane);


        assertNotNull(userService.getUserById(testId));
        assertNull(userService.getUserById(falseId));

        */
    }

    @Test
    void checkForUserReturnNull() {
        assertNull(userService.checkForUser("ANameThatIsntInTheDatabase"));
    }

    @Test
    void getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        assertNotNull(allUsers);
        System.out.println("List of Users: " + allUsers);
    }
}