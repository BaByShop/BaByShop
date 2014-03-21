/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import dto.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;


/**
 *
 * @author Nourhan
 */
public class UserDAO {
    
    static Session session =null;
    public UserDAO()
    {
        if (session == null)
            session = HibernateUtility.getSessionFactory().openSession();
        else
            session = HibernateUtility.getSessionFactory().getCurrentSession();
    }
    
    //--------------------------insert------------------
    public void signUp(User user)
    {
        session.beginTransaction();
        session.persist(user);  
        session.beginTransaction().commit();
     //   session.close();
	}

    //--------------------------update---------------------
    //--------------------------delete---------------------
    //--------------------------select---------------------
    /*public List sellcted()
    {
        session.beginTransaction();
        Criteria criteria =session.createCriteria(User.class);
                //.add(Restrictions.like("models",""));
        
        
        session.getTransaction().commit();    
        return list;
       }
    
    */
}