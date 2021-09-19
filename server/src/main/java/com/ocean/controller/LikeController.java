package com.ocean.controller;

import com.ocean.models.Like;
import com.ocean.models.Post;
import com.ocean.models.Response;
import com.ocean.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/*
 *    @author
 *      Front End:
 *        -Angel Walker
 *       -Trevor Drury
 *       Back End:
 *        -David Burton
 *        -Shane Danner
 */
@RestController("likeController")
@RequestMapping(value= "api")
@CrossOrigin(value = "http://oceanappbucket.s3-website-us-east-1.amazonaws.com/", allowCredentials = "true")
public class LikeController {
    private LikeService likeService;

    @Autowired
    public LikeController(LikeService likeService){ this.likeService = likeService;}

    //Create a Like
    @PostMapping("like")
    public Response createLike(@RequestBody Like like){
        Response response;
        Like tempLike = this.likeService.createLike(like);
        if(tempLike != null){
            response = new Response(true, "Like has been added to post", like);
        }else{
            response = new Response(false, "Your like was not created", null);
        }
        return response;
    }
    //Get all Likes by PostID
    @GetMapping("like/{postId}")
    public Response getLikeByPostId(@PathVariable Integer postId){
    Response response;
    List<Like> like = this.likeService.getLikeByPostId(postId);
        if(like != null){
        response = new Response(true, "Here is the likes of this post", like);
    }else{
        response = new Response(false, "Post was not found",null);
    }
        return response;
}

    //Get like PostId and by UserId
    @GetMapping("like/{postId}/{userId}")
    public Response getLikeByPostIdAndUserID(@PathVariable Integer postId, @PathVariable Integer userId){
       Response response;
        boolean theyLikedIt = false;
       List<Like> like = this.likeService.getLikeByPostId(postId);
       Integer likeId = 0;
       for(Like a : like){
           if(a.getUser().getUserId().equals(userId)){
               theyLikedIt = true;
               likeId = a.getLikeId();
           }
       }
       if(!theyLikedIt){
           response = new Response(false, "They have not liked this post yet", false);
       }else{
           response = new Response(true, "They have already liked this post", likeId);
       }
       return response;
    }

    //Delete a Like
    @DeleteMapping("like/{likeId}")
    public Response deleteLike(@PathVariable Integer likeId){
        Response response;
        Boolean deleteLike = this.likeService.deleteLike(likeId);
        if(deleteLike){
            response = new Response(true,"Your Like was removed", likeId);
        }else{
            response = new Response(false,"There was an error removing this like", likeId);
        }
        return response;
    }

}
