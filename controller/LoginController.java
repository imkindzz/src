package controller;

import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Administrator;
import model.Administrators;
import model.Agency;
import model.Exceptions.ErrorModel;
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
                Stage loginStage = (Stage) usernameField.getScene().getWindow();
                loginStage.close();
                loadAgencyView(username);
            } else {
                // If login is incorrect, load and display the error view
                loadErrorView();
            }
        } catch (InvalidCredentialsException e) {
            // Exception handling, load the error view as well
            loadErrorView();
        }
    }

    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

     private void loadAgencyView(String username) {
        try {
            
            Agency agency = new Agency();
            ViewLoader.showStage(agency, "/view/AgencyView.fxml", "Agency", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadErrorView() {
        try {
            ErrorModel errorModel = new ErrorModel(new Exception(), "An error occurred.");
            ViewLoader.showErrorWindow(errorModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
}

    
}
    
