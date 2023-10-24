package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import model.Agency;
import model.Flight;
import java.io.IOException;
import au.edu.uts.ap.javafx.Controller;
import au.edu.uts.ap.javafx.ViewLoader;

public class AgencyController extends Controller<Agency>{
    
    @FXML
    private Label userIn;
    
    public void setWelcomeMessage(String message) {
        userIn.setText(message);
    }

    @FXML 
    private void flightButton(ActionEvent event) {
        loadFlightView();
    }

    @FXML 
    private void destinationButton(ActionEvent event) {
        loadDestView();
    }

    @FXML
    private void tripButton(ActionEvent event) {
        loadTripView();
    }

    @FXML
    private void closeButton(ActionEvent event) {
        if (stage != null) {
            stage.close();
        }
    }

    @FXML
    private void loadFlightView() {
        try {
            stage.getIcons().add(new Image("/image/agency_icon.png"));
            ViewLoader.showStage(null, "/view/Flights/ExploreFlightsView.fxml", "Explore Flights", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadDestView() {
        try {
            stage.getIcons().add(new Image("/image/agency_icon.png"));
            ViewLoader.showStage(null, "/view/Destinations/ExploreDestinationsView.fxml", "Explore Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadTripView() {
        try {
            stage.getIcons().add(new Image("/image/agency_icon.png"));
            ViewLoader.showStage(null, "/view/Trip/BookTripView.fxml", "Explore Destinations", new Stage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


    

