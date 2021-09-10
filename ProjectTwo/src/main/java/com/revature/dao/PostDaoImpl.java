package com.revature.dao;

import com.revature.model.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository("postDao")
@Transactional
public class PostDaoImpl implements PostDao{
    @Override
    public void createPost(Post post) {
/*        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.save(post);

        tx.commit();*/
    }

    @Override
    public void deletePost(Integer postId) {
/*        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.delete("from Post where" + postId);

        tx.commit();*/
    }

    @Override
    public List<Post> allUsersPosts(Integer userId) {
/*        Session session = HibernateUtil.getSession();
        return session.createQuery("from Post where" + userId, Post.class).list();*/
        return null;
    }
}
