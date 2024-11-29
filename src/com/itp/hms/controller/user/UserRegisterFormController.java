package com.itp.hms.controller.user;


import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;

public class UserRegisterFormController {

    @FXML
    private TextField userIdField;

    @FXML
    private TextField empNumField;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    private TextField emailField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField contactField;

    @FXML
    private TextField salaryField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private DatePicker joinDatePicker;

    @FXML
    private Button registerButton;

    @FXML
    private Button clearButton;

    @FXML
    private void initialize() {
        // Populate ComboBox items
        roleComboBox.setItems(FXCollections.observableArrayList("Admin", "Doctor", "Nurse", "Staff"));
    }

    @FXML
    private void handleRegisterAction(ActionEvent event) {
        // Registration logic here
    }

    @FXML
    private void handleClearAction(ActionEvent event) {
        // Clear form fields
        userIdField.clear();
        empNumField.clear();
        roleComboBox.setValue(null);
        emailField.clear();
        nameField.clear();
        contactField.clear();
        salaryField.clear();
        passwordField.clear();
        joinDatePicker.setValue(null);
    }
}
