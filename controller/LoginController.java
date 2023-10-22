package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Administrator;
import model.Administrators;
import model.Exceptions.InvalidCredentialsException;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    private Administrators administrators = new Administrators();

    public void initialize() {
        administrators.insertDummyData();
    }

    @FXML
    private void loginButtonAction(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        try {
            if (administrators.hasAdministrator(username, password)) {
                Administrator admin = administrators.getAdministrator(username, password);
                System.out.println("Login successful for " + admin.getName());
            } else {
                System.out.println("Invalid credentials");
            }
        } catch (InvalidCredentialsException event) {
            System.out.println("Invalid credentials");
        }
    }
} 
    
