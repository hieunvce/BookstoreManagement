package com.app.bookstoreapp.entity;
// Generated Nov 8, 2018 10:55:04 AM by Hibernate Tools 4.3.1



/**
 * BookAdder generated by hbm2java
 */
public class BookAdder  implements java.io.Serializable {


     private Integer id;
     private String isbn;
     private String title;
     private Integer publicationYear;
     private Integer quantity;
     private Integer price;
     private String publisher;
     private String firstName;
     private String lastName;
     private String company;

    public BookAdder() {
    }

    public BookAdder(String isbn, String title, Integer publicationYear, Integer quantity, Integer price, String publisher, String firstName, String lastName, String company) {
       this.isbn = isbn;
       this.title = title;
       this.publicationYear = publicationYear;
       this.quantity = quantity;
       this.price = price;
       this.publisher = publisher;
       this.firstName = firstName;
       this.lastName = lastName;
       this.company = company;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getPublicationYear() {
        return this.publicationYear;
    }
    
    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCompany() {
        return this.company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }




}


