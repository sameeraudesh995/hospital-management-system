import com.itp.hms.other.SetUIHandle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CashierLoginForm  {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button clearButton;
    @FXML
    private BorderPane context;

    SetUIHandle set =new SetUIHandle();

    private void setupActions() {

        loginButton.setOnAction(event -> handleLogin());
        clearButton.setOnAction(event -> handleClear());
    }

    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }


        System.out.println("Logging in with Username: " + username + ", Password: " + password);
    }

    private void handleClear() {

        usernameField.clear();
        passwordField.clear();
    }

    @FXML
    private void backToHomeSetOnAction() {
        try {
            set.setUiMain(context, "MainForm");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
