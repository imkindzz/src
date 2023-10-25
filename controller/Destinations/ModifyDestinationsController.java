package controller.Destinations;
import javax.print.attribute.standard.Destination;
import au.edu.uts.ap.javafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ModifyDestinationsController extends Controller<Destination> {

    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }
    
}
