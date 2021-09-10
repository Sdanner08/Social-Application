package com.ocean.controller;

import com.ocean.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController("postController")
@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService){ this.postService = postService;}
}
