/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.model;

import com.app.bookstoreapp.entity.Books;
import com.app.bookstoreapp.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author hieunguyen
 */
public class BooksModel {
    
    public List<Books> getAllBooksFromDatabase(){
        List<Books> list = new ArrayList();
        String hql = "from Books as book";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            session.getTransaction().commit();
            list = q.list();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            return list;
        }
    }
    public Books getBooksFromDatabaseById(int id){
        Books book = new Books();
        String hql = "from Books as book where book.id="+id;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            session.getTransaction().commit();
            if (!q.list().isEmpty())
                book = (Books)q.list().get(0);
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            return book;
        }
    }
    
    public List<Books> searchBookByName(String keyword) {
        List<Books> list = new ArrayList();
        String hql = "from Books as book where upper(book.title) like '%"+keyword.toUpperCase()+"%'";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            session.getTransaction().commit();
            list = q.list();
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            return list;
        }
    }
    
    public void addBookToDataBase(Books book) {
        
    }
    
    
}
