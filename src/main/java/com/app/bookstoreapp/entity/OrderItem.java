/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hieunguyen
 */
public class OrderItem {
    private Integer bookId;
    private String title;
    private Integer price;
    private Set booksDiscountses = new HashSet(0);
}
