package dto;
// Generated Mar 22, 2014 7:05:21 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private int id;
     private String name;
     private Set users = new HashSet(0);
     private Set products = new HashSet(0);

    public Category() {
    }

	
    public Category(int id) {
        this.id = id;
    }
    public Category(int id, String name, Set users, Set products) {
       this.id = id;
       this.name = name;
       this.users = users;
       this.products = products;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}


