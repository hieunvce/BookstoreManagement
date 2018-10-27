/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

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
        
        AlertHelper.showAlert(Alert.AlertType.INFORMATION,owner,"Login successfull",
                    "Welcome "+userNameField.getText());
    }

}
