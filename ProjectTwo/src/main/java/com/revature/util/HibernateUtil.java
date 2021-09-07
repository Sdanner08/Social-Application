package com.revature.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    //set up session factory
    public static SessionFactory sf =
            new Configuration()
                    .configure("hibernate.cfg.xml")
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
    public static void closeSession(){
        session.close();
        session = null;
        sf.close();
    }
}
