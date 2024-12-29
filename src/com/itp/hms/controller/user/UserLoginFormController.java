package com.itp.hms.controller.user;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class UserLoginFormController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private BorderPane context;
    @FXML
    private void handleLoginButtonAction() {

    }

    // Handle Register Button Action
    @FXML
    private void handleRegisterButtonAction() {

    }

    public void handleBackToHomeAction(MouseEvent mouseEvent) {
        try {
            setUi2("MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setUi(String location, String folder) throws IOException, IOException {
        Stage stage = (Stage)
                context.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/itp/hms/view/"+folder+"/"+location+".fxml"));

        FadeTransition fadeOut = new FadeTransition(Duration.millis(300), stage.getScene().getRoot());
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(event -> {

            stage.setScene(new Scene(root));


            FadeTransition fadeIn = new FadeTransition(Duration.millis(300), root);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });


        fadeOut.play();

    }
    private void setUi2(String location) throws IOException, IOException {
        Stage stage = (Stage)
                context.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/com/itp/hms/view/"+location+".fxml"));

        FadeTransition fadeOut = new FadeTransition(Duration.millis(300), stage.getScene().getRoot());
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(event -> {

            stage.setScene(new Scene(root));


            FadeTransition fadeIn = new FadeTransition(Duration.millis(300), root);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });


        fadeOut.play();

    }
}
