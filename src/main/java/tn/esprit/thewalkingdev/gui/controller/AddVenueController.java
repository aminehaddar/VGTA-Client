package tn.esprit.thewalkingdev.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddVenueController implements Initializable, ControlledScreen{
	@FXML
	private TextField labelField;
	@FXML
	private TextField addressField;
	@FXML
	private Button addVenue;
	@Override
	public void setScreenParent(ScreensController screenPage) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}