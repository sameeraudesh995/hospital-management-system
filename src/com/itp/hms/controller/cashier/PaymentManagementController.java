

package com.itp.hms.controller.cashier;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaymentManagementController {

    // FXML Components
    @FXML
    private Label greetingLabel;

    @FXML
    private Label dateTimeLabel;

    @FXML
    private TextField clientIdSearchField;

    @FXML
    private TextField patientIdSearchField;

    @FXML
    private TextField paymentIdField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField amountField;

    @FXML
    private DatePicker paymentDatePicker;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private ComboBox<String> paymentStatusComboBox;

    @FXML
    private TableView<Payment> paymentTable;

    @FXML
    private TableColumn<Payment, String> paymentIdColumn;

    @FXML
    private TableColumn<Payment, String> patientIdColumn;

    @FXML
    private TableColumn<Payment, String> nameColumn;

    @FXML
    private TableColumn<Payment, String> emailColumn;

    @FXML
    private TableColumn<Payment, String> phoneColumn;

    @FXML
    private TableColumn<Payment, Double> amountColumn;

    @FXML
    private TableColumn<Payment, String> statusColumn;

    @FXML
    private TableColumn<Payment, LocalDate> dateColumn;

    // Sample data for the table
    private ObservableList<Payment> paymentData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize ComboBoxes
        paymentMethodComboBox.setItems(FXCollections.observableArrayList("Cash", "Card"));
        paymentStatusComboBox.setItems(FXCollections.observableArrayList("Paid", "Unpaid"));

        // Bind table columns to Payment class fields
//        paymentIdColumn.setCellValueFactory(cellData -> cellData.getValue().paymentIdProperty());
//        patientIdColumn.setCellValueFactory(cellData -> cellData.getValue().patientIdProperty());
//        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//        emailColumn.setCellValueFactory(cellData -> cellData.getValue().emailProperty());
//        phoneColumn.setCellValueFactory(cellData -> cellData.getValue().phoneProperty());
//        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty().asObject());
//        statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
//        dateColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());

        // Load sample data into the table
        paymentTable.setItems(paymentData);

        // Display greeting and time
        greetingLabel.setText("Welcome, John Doe (Cashier)");
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
            dateTimeLabel.setText(now.format(formatter));
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    // Event Handlers
    @FXML
    private void handleSearchClient() {
        String clientId = clientIdSearchField.getText();
        if (clientId.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Search Error", "Please enter a Client ID.");
            return;
        }
        // Perform search logic here
        System.out.println("Searching for Client ID: " + clientId);
    }

    @FXML
    private void handleSearchPatient() {
        String patientId = patientIdSearchField.getText();
        if (patientId.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Search Error", "Please enter a Patient ID.");
            return;
        }
        // Perform search logic here
        System.out.println("Searching for Patient ID: " + patientId);
    }

    //@FXML
//    private void handlePaid() {
//        if (validateInput()) {
//            Payment payment = new Payment(
//                    paymentIdField.getText(),
//                    patientIdSearchField.getText(),
//                    nameField.getText(),
//                    emailField.getText(),
//                    phoneField.getText(),
//                    Double.parseDouble(amountField.getText()),
//                    paymentStatusComboBox.getValue(),
//                    paymentDatePicker.getValue()
//            );
//            paymentData.add(payment);
//            clearFields();
//        }
//    }

    @FXML
    private void handleUpdate() {
        Payment selectedPayment = paymentTable.getSelectionModel().getSelectedItem();
        if (selectedPayment == null) {
            showAlert(Alert.AlertType.WARNING, "Update Error", "Please select a record to update.");
            return;
        }
        // Update logic here
       // System.out.println("Updating Payment ID: " + selectedPayment.getPaymentId());
    }

    @FXML
    private void handleDelete() {
        Payment selectedPayment = paymentTable.getSelectionModel().getSelectedItem();
        if (selectedPayment == null) {
            showAlert(Alert.AlertType.WARNING, "Delete Error", "Please select a record to delete.");
            return;
        }
        paymentData.remove(selectedPayment);
    }

    @FXML
    private void handleClear() {
        clearFields();
    }

    @FXML
    private void handleGenerateInvoice() {
        // Generate invoice logic here
        System.out.println("Generating invoice...");
    }

    @FXML
    private void handleSendMail() {
        // Send mail logic here
        System.out.println("Sending email...");
    }

    // Utility Methods
    private boolean validateInput() {
        if (paymentIdField.getText().isEmpty() || amountField.getText().isEmpty() || paymentMethodComboBox.getValue() == null || paymentStatusComboBox.getValue() == null || paymentDatePicker.getValue() == null) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please fill all required fields.");
            return false;
        }
        try {
            Double.parseDouble(amountField.getText());
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Amount must be a valid number.");
            return false;
        }
        return true;
    }

    private void clearFields() {
        paymentIdField.clear();
        nameField.clear();
        emailField.clear();
        phoneField.clear();
        amountField.clear();
        paymentMethodComboBox.getSelectionModel().clearSelection();
        paymentStatusComboBox.getSelectionModel().clearSelection();
        paymentDatePicker.setValue(null);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
