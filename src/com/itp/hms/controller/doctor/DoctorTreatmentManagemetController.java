
    package com.itp.hms.controller.doctor;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

    public class DoctorTreatmentManagemetController {

        @FXML
        private Label dateTimeLabel;

        @FXML
        private Button logoutButton;

        @FXML
        private TextField patientIdSearchField;

        @FXML
        private TextField patientNameFeild;

        @FXML
        private TextField patientAddressField;

        @FXML
        private TextField patientAgeField;

        @FXML
        private DatePicker treatmentDatePicker;

        @FXML
        private Button updatePatientButton;

        @FXML
        private Button clearPatientButton;

        @FXML
        private Button viewHistoryButton;
        @FXML
        private TextField medicineSearchField;

        @FXML
        private TextField medicineNameField;

        @FXML
        private TextField medicineDoseField;

        @FXML
        private ComboBox<String> routeComboBox;

        @FXML
        private ComboBox<String> timeComboBox;

        @FXML
        private Button addMedicineButton;

        @FXML
        private Button updateMedicineButton;

        @FXML
        private Button clearMedicineButton;

        @FXML
        private TableView<?> treatmentTable;

        @FXML
        private TableColumn<?, ?> medicineNameColumn;

        @FXML
        private TableColumn<?, ?> doseColumn;

        @FXML
        private TableColumn<?, ?> routeColumn;

        @FXML
        private TableColumn<?, ?> timeColumn;

        @FXML
        private TableColumn<?, ?> optionsColumn;

        @FXML
        private Button saveButton;

        @FXML
        private Button prescribeButton;

        @FXML
        private Button viewButton;

        @FXML
        private Button removeButton;

        @FXML
        private void initialize() {
            // Initialize ComboBox items
            routeComboBox.setItems(FXCollections.observableArrayList("Oral", "Injection", "Topical", "Intravenous"));
            timeComboBox.setItems(FXCollections.observableArrayList("Morning", "Afternoon", "Evening", "Night"));

            // Initialize TableView columns
            medicineNameColumn.setCellValueFactory(new PropertyValueFactory<>("medicineName"));
            doseColumn.setCellValueFactory(new PropertyValueFactory<>("dose"));
            routeColumn.setCellValueFactory(new PropertyValueFactory<>("route"));
            timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
            optionsColumn.setCellValueFactory(new PropertyValueFactory<>("options"));
        }

        @FXML
        private void onLogoutButtonClick() {
            // Handle logout logic
            System.out.println("Logout button clicked");
        }

        @FXML
        private void onClientSearch() {
            // Handle client search logic
            System.out.println("Search for client ID: " + patientIdSearchField.getText());
        }

        @FXML
        private void onUpdateClient() {
            // Handle update client logic
            System.out.println("Update client information");
        }

        @FXML
        private void onClearClient() {
            // Handle clear client details
            patientNameFeild.clear();
            patientAddressField.clear();
            patientAgeField.clear();
            treatmentDatePicker.setValue(null);
        }

        @FXML
        private void onMedicineSearch() {
            // Handle medicine search logic
            System.out.println("Search for medicine: " + medicineSearchField.getText());
        }

        @FXML
        private void onAddMedicine() {
            // Handle adding medicine logic
            System.out.println("Add medicine");
        }

        @FXML
        private void onUpdateMedicine() {
            // Handle update medicine logic
            System.out.println("Update medicine");
        }

        @FXML
        private void onClearMedicine() {
            // Handle clearing medicine details
            medicineNameField.clear();
            medicineDoseField.clear();
            routeComboBox.getSelectionModel().clearSelection();
            timeComboBox.getSelectionModel().clearSelection();
        }

        @FXML
        private void onSaveTreatment() {
            // Handle save treatment logic
            System.out.println("Save treatment");
        }

        @FXML
        private void onPrescribeTreatment() {
            // Handle prescribe treatment logic
            System.out.println("Prescribe treatment");
        }

        @FXML
        private void onViewTreatment() {
            // Handle view treatment logic
            System.out.println("View treatment");
        }

        @FXML
        private void onRemoveTreatment() {
            // Handle remove treatment logic
            System.out.println("Remove treatment");
        }

        public void ViewHistoryOnAction(ActionEvent actionEvent) {
        }
    }


