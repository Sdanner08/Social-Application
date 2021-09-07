package com.revature.dao;

import com.revature.model.Post;
import com.revature.util.HibernateUtil;
import javafx.geometry.Pos;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PostDaoImpl implements PostDao{
    @Override
    public void createPost(Post post) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.save(post);

        tx.commit();
    }

    @Override
    public void deletePost(Integer postId) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.delete("from Post where" + postId);

        tx.commit();
    }

    @Override
    public List<Post> allUsersPosts(Integer userId) {
        Session session = HibernateUtil.getSession();
        return session.createQuery("from Post where" + userId, Post.class).list();
    }
}
