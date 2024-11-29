package com.itp.hms.controller.admin;

import com.itp.hms.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdminDashBoardController {

    @FXML
    private Label greetingLabel;

    @FXML
    private Label dateTimeLabel;

    @FXML
    private TextField userIdField, empNumField, roleField, emailField, nameField, contactField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private DatePicker joinDatePicker;

    @FXML
    private TableView<User> userTable;

    @FXML
    private TableColumn<User, String> userIdColumn, empNumColumn, roleColumn, emailColumn, nameColumn, contactColumn;

    @FXML
    private TableColumn<User, LocalDate> joinDateColumn;

    @FXML
    private void initialize() {
        // Initialize columns
        userIdColumn.setCellValueFactory(new PropertyValueFactory<>("userId"));
        empNumColumn.setCellValueFactory(new PropertyValueFactory<>("empNum"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        joinDateColumn.setCellValueFactory(new PropertyValueFactory<>("joinDate"));

        // Initialize date and time
        dateTimeLabel.setText(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    // Methods for Add, Update, Delete, and Clear
    @FXML
    private void onAddUser() {
        // Add user logic here
    }

    @FXML
    private void onUpdateUser() {
        // Update user logic here
    }

    @FXML
    private void onDeleteUser() {
        // Delete user logic here
    }

    @FXML
    private void onClearFields() {
        userIdField.clear();
        empNumField.clear();
        roleField.clear();
        emailField.clear();
        nameField.clear();
        contactField.clear();
        passwordField.clear();
        joinDatePicker.setValue(null);
    }
}
