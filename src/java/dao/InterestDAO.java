/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import org.hibernate.Session;
import dto.*;
/**
 *
 * @author Nourhan
 */
public class InterestDAO {
 
    static Session session;
    public InterestDAO()
    {
            session = HibernateUtility.getSessionFactory().openSession();
    }
    //--------------------------insert Methods------------------
    //--------------------------update Methods------------------
    //--------------------------delete Methods------------------
    //--------------------------select Methods------------------
}
