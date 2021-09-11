package com.ocean.services;

import com.ocean.models.Like;
import com.ocean.repository.LikeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("likeService")
public class LikeService {
    private LikeDao likeDao;

    @Autowired
    public LikeService(LikeDao likeDao){this.likeDao = likeDao;}

    public Like createLike(Like like) {
        Like tempLike = this.likeDao.save(like);
        if(tempLike != null){
            return tempLike;
        }
        return null;
    }

    public List<Like> getLikeByPostId(Integer postId) {
        List<Like> allLikesToThisPost = this.likeDao.getLikesByPostId(postId);
        if(allLikesToThisPost != null){
            return allLikesToThisPost;
        }
        return null;
    }


    public boolean deleteLike(Integer likeId) {
        boolean checkDelete = this.likeDao.existsById(likeId);
        if (checkDelete == true){
            this.likeDao.deleteById(likeId);
            return true;
        }
        return false;
    }


}

