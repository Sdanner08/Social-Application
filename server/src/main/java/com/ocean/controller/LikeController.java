package com.ocean.controller;

import com.ocean.models.Like;
import com.ocean.models.Response;
import com.ocean.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("likeController")
@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class LikeController {
    private LikeService likeService;

    @Autowired
    public LikeController(LikeService likeService){ this.likeService = likeService;}

    //Create a Like
    @PostMapping("like")
    public Response createLike(@RequestBody Like like){
        return null;
    }

    //Read a Like
    @GetMapping("like/user/{userId}")
    public Response getLikeByUser(@PathVariable Integer userId){
        return null;
    }
    @GetMapping("like/post/{postId}")
    public Response getLikeByPost(@PathVariable Integer postId){
        return null;
    }
    @GetMapping("like/{likeId}")
    public Response getLikeById(@PathVariable Integer likeId){
        return null;
    }

    //Update a Like
    @PutMapping("updateLike")
    public Response updateLike(@RequestBody Like like){
        return null;
    }

    //Delete a Like
    @DeleteMapping("like/{likeId}")
    public Response deleteLike(@PathVariable Integer likeId){
        return null;
    }

}
