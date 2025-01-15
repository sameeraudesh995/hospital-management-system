package com.itp.hms.controller.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AdminRegisterFormController {

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
    private void handleRegisterButtonAction(ActionEvent event) {
        String adminId = adminIdField.getText();
        String name = nameField.getText();
        String password = passwordField.getText();
        String contactNumber = contactNumberField.getText();
        String email = emailField.getText();

        if (adminId.isEmpty() || name.isEmpty() || password.isEmpty() || contactNumber.isEmpty() || email.isEmpty()) {
            showAlert(AlertType.ERROR, "Validation Error", "Please fill in all fields.");
            return;
        }

        // Simulate saving the admin data
        System.out.println("Admin Registered Successfully:");
        System.out.println("ID: " + adminId);
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);

        showAlert(AlertType.INFORMATION, "Success", "Admin Registered Successfully!");
        clearFields();
    }

    @FXML
    private void handleClearButtonAction(ActionEvent event) {
        clearFields();
    }

    private void clearFields() {
        adminIdField.clear();
        nameField.clear();
        passwordField.clear();
        contactNumberField.clear();
        emailField.clear();
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void backToHomeOnAction(ActionEvent actionEvent) {
    }
}
