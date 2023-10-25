package controller.Flights;
import java.io.IOException;

import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Flights;

public class ExploreFlightsController extends Controller<Flights> {

    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

    @FXML 
    private void flightButton(ActionEvent event) {
        loadFlights();
    }

    @FXML 
    private void fFlightButton(ActionEvent event) {
        loadFflights();
    }

    @FXML 
    private void addFlightButton(ActionEvent event) {
        loadAddFlights();
    }

    @FXML 
    private void removeFlightButton(ActionEvent event) {
        loadRemoveFlights();
    }

    @FXML
    private void loadFlights() {
        try {
            ViewLoader.showStage(null, "/view/Flights/DisplayFlightsView.fxml", "Display Flights", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadFflights() {
        try {
            ViewLoader.showStage(null, "/view/Flights/DisplayFilteredFlightsView.fxml", "Display Flitered Flights", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadAddFlights() {
        try {
            ViewLoader.showStage(null, "/view/Flights/AddFlightView.fxml", "Add Flights", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void loadRemoveFlights() {
        try {
            ViewLoader.showStage(null, "/view/Flights/RemoveFlightView.fxml", "Remove Flights", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






    
}
