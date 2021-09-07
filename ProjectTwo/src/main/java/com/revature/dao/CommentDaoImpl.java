package com.revature.dao;

import com.revature.model.Comment;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CommentDaoImpl implements CommentDao{
    @Override
    public void addComment(Comment comment) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.save(comment);

        tx.commit();
    }

    @Override
    public void deleteComment(Integer commentId) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.delete("from Comment where" + commentId);

        tx.commit();

    }

    @Override
    public List<Comment> getAllComments(Integer postFk) {
        Session session = HibernateUtil.getSession();
        return session.createQuery("from comment", Comment.class).list();
    }
}
