package controller.Destinations;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Destinations;

public class ExploreDestinationsController extends Controller<Destinations> {

   @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }
    
}
