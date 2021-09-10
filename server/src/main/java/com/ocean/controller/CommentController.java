package com.ocean.controller;

import com.ocean.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController("commentController")
@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class CommentController {
    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){ this.commentService = commentService;}
}
