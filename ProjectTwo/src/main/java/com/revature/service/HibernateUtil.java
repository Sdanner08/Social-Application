package com.revature.service;

import com.revature.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateUtil {
    User user = new User();
    //set up session factory
    public static SessionFactory sf =
            new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .setProperty("hibernate.connection.username", "postgres")
                .buildSessionFactory();

    //Initialize Sessions
    private static Session session;

    //create session
    public static Session getSession(){
        if(session == null){
            session = sf.openSession();
        }
        return session;
    }
    //closes session
    public static void closSession(){
        session.close();
        session=null;
        sf.close();
    }
}
