package com.revature.dao;

import com.revature.model.Comment;

import java.util.List;

public interface CommentDao {
    //Add Comment
    void addComment(Comment comment);

    //Delete Comment
    void deleteComment(Integer commentId);

    //Show all Comments by PostFk
    List<Comment> getAllComments(Integer postFk);
}
