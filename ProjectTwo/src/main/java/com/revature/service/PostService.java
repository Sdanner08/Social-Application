package com.revature.service;

import com.revature.dao.PostDao;
import com.revature.dao.PostDaoImpl;
import com.revature.model.Post;

import java.util.List;

public class PostService {
    PostDao postDao = new PostDaoImpl();

    //Add a post
    public void createPost(Post post){postDao.createPost(post);}

    //Delete a post
    void deletePost(Integer postId){postDao.deletePost(postId);}

    //Show All post by UserId
    List<Post> allUsersPosts(Integer userId){return postDao.allUsersPosts(userId);}
}
