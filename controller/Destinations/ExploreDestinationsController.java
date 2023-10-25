package controller.Destinations;
import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Destinations;

public class ExploreDestinationsController extends Controller<Destinations> {

   @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

    @FXML 
    private void destButton(ActionEvent event) {
        loadDest();
    }

    
    @FXML 
    private void fDestButton(ActionEvent event) {
        loadFdest();
    }

    @FXML 
    private void addDestButton(ActionEvent event) {
        loadAddD();
    }

    @FXML 
    private void removeDestButton(ActionEvent event) {
        loadRemoveD();
    }

    private void loadDest() {
        try {
            ViewLoader.showStage(null, "/view/Destinations/DisplayDestinationsView.fxml", "Display Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFdest() {
        try {
            ViewLoader.showStage(null, "/view/Destinations/DisplayFilteredDestinationsView.fxml", "Display Flitered Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadAddD() {
        try {
            ViewLoader.showStage(null, "/view/Destinations/AddDestinationView.fxml", "Add Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadRemoveD() {
         try {
            ViewLoader.showStage(null, "/view/Destinations/RemoveDestinationView.fxml", "Remove Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
