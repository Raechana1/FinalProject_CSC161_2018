/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author rahon
 */
public class Home extends Application {
    //UiController controller;
    
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ui.fxml"));
        
        GridPane grid = loader.load();
        
        Scene loginScene = new Scene(grid, 600, 400);
        
        stage.setScene(loginScene);
        stage.setTitle("CCBookstore");
        stage.setAlwaysOnTop(false);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
    
}

