package controller.Trip;

import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import model.Trip;

public class BookTripController extends Controller<Trip> {

    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

    @FXML 
    private void addDestButton(ActionEvent event) {
        loadAddD();
    }

    @FXML 
    private void removeDestButton(ActionEvent event) {
        loadRemoveD();
    }

    @FXML
    private void tripButton(ActionEvent event) {
        loadTrip();
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

   private void loadTrip(){
        try {
            ViewLoader.showStage(null, "/view/Trip/DisplayTripView.fxml", "View Trip", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
   }
    
}
