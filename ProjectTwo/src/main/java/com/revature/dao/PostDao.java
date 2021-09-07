package com.revature.dao;

import com.revature.model.Post;

import java.util.List;

public interface PostDao {

    //Add a post
    void createPost(Post post);

    //Delete a post
    void deletePost(Integer postId);

    //Show All post by UserId
    List<Post> allUsersPosts(Integer userId);
}
