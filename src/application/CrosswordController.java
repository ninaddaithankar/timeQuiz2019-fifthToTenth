package application;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CrosswordController
{
	private boolean timerStarted=false;
	@FXML
	public Label txtpnTimer;
	@FXML
	Button btnPrevButton;
	boolean notClicked=true;
	public static int time=45;
	@FXML
	public void btnStartListener(ActionEvent ae)
	{
		Main main=new Main();
		main.changeScene("/application/CrosswordUI.fxml");
	}
	public void changeBtnColor(ActionEvent ae)
	{
		Button btnCrossword=(Button)ae.getSource();
		if(btnCrossword!=btnPrevButton)
			notClicked=true;
		if(notClicked)
		{
			btnCrossword.setStyle("-fx-background-color: blue");
			notClicked=false;
		}
		else
		{
			btnCrossword.setStyle("-fx-background-color: transperant");
			notClicked=true;
		}
		btnPrevButton=btnCrossword;
	}
	@FXML
	public void timerStart()
	{
		if(!timerStarted)
		{
			timerStarted=true;
			Timer timer=new Timer();
			TimerTask decrementTime=new TimerTask() {
				@Override
				public void run() 
				{
					Platform.runLater(new Runnable()
					{
						@Override
						public void run() 
						{
							txtpnTimer.setText(""+CrosswordController.time);
						}
					});
					CrosswordController.time--;
					if(CrosswordController.time==0)
					{
						timer.cancel();
					}
				}
			};
			timer.scheduleAtFixedRate(decrementTime,0,1000l);
		}
	}
}
