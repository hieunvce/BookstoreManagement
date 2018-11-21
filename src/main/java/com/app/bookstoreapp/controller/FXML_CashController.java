/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.bookstoreapp.controller;

import com.app.bookstoreapp.entity.Books;
import com.app.bookstoreapp.model.BooksModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
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
    private TextField subTotalTextField;
    @FXML
    private TextField discountTextField;
    @FXML
    private TextField totalTextField;
    @FXML
    private ChoiceBox searchByChoiceBox;
    
    private List<Books> ListViewBooks = new ArrayList();
    
    public void reloadBookListView(){
        ArrayList booksName=new ArrayList();
        for (Books item : ListViewBooks){
            booksName.add(item.getTitle());
        }
        ObservableList<Books> resultView = FXCollections.observableArrayList (booksName);
        queryResultListView.setItems(resultView);
    }
    public void clearAllTextField(){
        queryTextField.clear();
        queryResultListView.getItems().clear();
        orderTableView.getItems().clear();
        customerIDField.clear();
        customerNameTextField.clear();
        subTotalTextField.clear();
        discountTextField.clear();
        totalTextField.clear();
        customerAddressTextField.clear();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clearAllTextField();
        BooksModel bookmodel = new BooksModel();
        ListViewBooks = bookmodel.getAllBooksFromDatabase();
        reloadBookListView();
    }    
    
    @FXML
    protected void createNewOrder(ActionEvent event){
        Window owner = newOrderButton.getScene().getWindow();
        clearAllTextField();
        
        BooksModel bookmodel = new BooksModel();
        ListViewBooks = bookmodel.getAllBooksFromDatabase();
        reloadBookListView();
    }
    
    @FXML
    protected void quitCashGUI(ActionEvent event){
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Do you really want to QUIT?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            // ... user chose OK
            Stage stage = (Stage) quitCashGUIButton.getScene().getWindow();
            stage.close();
            
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }
    
    @FXML
    protected void recordOrder(ActionEvent event){
        Window owner = recordOrderButton.getScene().getWindow();
    }
    
    
    @FXML
    protected void queryDatabase(ActionEvent event){
        Window owner = queryTextField.getScene().getWindow();
        BooksModel bookmodel = new BooksModel();
        ListViewBooks = bookmodel.searchBookByName(queryTextField.getText());
        reloadBookListView();
    }
    
    String tempItem="";
    @FXML
    protected void chooseItem(MouseEvent clicked){
        Window owner = queryTextField.getScene().getWindow();
        String selectedItem = queryResultListView.getSelectionModel().getSelectedItem().toString();
        
        if (selectedItem.equals(tempItem))
            clicked.consume();
        else {
            int selectedIndex = queryResultListView.getSelectionModel().getSelectedIndex();
            Books selectedBook = ListViewBooks.get(selectedIndex);
            addToTableView(selectedBook);
            System.out.println("Selected index: "+selectedIndex);
            System.out.println("ID: "+selectedBook.getId()+"\tTitle: "+selectedBook.getTitle());
            tempItem=selectedItem;
        }
    }
    
    
    protected void addToTableView(Books book) {
        
    }
}
