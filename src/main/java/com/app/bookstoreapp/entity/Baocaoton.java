package com.app.bookstoreapp.entity;
// Generated Oct 27, 2018 3:17:06 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Baocaoton generated by hbm2java
 */
public class Baocaoton  implements java.io.Serializable {


     private int maton;
     private Date thanglap;

    public Baocaoton() {
    }

	
    public Baocaoton(int maton) {
        this.maton = maton;
    }
    public Baocaoton(int maton, Date thanglap) {
       this.maton = maton;
       this.thanglap = thanglap;
    }
   
    public int getMaton() {
        return this.maton;
    }
    
    public void setMaton(int maton) {
        this.maton = maton;
    }
    public Date getThanglap() {
        return this.thanglap;
    }
    
    public void setThanglap(Date thanglap) {
        this.thanglap = thanglap;
    }




}

