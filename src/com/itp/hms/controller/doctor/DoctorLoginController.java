package com.itp.hms.controller.doctor;

import com.itp.hms.db.databaseAccesscode.loginAccessCode.DoctorAccessCode;
import com.itp.hms.other.SetUIHandle;
import com.itp.hms.util.PasswordEncoder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.sql.SQLException;

public class DoctorLoginController {

    @FXML
    private BorderPane context;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;

    @FXML
    private Hyperlink forgotPasswordLink;

    @FXML
    private Hyperlink createAccountLink;

    @FXML
    private Hyperlink backToHomeLink;


    SetUIHandle set= new SetUIHandle();
    public void LoginOnAction(ActionEvent actionEvent) {
        try {
            String userResult = new DoctorAccessCode().doctorLogin(usernameField.getText());
            if (userResult != null) {
                if (PasswordEncoder.check(
                        passwordField.getText(),
                        userResult
                )) {
                    new Alert(Alert.AlertType.INFORMATION, usernameField.getText() + " is Loging Successfully!",
                            ButtonType.OK).show();
                    set.setUi(context,"TreatmentManagement","doctor");
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

    public void ClearOnAction(ActionEvent actionEvent){
        usernameField.clear();
        passwordField.clear();
    }

    public void FrogotPasswordOnAction(ActionEvent actionEvent) {
    }

    public void BackToHomeOnAction(ActionEvent actionEvent) {
        try {
            set.setUiMain(context,"MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void CreateAccountOnAction(ActionEvent actionEvent) {
        try {
            set.setUi(context,"UserRegisterForm", "user");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}