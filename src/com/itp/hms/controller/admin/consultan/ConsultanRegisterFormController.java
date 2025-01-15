package com.itp.hms.controller.admin.consultan;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
        private TableView<Consultant> consultantTable;

        @FXML
        private TableColumn<Consultant, String> idColumn;

        @FXML
        private TableColumn<Consultant, String> nameColumn;

        @FXML
        private TableColumn<Consultant, String> empNumColumn;

        @FXML
        private TableColumn<Consultant, String> passwordColumn;

        @FXML
        private TableColumn<Consultant, String> contactColumn;

        @FXML
        private TableColumn<Consultant, String> emailColumn;

        @FXML
        private TableColumn<Consultant, String> salaryColumn;

        @FXML
        private TableColumn<Consultant, String> joinDateColumn;

        @FXML
        private TableColumn<Consultant, String> specialAreaColumn;

        private final ObservableList<Consultant> consultantList = FXCollections.observableArrayList();

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



    public static class Consultant {
            // Consultant model class with necessary properties and methods.
        }
    }


