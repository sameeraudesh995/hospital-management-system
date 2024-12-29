package com.itp.hms.controller.user;


import com.itp.hms.db.DBConnection;
import com.itp.hms.db.databaseAccesscode.userRegister.UserRegisterAccessCode;
import com.itp.hms.other.SetUIHandle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    private BorderPane context;

    SetUIHandle set = new SetUIHandle();

    @FXML
    private void initialize()  {
        try {
            autoGenerateUserId();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        roleComboBox.setItems(FXCollections.observableArrayList("Receptionist", "Doctor", "Nurse", "Pharmacist", "Store Keeper", "Laboratorist", "Cashier"));
    }


    public void handleRegister(ActionEvent actionEvent) {
    }

    public void handleClear(ActionEvent actionEvent) {
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

    public void navigateToLogin(ActionEvent actionEvent) {
    }

    public void handleForgotPassword(ActionEvent actionEvent) {
    }

    public void navigateToHome(ActionEvent actionEvent) {
        try {
            set.setUiMain(context,"MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private String generateNextUserId() throws SQLException, ClassNotFoundException {
        String lastPatientId = getLastUserId();

        if (lastPatientId == null || lastPatientId.isEmpty()) {
            return "UR001";
        }


        int numericPart = Integer.parseInt(lastPatientId.substring(2));
        numericPart++;


        return String.format("UR%03d", numericPart);
    }
    private String getLastUserId() throws SQLException, ClassNotFoundException {
        String lastId = UserRegisterAccessCode.getLastId();

        if (lastId==null){
            return null;
        }
       return lastId;
    }
    @FXML
    private void autoGenerateUserId() throws SQLException, ClassNotFoundException {
        String newUserId = generateNextUserId();
        userIdField.setText(newUserId);
        userIdField.setEditable(false); // Prevent manual editing
    }
}
