package com.itp.hms.controller.admission;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PatientManagementController {
    @FXML private Label greetingLabel;
    @FXML private Label dateTimeLabel;
    @FXML private TextField patientIdField;
    @FXML private TextField nameField;
    @FXML private TextField addressField;
    @FXML private TextField ageField;
    @FXML private TextField guardianField;
    @FXML private TextField contactField;
    @FXML private TextField emailField;
    @FXML private TableView patientTable;
    @FXML private Button registerButton;
    @FXML private Button updateButton;
    @FXML private Button deleteButton;
    @FXML private Button clearButton;

    public void initialize() {
        // Display current date and time
        updateDateTime();

        // Set up table columns (optional if columns are predefined in FXML)
        // Add any initialization logic here
    }

    private void updateDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        dateTimeLabel.setText("Date: " + LocalDateTime.now().format(formatter));
    }

    @FXML
    private void handleRegister() {
        // Logic to register patient details
    }

    @FXML
    private void handleUpdate() {
        // Logic to update patient details
    }

    @FXML
    private void handleDelete() {
        // Logic to delete patient details
    }

    @FXML
    private void handleClear() {
        patientIdField.clear();
        nameField.clear();
        addressField.clear();
        ageField.clear();
        guardianField.clear();
        contactField.clear();
        emailField.clear();
    }
}
