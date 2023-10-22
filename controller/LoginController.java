package controller;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Administrator;
import model.Administrators;
import model.Exceptions.InvalidCredentialsException;

public class LoginController extends Controller<Administrators>{
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    private Administrators administrators = new Administrators();

    public void initialize() {
        administrators.insertDummyData();
    }

    @FXML
    private void loginButton(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        try {
            if (administrators.hasAdministrator(username, password)) {
                Administrator admin = administrators.getAdministrator(username, password);
                System.out.print("Login Successful" + admin.getName() + "!");
            } else {
                System.out.print("Invalid CredentialsPlease check your username and password.");
            }
        } catch (InvalidCredentialsException e) {
            System.out.print("Invalid Credentials Please check your username and password.");
        }
    }

    
}
    
