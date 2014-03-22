/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dto.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Nourhan
 */
public class UserDAO {
    
    static Session session;
    public UserDAO()
    {       
        session = HibernateUtility.getSessionFactory().openSession();
    }
    public void signUp(User user)
    {
        session.beginTransaction();
        session.persist(user);  
        session.getTransaction().commit();
    }
    public void updateProfile(User user)
    {
    session.beginTransaction();
    session.saveOrUpdate(user);
    session.getTransaction().commit();
}
    public void activeUser(User user)
    {
    user.setActive(true);
    session.beginTransaction();
    session.merge(user);
    session.saveOrUpdate(user);
    session.getTransaction().commit();
}
    public void deactivateUser(User user)
    {
    user.setActive(false);
    session.beginTransaction();
    session.saveOrUpdate(user);
    session.getTransaction().commit();
}
    public User retrieveUserById(int id)
    {
        try{
        Criteria criteria =session.createCriteria(User.class)
                .add(Restrictions.eq("id", id));
        List list =criteria.list();
        User user =(User)list.get(0);
        return user;
        }catch(Exception ex)
        {
            return null;
        }
    }
    public List retrieveAllUsers()
    {
        try{
            Criteria criteria =session.createCriteria(User.class);
            List list =criteria.list();
            return list;
            }
        catch(Exception ex)
        {
            return null;
        }
    }
    public User singIn(String email, String password)
    {
        try
        {
            Criteria criteria =session.createCriteria(User.class)
                .add(Restrictions.eq("email", email))
                .add(Restrictions.eq("password", password));
        User user =(User)criteria.list().get(0);
        return user;
        }
        catch(Exception ex)
        {
            return null;
        }
    }

    @Override
    protected void finalize() throws Throwable {
    session.close();
    }
    
    
}