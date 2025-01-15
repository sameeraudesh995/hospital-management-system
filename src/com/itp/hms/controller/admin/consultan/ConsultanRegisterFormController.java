package com.itp.hms.controller.admin.consultan;
import com.itp.hms.db.databaseAccesscode.admin.ConsultantRegisterAccessCode;
import com.itp.hms.db.databaseAccesscode.userRegister.UserRegisterAccessCode;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.SQLException;

public class ConsultanRegisterFormController {

        @FXML
        private TextField consultantIdField;

        @FXML
        private TextField nameField;

        @FXML
        private TextField empNumField;

        @FXML
        private PasswordField passwordField;

        @FXML
        private TextField contactField;

        @FXML
        private TextField emailField;

        @FXML
        private TextField salaryField;

        @FXML
        private DatePicker joinDatePicker;

        @FXML
        private ComboBox<String> specialAreaComboBox;

        @FXML
        private TableView consultantTable;

        @FXML
        private TableColumn idColumn;

        @FXML
        private TableColumn nameColumn;

        @FXML
        private TableColumn empNumColumn;

        @FXML
        private TableColumn passwordColumn;

        @FXML
        private TableColumn contactColumn;

        @FXML
        private TableColumn emailColumn;

        @FXML
        private TableColumn salaryColumn;

        @FXML
        private TableColumn joinDateColumn;

        @FXML
        private TableColumn specialAreaColumn;

        private final ObservableList consultantList = FXCollections.observableArrayList();

        public void initialize() {
            specialAreaComboBox.setItems(FXCollections.observableArrayList(
                    "Cardiology", "Neurology", "Pediatrics", "Orthopedics", "Dermatology", "Radiology", "General Medicine"
            ));
//
//            idColumn.setCellValueFactory(data -> data.getValue().idProperty());
//            nameColumn.setCellValueFactory(data -> data.getValue().nameProperty());
//            empNumColumn.setCellValueFactory(data -> data.getValue().empNumProperty());
//            passwordColumn.setCellValueFactory(data -> data.getValue().passwordProperty());
//            contactColumn.setCellValueFactory(data -> data.getValue().contactProperty());
//            emailColumn.setCellValueFactory(data -> data.getValue().emailProperty());
//            salaryColumn.setCellValueFactory(data -> data.getValue().salaryProperty());
//            joinDateColumn.setCellValueFactory(data -> data.getValue().joinDateProperty());
//            specialAreaColumn.setCellValueFactory(data -> data.getValue().specialAreaProperty());

            consultantTable.setItems(consultantList);
        }

        @FXML
        void handleRegister(ActionEvent event) {



        }

        @FXML
        void handleClear(ActionEvent event) {
            clearForm();
        }

        @FXML
        void handleSendEmail(ActionEvent event) {
            // Email sending logic goes here.
            showAlert(Alert.AlertType.INFORMATION, "Email Sent", "Email has been sent successfully!");
        }

    public void updateOnActio(ActionEvent actionEvent) {
    }

    public void deleteOnAction(ActionEvent actionEvent) {
    }



        private void clearForm() {
            consultantIdField.clear();
            nameField.clear();
            empNumField.clear();
            passwordField.clear();
            contactField.clear();
            emailField.clear();
            salaryField.clear();
            joinDatePicker.setValue(null);
            specialAreaComboBox.setValue(null);
        }

        private void showAlert(Alert.AlertType alertType, String title, String message) {
            Alert alert = new Alert(alertType);
            alert.setTitle(title);
            alert.setContentText(message);
            alert.showAndWait();
        }



    private String generateNextUserId() throws SQLException, ClassNotFoundException {
        String lastConstId = getLastUserId();

        if (lastConstId == null || lastConstId.isEmpty()) {
            return "UR001";
        }


        int numericPart = Integer.parseInt(lastConstId.substring(2));
        numericPart++;


        return String.format("UR%03d", numericPart);
    }
    private String getLastUserId() throws SQLException, ClassNotFoundException {
        String lastId = ConsultantRegisterAccessCode.getLastId();

        if (lastId==null){
            return null;
        }
        return lastId;
    }
    @FXML
    private void autoGenerateUserId() throws SQLException, ClassNotFoundException {
        String newUserId = generateNextUserId();
        consultantIdField.setText(newUserId);
        consultantIdField.setEditable(false);
    }
    }


