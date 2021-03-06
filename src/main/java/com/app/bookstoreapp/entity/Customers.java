package com.app.bookstoreapp.entity;
// Generated Nov 8, 2018 10:55:04 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Customers generated by hbm2java
 */
public class Customers  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
     private String address;
     private String email;
     private String phone;
     private Set customersDiscountses = new HashSet(0);
     private Set orderses = new HashSet(0);

    public Customers() {
    }

    public Customers(String firstName, String lastName, String address, String email, String phone, Set customersDiscountses, Set orderses) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
       this.email = email;
       this.phone = phone;
       this.customersDiscountses = customersDiscountses;
       this.orderses = orderses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
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
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set getCustomersDiscountses() {
        return this.customersDiscountses;
    }
    
    public void setCustomersDiscountses(Set customersDiscountses) {
        this.customersDiscountses = customersDiscountses;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}


