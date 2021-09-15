package com.ocean.services;

import com.ocean.models.Comment;
import com.ocean.repository.CommentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentService {
    private CommentDao commentDao;

    @Autowired
    public CommentService(CommentDao commentDao){this.commentDao = commentDao;}

    public Comment createComment(Comment comment) {
        Comment tempComm = this.commentDao.save(comment);
        if(tempComm != null){
            return tempComm;
        }
        return null;
    }

    public Comment findCommentById(Integer commentId) {
        return this.commentDao.findById(commentId).orElse(null);
    }

    public List<Comment> findCommentByPostId(Integer postId) {
        List<Comment> commByPostId = this.commentDao.getCommentByPostId(postId);
        if(commByPostId != null){
            return commByPostId;
        }
        return null;
    }

    public List<Comment> findCommentByUserId(Integer userId) {
        List<Comment> commByUserId = this.commentDao.getCommentByUserId(userId);
        if(commByUserId != null){
            return commByUserId;
        }
        return null;
    }

    public Comment updateComment(Comment comment) {
        Comment dataBaseComm = this.commentDao.findById(comment.getCommentId()).orElse(null);
        if(dataBaseComm != null){
            dataBaseComm.setCommText(comment.getCommText());
            this.commentDao.save(dataBaseComm);
            return dataBaseComm;
        }
        return null;
    }

    public Boolean deleteComment(Integer commentId) {
        boolean checkDelete = this.commentDao.existsById(commentId);
        if(checkDelete == true){
            this.commentDao.deleteById(commentId);
            return true;
        }
        return false;
    }

}
