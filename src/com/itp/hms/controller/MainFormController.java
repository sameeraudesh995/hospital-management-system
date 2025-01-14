package com.itp.hms.controller;

import com.itp.hms.other.SetUIHandle;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainFormController {
    @FXML
    private Label dateTimeLabel;

    private Timeline timeline;

    @FXML
    private BorderPane context;
    SetUIHandle set = new SetUIHandle();

    @FXML
    public void initialize() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy  |  HH:mm:ss a");


        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {

            LocalDateTime now = LocalDateTime.now();


            dateTimeLabel.setText(now.format(formatter));


            dateTimeLabel.setStyle("-fx-opacity: 0.7; -fx-transition: opacity 0.5s;");
            dateTimeLabel.setStyle("-fx-opacity: 1;");
            updateLabelStyle(now);
        }));


        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }


    public void stopDateTimeAnimation() {
        if (timeline != null) {
            timeline.stop();
        }
    }


    private void updateLabelStyle(LocalDateTime now) {

        String timeOfDay;
        int hour = now.getHour();

        if (hour >= 5 && hour < 12) {
            timeOfDay = "morning";
        } else if (hour >= 12 && hour < 17) {
            timeOfDay = "afternoon";
        } else if (hour >= 17 && hour < 21) {
            timeOfDay = "evening";
        } else {
            timeOfDay = "night";
        }


        switch (timeOfDay) {
            case "morning":
                dateTimeLabel.setStyle(
                        "-fx-text-fill: linear-gradient(to right, #f6d365 0%, #fda085 100%);" +
                                "-fx-font-weight: bold;"
                );
                break;
            case "afternoon":
                dateTimeLabel.setStyle(
                        "-fx-text-fill: linear-gradient(to right, #2980b9 0%, #6dd5fa 100%);" +
                                "-fx-font-weight: normal;"
                );
                break;
            case "evening":
                dateTimeLabel.setStyle(
                        "-fx-text-fill: linear-gradient(to right, #ff6a00 0%, #ee0979 100%);" +
                                "-fx-font-weight: bold;"
                );
                break;
            case "night":
                dateTimeLabel.setStyle(
                        "-fx-text-fill: linear-gradient(to right, #141e30 0%, #243b55 100%);" +
                                "-fx-text-fill: white;" +
                                "-fx-font-weight: bold;"
                );
                break;
        }
    }

    public void handleAdminAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"AdminLoginForm", "admin");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handleUserAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"UserRegisterForm","user");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handleConsultantAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"ConsultantLoginForm", "consultant");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handleReceptionistAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"ReceptionistLoginForm", "receptionist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handleCashierAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"CashierLoginForm","cashier");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void handlePharmacistAction(ActionEvent actionEvent) {
    }

    public void handleInventoryAction(ActionEvent actionEvent) {
    }

    public void handleExitAction(ActionEvent actionEvent) {
    }
    public void handleLaboratoryAction(ActionEvent actionEvent) {
    }

    public void handleTreatmentOnAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"DoctorLogin","doctor");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void handleAdmissionAction(ActionEvent actionEvent){
        try {
            set.setUi(context,"AdmissionForm","admission");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
