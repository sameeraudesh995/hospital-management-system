package com.itp.hms.controller.receptionist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ReceptionistLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter both username and password.");
        } else {
            if (authenticate(username, password)) {
                showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + username + "!");
                // Navigate to the receptionist dashboard
            } else {
                showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password. Please try again.");
            }
        }
    }


    @FXML
    private void handleForgotPassword(ActionEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Forgot Password", "Please contact the admin to reset your password.");
    }

    @FXML
    private void goToHome(ActionEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Navigation", "Redirecting to Home Page...");

    }


    private boolean authenticate(String username, String password) {

        return username.equals("receptionist") && password.equals("password123");
    }


    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void handleRegister(ActionEvent actionEvent) {
    }
}
