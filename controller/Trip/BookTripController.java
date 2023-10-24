package controller.Trip;

import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Trip;

public class BookTripController extends Controller<Trip> {
    
    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }
    
}
