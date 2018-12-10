/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.controller;

import com.app.bookstoreapp.entity.Employees;
import com.app.bookstoreapp.util.HibernateUtil;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * FXML Controller class
 *
 * @author hieunguyen
 */
public class FXML_LoginController {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField userNameField;
    
    @FXML
    private PasswordField passwordField;
    
    @FXML
    private Button submitButton;
    
    
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();
        if (userNameField.getText().isEmpty()){
            AlertHelper.showAlert(Alert.AlertType.ERROR,owner,"Login Error!",
                        "Please enter your username");
            return;
        }
        if (passwordField.getText().isEmpty()){
            AlertHelper.showAlert(Alert.AlertType.ERROR,owner,"Login Error!",
                        "Please enter your password");
            return;
        }
        Employees emp = getEmployeeByUserNameAndPassword(userNameField.getText(),passwordField.getText());
        System.out.println("emp = "+emp.getFirstName()+emp.getLastName());
        if (emp.getId()!=-1){
            AlertHelper.showAlert(Alert.AlertType.INFORMATION,owner,"Login successfull",
                    "Welcome "+emp.getFirstName()+" "+emp.getLastName());
        } else {
            AlertHelper.showAlert(Alert.AlertType.ERROR,owner,"Login failed",
                    "Incorrect Username or Password");
        }
        
    }
    
    private static Employees getEmployeeByUserNameAndPassword(String userName, String password) {
        Employees emp = new Employees();
        emp.setId(-1);
        String hql = "from Employees emp where emp.username=\"" + userName 
                +"\" and emp.password=\"" + password + "\"";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            session.getTransaction().commit();
            List result = q.list();
            emp=(Employees) result.get(0);
            session.close();
        } catch (HibernateException he) {
            he.printStackTrace();
        } finally {
            return emp;
        }
    }
}
