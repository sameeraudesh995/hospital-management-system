package com.itp.hms.controller.admission;

import com.itp.hms.db.databaseAccesscode.loginAccessCode.AdmissionLoginAccessCode;
import com.itp.hms.db.databaseAccesscode.loginAccessCode.DoctorAccessCode;
import com.itp.hms.other.SetUIHandle;
import com.itp.hms.util.PasswordEncoder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.SQLException;

public class AdmissionLoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private BorderPane context;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    SetUIHandle set=new SetUIHandle();
    @FXML
    void handleLogin(ActionEvent event) {
        try {
            String userResult = new AdmissionLoginAccessCode().admissionLogin(usernameField.getText());
            if (userResult != null) {
                if (PasswordEncoder.check(
                        passwordField.getText(),
                        userResult
                )) {
                    new Alert(Alert.AlertType.INFORMATION, usernameField.getText() + " is Loging Successfully!",
                            ButtonType.OK).show();
                    set.setUi(context,"AdmissionForm","admission");
                } else {
                    new Alert(Alert.AlertType.WARNING, "password is wrong!",
                            ButtonType.OK).show();
                }
            }else {
                new Alert(Alert.AlertType.WARNING, "UserName is Incorrect!",
                        ButtonType.OK).show();
            }

        }catch(SQLException | ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void handleClear(ActionEvent event) {
        usernameField.clear();
        passwordField.clear();
    }

    @FXML
    void handleForgotPassword(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Forgot Password", "Please contact your system administrator to reset your password.");
    }

    @FXML
    void handleBackToHome(ActionEvent event) {
        try {
            set.setUiMain(context, "MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void showAlert(AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
