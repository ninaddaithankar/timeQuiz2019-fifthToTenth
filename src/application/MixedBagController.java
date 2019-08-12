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

public class MixedBagController {
	
	
	
	@FXML
	public void startQuestionScene(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton.getText().equals("1"))
		{
			Question.numberOnDice=1;
			Question.mixedBagCounter[0]++;
		}
		else if(clickedButton.getText().equals("2"))
		{
			Question.mixedBagCounter[1]++;
			Question.numberOnDice=2;
		}
		else if(clickedButton.getText().equals("3"))
		{
			Question.mixedBagCounter[2]++;
			Question.numberOnDice=3;
		}
		else if(clickedButton.getText().equals("4"))
		{
			Question.mixedBagCounter[3]++;
			Question.numberOnDice=4;
		}
		else if(clickedButton.getText().equals("5"))
		{
			Question.mixedBagCounter[4]++;
			Question.numberOnDice=5;
		}
		else if(clickedButton.getText().equals("6"))
		{
			Question.mixedBagCounter[5]++;
			Question.numberOnDice=6;
		}
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MBRQuestionScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/MBRQuestionScene.css").toExternalForm());
	     MBRQuestionController controller = loader.getController();
	     controller.showQuestion();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
		
	}
	
	public void backButtonClicked()
	{
		for(int i=0;i<Question.mixedBagCounter.length;i++)
			Question.mixedBagCounter[i]=-1;
		BackstageController bc=new BackstageController();
		bc.startHomeScreen();
	}

	
	

}
