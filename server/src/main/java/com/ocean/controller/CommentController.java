package com.ocean.controller;

import com.ocean.models.Comment;
import com.ocean.models.Response;
import com.ocean.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("commentController")
@RequestMapping(value= "api")
//@CrossOrigin(value = "http://localhost:4200/", allowCredentials = "true")
public class CommentController {
    private CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){ this.commentService = commentService;}

    //Create a Comment
    @PostMapping("comment")
    public Response createComment(@RequestBody Comment comment){
        return null;
    }

    //Read a Comment
    @GetMapping("comment/{commentId}")
    public Response lookForCommentById(@PathVariable Integer commentId){
        return null;
    }
    //Get Comment by UserId

    @GetMapping("comment/user/{userId}")
    public Response lookForCommentByUserId(@PathVariable Integer userId){
        return null;
    }

    //Update a Comment
    @PutMapping("updateComment")
    public Response updateComment(@RequestBody Comment comment){
        return null;
    }

    //Delete a Comment
    @DeleteMapping("deleteComment/{commentId}")
    public Response deleteComment(@PathVariable Integer commentId){
        return null;
    }

}
