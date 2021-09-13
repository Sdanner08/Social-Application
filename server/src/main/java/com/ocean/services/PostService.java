package com.ocean.services;

import com.ocean.models.Post;
import com.ocean.repository.PostDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("postService")
public class PostService {
    private PostDao postDao;

    @Autowired
    public PostService(PostDao postDao){this.postDao = postDao;}

    //Create a Post
    public Post createPost(Post post) {
        Post tempPost = this.postDao.save(post);
        if(tempPost != null){
            return tempPost;
        }
        return null;
    }
    //Get all posts
    public List<Post> getAllPosts(){
        List<Post> allPosts = this.postDao.findAll();
        if(allPosts != null){
            return allPosts;
        }
        return null;
    }
    //Read a post
    public Post getPostById(Integer postId) {
        return this.postDao.findById(postId).orElse(null);
    }

    //Get Post by UserId
    public List<Post> getPostByUserId(Integer userId) {
        List<Post> allThisUserPost = this.postDao.getPostByUserId(userId);
        if(allThisUserPost != null){
            return allThisUserPost;
        }
        return null;
    }

    //Update a post
    public Post updatePost(Post post) {
        //Gets Post from Database
        Post dataBasePost = getPostById(post.getPostId());
        //Checks to see if a result is returned
        if(dataBasePost != null){
            //To make sure the Id doesn't get changed by anyone
            post.setPostId(dataBasePost.getPostId());
            //Have to set the userId or null exception is thrown
            post.setUser(dataBasePost.getUser());
            //Executes the update
            this.postDao.save(post);
            //Returns the updated post
            return post;
        }
        return null;
    }

    //Delete a post
    public Post deletePost(Integer postId) {
        Post checkDelete = this.postDao.findById(postId).orElse(null);
        if(checkDelete != null){
            this.postDao.deleteById(postId);
            return checkDelete;
        }
        return null;
    }
}
