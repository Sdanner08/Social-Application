package com.revature.service;

import com.revature.model.User;

public interface UserServiceInterface {
    User login(User user);
    User register(User user);
}
