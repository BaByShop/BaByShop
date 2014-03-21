package dto;
// Generated Mar 21, 2014 5:50:47 PM by Hibernate Tools 3.6.0



/**
 * PurchaseId generated by hbm2java
 */
public class PurchaseId  implements java.io.Serializable {


     private int userId;
     private int productId;

    public PurchaseId() {
    }

    public PurchaseId(int userId, int productId) {
       this.userId = userId;
       this.productId = productId;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PurchaseId) ) return false;
		 PurchaseId castOther = ( PurchaseId ) other; 
         
		 return (this.getUserId()==castOther.getUserId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUserId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}


