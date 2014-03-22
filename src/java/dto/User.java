package dto;
// Generated Mar 22, 2014 10:14:16 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private int id;
     private String fname;
     private String lname;
     private String displayname;
     private String email;
     private String password;
     private String address;
     private Date birthdate;
     private String job;
     private Double credit;
     private boolean active;
     private Set purchases = new HashSet(0);
     private Set categories = new HashSet(0);

    public User() {
    }

	
    public User(int id, String fname, String lname, String email, String password, boolean active) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.active = active;
    }
    public User(int id, String fname, String lname, String displayname, String email, String password, String address, Date birthdate, String job, Double credit, boolean active, Set purchases, Set categories) {
       this.id = id;
       this.fname = fname;
       this.lname = lname;
       this.displayname = displayname;
       this.email = email;
       this.password = password;
       this.address = address;
       this.birthdate = birthdate;
       this.job = job;
       this.credit = credit;
       this.active = active;
       this.purchases = purchases;
       this.categories = categories;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getDisplayname() {
        return this.displayname;
    }
    
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public String getJob() {
        return this.job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    public Double getCredit() {
        return this.credit;
    }
    
    public void setCredit(Double credit) {
        this.credit = credit;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Set getPurchases() {
        return this.purchases;
    }
    
    public void setPurchases(Set purchases) {
        this.purchases = purchases;
    }
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }




}


