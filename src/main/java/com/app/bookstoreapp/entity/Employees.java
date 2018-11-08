package com.app.bookstoreapp.entity;
// Generated Nov 8, 2018 10:55:04 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private String firstName;
     private String lastName;
     private String position;
     private Integer salary;
     private Date joiningDate;
     private Set orderses = new HashSet(0);

    public Employees() {
    }

	
    public Employees(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Employees(String username, String password, String firstName, String lastName, String position, Integer salary, Date joiningDate, Set orderses) {
       this.username = username;
       this.password = password;
       this.firstName = firstName;
       this.lastName = lastName;
       this.position = position;
       this.salary = salary;
       this.joiningDate = joiningDate;
       this.orderses = orderses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public Integer getSalary() {
        return this.salary;
    }
    
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public Date getJoiningDate() {
        return this.joiningDate;
    }
    
    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }




}

