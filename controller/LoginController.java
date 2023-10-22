package controller;

import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
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
                System.out.print("Login Successful: " + admin.getName() + " !");
            } else {
                // If login is incorrect, load and display the error view
                loadErrorView();
            }
        } catch (InvalidCredentialsException e) {
            // Exception handling, load the error view as well
            loadErrorView();
        }
    }

    private void loadErrorView() {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Error/ErrorView.fxml")); // Replace with the actual path
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    
}
    
