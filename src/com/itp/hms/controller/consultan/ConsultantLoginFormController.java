package com.itp.hms.controller.consultan;

import com.itp.hms.other.SetUIHandle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class ConsultantLoginFormController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    @FXML
    private Hyperlink backToHomeLink;
    @FXML
    private BorderPane context;
    // setui method====
    SetUIHandle set= new SetUIHandle();

    @FXML
    public void initialize() {
        // Initialization logic if needed
    }

    @FXML
    private void handleLoginAction(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill in both fields.");
        } else {
            // Perform login logic here
            System.out.println("Logging in with Username: " + username);
            // Authenticate user credentials
        }
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        usernameField.clear();
        passwordField.clear();
        System.out.println("Fields cleared.");
    }

    @FXML
    private void handleForgotPasswordAction(ActionEvent event) {

    }

    @FXML
    private void handleBackToHomeAction(ActionEvent event) {
        try {
            set.setUiMain(context,"MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
