package com.revature.dao;

import com.revature.model.User;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao{
    @Override
    public User getOneUser(String uname, String pass) {
        Session session = HibernateUtil.getSession();
        return session.createQuery("from User where username = '" + uname +"'" + "and"+ "password = '"+ pass +"'", User.class).getSingleResult();
    }

    @Override
    public void createUser(User user) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        session.save(user);

        tx.commit();
    }

    @Override
    public User forGotInfo(String username) {
        Session session = HibernateUtil.getSession();
        return session.createQuery("from User where username= '" + username + "'", User.class).getSingleResult();
    }

    @Override
    public void updateUser(String uname, String pass) {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        User user = session.load(User.class, uname);
        user.setPassword(pass);
        session.update(user);
        tx.commit();
    }

    @Override
    public List<User> getUserById(Integer userid) {
        Session session = HibernateUtil.getSession();
        return session.createQuery("from User where" + userid,User.class).list();
    }
}
