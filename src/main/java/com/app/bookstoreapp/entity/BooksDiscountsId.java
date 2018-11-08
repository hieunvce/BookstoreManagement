package com.app.bookstoreapp.entity;
// Generated Nov 8, 2018 10:55:04 AM by Hibernate Tools 4.3.1



/**
 * BooksDiscountsId generated by hbm2java
 */
public class BooksDiscountsId  implements java.io.Serializable {


     private Integer bookId;
     private Integer discountId;

    public BooksDiscountsId() {
    }

    public BooksDiscountsId(Integer bookId, Integer discountId) {
       this.bookId = bookId;
       this.discountId = discountId;
    }
   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public Integer getDiscountId() {
        return this.discountId;
    }
    
    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BooksDiscountsId) ) return false;
		 BooksDiscountsId castOther = ( BooksDiscountsId ) other; 
         
		 return ( (this.getBookId()==castOther.getBookId()) || ( this.getBookId()!=null && castOther.getBookId()!=null && this.getBookId().equals(castOther.getBookId()) ) )
 && ( (this.getDiscountId()==castOther.getDiscountId()) || ( this.getDiscountId()!=null && castOther.getDiscountId()!=null && this.getDiscountId().equals(castOther.getDiscountId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBookId() == null ? 0 : this.getBookId().hashCode() );
         result = 37 * result + ( getDiscountId() == null ? 0 : this.getDiscountId().hashCode() );
         return result;
   }   


}


