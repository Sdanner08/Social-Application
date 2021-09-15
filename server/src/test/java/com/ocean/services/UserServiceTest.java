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

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    UserService userService;
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Mock
    UserDao userDao;

    @BeforeEach
    void setUp() { this.userService = new UserService(userDao);
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

/*    @Test
    void checkForUserReturnNull() {

    }*/

/*    @Test
    void createUser() {
        User user = new User("Shane","password123");
        String encode = bCryptPasswordEncoder.encode(user.getPassword());
        boolean matches;
        assertTrue( matches = bCryptPasswordEncoder.matches(encode, user.getPassword()));

    }*/

    @Test
    void forGotInfo() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void getAllUsers() {
    }
}