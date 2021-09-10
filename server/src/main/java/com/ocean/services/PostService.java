package com.ocean.services;

import com.ocean.repository.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("postService")
public class PostService {
    private PostDao postDao;

    @Autowired
    public PostService(PostDao postDao){this.postDao = postDao;}
}

