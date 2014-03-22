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
public class CategoryDAO {
    
    static Session session;
    
    public CategoryDAO()
    {
        session = HibernateUtility.getSessionFactory().openSession();
    }
    public Category retrieveCaegoryByName(String name)
    {
        Criteria criteria =session.createCriteria(Category.class).add(Restrictions.eq("name", name));
        List list =criteria.list();
        Category category = (Category)list.get(0);
        
        return category;
    }
}
