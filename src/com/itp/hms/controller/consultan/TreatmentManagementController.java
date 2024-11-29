package com.itp.hms.controller.consultan;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TreatmentManagementController implements Initializable {
    @FXML
    private Label dateTimeLabel;

    @FXML
    private Button logoutButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set up date and time display
        setupDateTimeDisplay();

        // Set up logout button action
        logoutButton.setOnAction(event -> handleLogout());
    }

    private void setupDateTimeDisplay() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss");
            dateTimeLabel.setText(now.format(formatter));
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    private void handleLogout() {
        // Implement logout logic here
        // This might involve closing the current window, 
        // returning to a login screen, or invalidating a session
    }
}