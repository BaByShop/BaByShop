package JavaBeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah.Mohamed
 */
public class Product {

    String title;
    String description;
    int units;
    double price;
    String image;
    int id;

    public Product() {
       
    }
     
    
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public int getId() {
        return id;
    }
    
    
}
