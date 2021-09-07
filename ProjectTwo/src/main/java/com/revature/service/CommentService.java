package com.revature.service;

import com.revature.dao.CommentDao;
import com.revature.dao.CommentDaoImpl;
import com.revature.model.Comment;

import java.util.List;

public class CommentService {
    CommentDao commentDao = new CommentDaoImpl();

    public void addComment(Comment comment){commentDao.addComment(comment);}

    public void deleteComment(Integer commentId){commentDao.deleteComment(commentId);}

    public List<Comment> getAllComments(Integer postFk){return commentDao.getAllComments(postFk);}
}
