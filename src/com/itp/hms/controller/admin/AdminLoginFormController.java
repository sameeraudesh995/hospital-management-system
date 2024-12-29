package com.itp.hms.controller.admin;
import com.itp.hms.other.SetUIHandle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class AdminLoginFormController {

        @FXML
        private TextField adminIdField;

        @FXML
        private TextField nameField;

        @FXML
        private PasswordField passwordField;

        @FXML
        private TextField contactNumberField;

        @FXML
        private TextField emailField;

        @FXML
        private BorderPane context;

        SetUIHandle set=new SetUIHandle();

        // Handle Register Button Action
        @FXML
        private void handleRegisterButtonAction() {
            String adminId = adminIdField.getText();
            String name = nameField.getText();
            String password = passwordField.getText();
            String contactNumber = contactNumberField.getText();
            String email = emailField.getText();

            // Validate inputs (simple example)
            if (adminId.isEmpty() || name.isEmpty() || password.isEmpty() || contactNumber.isEmpty() || email.isEmpty()) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Registration Failed");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all the fields.");
                alert.showAndWait();
            } else {
                // Registration logic (for now, display an alert)
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Registration Success");
                alert.setHeaderText(null);
                alert.setContentText("Admin registered successfully!");
                alert.showAndWait();

                // Optionally, you can clear the fields after successful registration
                clearFields();
            }
        }

        // Clear the input fields after registration
        private void clearFields() {
            adminIdField.clear();
            nameField.clear();
            passwordField.clear();
            contactNumberField.clear();
            emailField.clear();
        }

        public void handleLogin(ActionEvent actionEvent) {
        }

        public void handleRegister(ActionEvent actionEvent) {
        }


    public void handleGoBackToHome(ActionEvent actionEvent) {
        try {
            set.setUiMain(context,"MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}


