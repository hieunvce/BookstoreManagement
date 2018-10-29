/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author hieunguyen
 */
public class FXML_CashController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private Button newOrderButton;
    @FXML
    private Button quitCashGUIButton;
    @FXML
    private Button recordOrderButton;
    @FXML
    private TextField queryTextField;
    @FXML
    private ListView queryResultListView;
    @FXML
    private TableView orderTableView;
    @FXML
    private TextField customerIDField;
    @FXML
    private TextField customerNameTextField;
    @FXML
    private TextField customerAddressTextField;
    @FXML
    private TextArea subTotalTextArea;
    @FXML
    private TextArea discountTextArea;
    @FXML
    private TextArea totalTextArea;
    @FXML
    private ChoiceBox searchByChoiceBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList FXCollection;
        searchByChoiceBox = new ChoiceBox(FXCollections.observableArrayList(
        "Book Title","Customer Name"));
    }    
    
    @FXML
    protected void createNewOrder(ActionEvent event){
        Window owner = newOrderButton.getScene().getWindow();
    }
    
    @FXML
    protected void quitCashGUI(ActionEvent event){
        Window owner = quitCashGUIButton.getScene().getWindow();
    }
    
    @FXML
    protected void recordOrder(ActionEvent event){
        Window owner = recordOrderButton.getScene().getWindow();
    }
    
    @FXML
    protected void queryDatabase(ActionEvent event){
        Window owner = queryTextField.getScene().getWindow();
    }
}
