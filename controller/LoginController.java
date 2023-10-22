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

public class LoginController extends Controller<Administrator>{
    @FXML
    private void loginButton(ActionEvent e) {
        System.out.println("Working");
    }

}
    
