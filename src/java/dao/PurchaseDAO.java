/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import org.hibernate.Session;

/**
 *
 * @author Nourhan
 */
public class PurchaseDAO {
    
   static Session session =null;
    public PurchaseDAO()
    {
        if (session == null)
            session = HibernateUtility.getSessionFactory().openSession();
        else
            session = HibernateUtility.getSessionFactory().getCurrentSession();
    }
     
    
    //--------------------------insert Methods------------------
    //--------------------------update Methods------------------
    //--------------------------delete Methods------------------
    //--------------------------select Methods------------------
}
