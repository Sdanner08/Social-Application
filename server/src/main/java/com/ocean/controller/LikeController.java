package com.ocean.controller;

import com.ocean.models.Like;
import com.ocean.models.Post;
import com.ocean.models.Response;
import com.ocean.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("likeController")
@RequestMapping(value= "api")
//@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
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
    //Delete a Like
    @DeleteMapping("like/{likeId}")
    public Response deleteLike(@PathVariable Integer likeId){
            Response response;
            Boolean deleteLike = this.likeService.deleteLike(likeId);
            if(deleteLike == true){
                response = new Response(true,"Your Like was removed", likeId);
            }else{
                response = new Response(false,"There was an error removing this like", likeId);
            }
            return response;
        }

}
