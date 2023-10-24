package controller.Error;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Exceptions.ErrorModel;

public class ErrorController extends Controller<ErrorModel> {

    @FXML
    private void closeButtonAction(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

        @FXML
    private Label errorMessageLabel;

    public void setErrorMessage(String errorMessage) {
        errorMessageLabel.setText(errorMessage);
    }

    
}
