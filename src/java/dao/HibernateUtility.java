/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;


/**
 *
 * @author Nourhan
 */
public class HibernateUtility {
    
    
    private static final SessionFactory sessionFactory;
    
    static{
        sessionFactory = new Configuration().configure().buildSessionFactory();
    
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
}
