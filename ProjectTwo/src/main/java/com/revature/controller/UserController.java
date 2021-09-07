package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Response;
import com.revature.service.UserServiceImpl;
import com.revature.service.UserServiceInterface;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.model.User;

public class UserController {

    //Please work.

    private static UserController userController;
    UserServiceInterface userService;

    private UserController() {
        userService = new UserServiceImpl();
    }

    public static UserController getInstance() {
        System.out.println("UserController.getInstance()");

        if (userController == null)
            userController = new UserController();

        System.out.println("UserController.getInstance() (not null)");

        return userController;
    }


    public void login(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("UserController.login");
        res.setContentType("application/json");
        PrintWriter out = res.getWriter();

        String requestBody = req.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        User user = new ObjectMapper().readValue(requestBody, User.class);

        User tempUser = userService.login(user);

        if (tempUser != null) {
            //create session if successful
            HttpSession httpSession = req.getSession(true);
            httpSession.setAttribute("userObj", tempUser);

            out.println((new ObjectMapper().writeValueAsString(new Response("login successful", true, tempUser))));
        } else {
            out.println(new ObjectMapper().writeValueAsString(new Response("Invalid username or password. (Remember, these are case sensitive!)", false, null)));
        }

    }
}
