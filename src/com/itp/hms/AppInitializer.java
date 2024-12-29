package com.itp.hms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("./view/MainForm.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("Main Form");
            primaryStage.show();
        }catch (IOException e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}


