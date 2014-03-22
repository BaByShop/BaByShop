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
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Nourhan
 */
public class ProductDAO {
    
   static Session session;
    public ProductDAO()
    {
        session = HibernateUtility.getSessionFactory().openSession();
    }
    public void insertNewProduct(Product product,String categoryName)
    {    
        CategoryDAO categoryDAO = new CategoryDAO();
        Category category=categoryDAO.retrieveCaegoryByName(categoryName);
        product.setCategory(category);

        session.beginTransaction();
        session.persist(product);  
        session.beginTransaction().commit();
	}
    public void updateProducct(Product product)
    {
        session.beginTransaction();
        session.saveOrUpdate(product);
        session.getTransaction().commit();   
    }
    public void deleteProducct (int id)
    {
        session.beginTransaction();
        Product product =retrieveProductById(id);
        session.delete(product);
        session.getTransaction().commit();
    }
    public List<Product> retrieveAllProduct()
    {
        Criteria criteria =session.createCriteria(Product.class);
        List list =criteria.list();
        return list;
    }
    public Product retrieveProductById(int id)
    {
        Criteria criteria =session.createCriteria(Product.class).add(Restrictions.eq("id", id));
        List list =criteria.list();
        Product product=(Product)list.get(0);
        
        return product;    
    }
    public List<Product> retrieveProductsOrderByPrice()
    {
        Criteria criteria =session.createCriteria(Product.class).addOrder(Order.asc("price"));
        List list =criteria.list();
        return list;
    }
    public List<Product> retrieveProductsByCategoryName(String categoryName)
    {
        CategoryDAO categoryDAO = new CategoryDAO();
        Category category=categoryDAO.retrieveCaegoryByName(categoryName);
        int id =category.getId();
        Criteria criteria =session.createCriteria(Product.class,"c")
                .add(Restrictions.eq("c.category.id", id));
        List list =criteria.list();
        return list;
        
    }
    @Override
    protected void finalize() throws Throwable {
        session.close();
    }
}
