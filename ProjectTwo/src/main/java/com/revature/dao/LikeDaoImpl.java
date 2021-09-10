package com.revature.dao;

import com.revature.model.Like;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("likeDao")
@Transactional
public class LikeDaoImpl implements LikeDao{


    @Override
    public void addLike(Like like) {
/*        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.save(like);

        tx.commit();*/
    }
}
