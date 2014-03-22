/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import dto.*;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Nourhan
 */
public class PurchaseDAO {
    
   static Session session;
   public PurchaseDAO()
   {
        session = HibernateUtility.getSessionFactory().openSession();
    }
   public void addProudactToShoppingChard(User user, Product product, int amount)
   {
        Purchase purchase = new Purchase();
        PurchaseId purchaseId = new PurchaseId(user.getId(), product.getId());
        
        purchase.setId(purchaseId);
        purchase.setUser(user);
        purchase.setProduct(product);
        purchase.setAmount(amount);
        purchase.setIspurchased(false);
        purchase.setPurchaseDate(new Date());
    
        session.beginTransaction();
        session.persist(purchase);  
        session.beginTransaction().commit();
    }
   public void buyProudactFromShoppingChard(User user, Product product)
   {
         PurchaseId purchaseId = new PurchaseId();
         
         purchaseId.setProductId(product.getId());
         purchaseId.setUserId(user.getId());
         
         Purchase purchase =(Purchase)session.get(Purchase.class, purchaseId);
         
         purchase.setIspurchased(true);
         purchase.setAddedDate(new Date());
         session.beginTransaction();
         session.saveOrUpdate(purchase);
         session.beginTransaction().commit();
     }
   public void deleteFromShoppingCard(User user, Product product)
   {
         PurchaseId purchaseId = new PurchaseId();
         
         purchaseId.setProductId(product.getId());
         purchaseId.setUserId(user.getId());
         
         Purchase purchase =(Purchase)session.get(Purchase.class, purchaseId);
         
         session.beginTransaction();
         session.delete(purchase);
         session.beginTransaction().commit();
     }
   public List retrievePurcheseByProudect(Product product)
   {
         try
         {Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("p.product", product))
                 .add(Restrictions.eq("ispurchased", false));
         List list = criteria.list();
         return list;
         }
         catch(Exception e){return null;}
     }    
   public List retrievePurchasingByUser(User user)
   {
      
         Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("p.User:", user))
                 .add(Restrictions.eq("ispurchased", false));
         List list = criteria.list();
         return list;
     }
   public List retrieveBuyedByProudect(Product product)
   {
         Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("p.product", product))
                 .add(Restrictions.eq("ispurchased", true));
     
         List list = criteria.list();
         return list;
     }
   public List retrieveBuyedByUser(User user)
   {
         Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("p.User:", user))
                 .add(Restrictions.eq("ispurchased", true));
         
         List list = criteria.list();
         return list;
     }
   public List retrieveAllShoppingCard()
   {
         Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("ispurchased", false));
         
         List list = criteria.list();
         return list;
     }
   public List retrieveAllBuyedProudact()
   {
         Criteria criteria = session.createCriteria(Purchase.class,"p")
                 .add(Restrictions.eq("ispurchased", true));
         
         List list = criteria.list();
         return list;
     }
   @Override
    protected void finalize() throws Throwable {
     session.close();
    }
    
}