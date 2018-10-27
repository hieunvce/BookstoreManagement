package com.app.bookstoreapp;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Bookstore Management App");
        
        //
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Text scenetitle=new Text("Welcome");
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userName=new Label("User Name:");
        grid.add(userName, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        Label pw = new Label("Password:");
        grid.add(pw,0,2);
        PasswordField pwBox=new PasswordField();
        grid.add(pwBox,1,2);
        
        Button signInBtn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.getChildren().add(signInBtn);
        grid.add(hbBtn,1,4);
        
        final Text actiontarget = new Text();
            grid.add(actiontarget,1,6);
        signInBtn.setOnAction(new EventHandler<ActionEvent>(){
           
            @Override
            public void handle(ActionEvent e){
                actiontarget.setFill(Color.FORESTGREEN);
                actiontarget.setText("Sign in button pressed");
            }
        });
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        
        // Show primary stage
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
