package com.revature.dao;

import com.revature.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao{

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User login(User user) {
       String name = user.getUsername();
       String pass = user.getPassword();
        return sessionFactory.getCurrentSession()
                .createQuery("from User where username = '" + name +"'" + "and"+ "password = '"+ pass +"'", User.class).getSingleResult();
    }

    @Override
    public User createUser(User user) {
       return (User) this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User forGotInfo(String username) {
        return sessionFactory.getCurrentSession()
                .createQuery("from User where username= '" + username + "'", User.class).getSingleResult();
    }

    @Override
    public void updateUser(User user) {
      sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    @Override
    public User getUserById(Integer userid) {
        return sessionFactory.getCurrentSession()
                .get(User.class, userid);
    }
}
