package com.ocean.services;

import com.ocean.repository.LikeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("likeService")
public class LikeService {
    private LikeDao likeDao;

    @Autowired
    public LikeService(LikeDao likeDao){this.likeDao = likeDao;}
}

