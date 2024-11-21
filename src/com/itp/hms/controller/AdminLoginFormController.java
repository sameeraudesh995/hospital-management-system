package com.itp.hms.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

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
    }


