package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BackstageController
{
	
	public void startTakeYourPickRound()
	{
		Main main=new Main();
		Scene newScene=main.changeScene("/view/TakeYourPickScene.fxml");
		newScene.getStylesheets().add(getClass().getResource("/view/TakeYourPickScene.css").toExternalForm());
	}
	
	@FXML
	public void startMixedBagRound()
	{
		Main main=new Main();
		Scene newScene=main.changeScene("/view/MixedBagRound.fxml");
		newScene.getStylesheets().add(getClass().getResource("/view/MixedBagRound.css").toExternalForm());
	}
	
	@FXML
	public void startAudioVisualRound(ActionEvent ae) throws IOException
	{
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AudioVisualSelection.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/AudioVisualScene.css").toExternalForm());
	     AudioVisualController controller = loader.getController();
	     controller.setButtons();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
	}
	
	@FXML
	public void startMCQRound(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton.getText().equals("5th Standard"))
		{
			Question.standard=5;
		}
		else if(clickedButton.getText().equals("6th Standard"))
		{
			Question.standard=6;
		}
		else if(clickedButton.getText().equals("7th Standard"))
		{
			Question.standard=7;
		}
		else if(clickedButton.getText().equals("8th Standard"))
		{
			Question.standard=8;
		}
		else if(clickedButton.getText().equals("9th Standard"))
		{
			Question.standard=9;
		}
		else if(clickedButton.getText().equals("10th Standard"))
		{
			Question.standard=10;
		}
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MCQScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/MCQScene.css").toExternalForm());
		 MCQController controller = loader.getController();
	     controller.startRound();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
		
	}
	
	public void startHomeScreen()
	{
		Main main=new Main();
		Scene newScene=main.changeScene("/view/RoundSelectionScene.fxml");
		newScene.getStylesheets().add(getClass().getResource("/view/RoundSelectionScene.css").toExternalForm());
	}
	
	@FXML
	public void startRapidFireRound()
	{
		Main main=new Main();
		Scene newScene=main.changeScene("/view/RapidFireScene.fxml");
		newScene.getStylesheets().add(getClass().getResource("/view/RapidFire.css").toExternalForm());
	}
}
