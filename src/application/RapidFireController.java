package application;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class RapidFireController {
	
	private static int group;
	@FXML private Button btnNext;
	@FXML private Button btnShowAnswers;
	@FXML private Button btnTopaz;
	@FXML private Button btnIndicolite;
	@FXML private Button btnEmerald;
	@FXML private Button btnMeloPearl;
	@FXML private Label lblQuestionPane;
	@FXML private Label lblQuestions;
	@FXML private Label lblAnswers;
	@FXML private Label lblTimer;
	private static int rapidFireCounter;
	private int time=61;
	private Timer timer;
	
	public void groupSelected(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton==btnTopaz)
		{
			group=0;
			System.out.println(group);
		}
		else if(clickedButton==btnIndicolite)
		{
			group=1;
			System.out.println(group);
		}
		else if(clickedButton==btnMeloPearl)
		{
			group=2;
			System.out.println(group);
		}
		else if(clickedButton==btnEmerald)
		{
			group=3;
			System.out.println(group);
		}
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RapidFireQuestionScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/MBRQuestionScene.css").toExternalForm());
	     RapidFireController controller = loader.getController();
	     controller.setQuestion();
	     controller.timerStart();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
		 
		
	}
	
	public void setQuestion()
	{
		if(rapidFireCounter<12)
		{
			lblQuestionPane.setWrapText(true);
			if(group==0)
				lblQuestionPane.setText(Question.queGrpTopaz[rapidFireCounter][0]);
			else if(group==1)
				lblQuestionPane.setText(Question.queGrpIndicolite[rapidFireCounter][0]);
			else if(group==2)
				lblQuestionPane.setText(Question.queGrpMelopearl[rapidFireCounter][0]);
			else if(group==3)
				lblQuestionPane.setText(Question.queGrpEmerald[rapidFireCounter][0]);
		}
		else
		{
			lblQuestionPane.setText("Congrats! You completed all the questions!");
			timer.cancel();
			btnShowAnswers.setVisible(true);
			btnNext.setVisible(false);
		}
			
		
	}
	
	public void backButtonOfQuestionClicked()
	{
		timer.cancel();
		time=61;
		rapidFireCounter=0;
		BackstageController bc=new BackstageController();
		bc.startRapidFireRound();
	}
	
	public void backButtonOfAnswerClicked()
	{
		time=61;
		rapidFireCounter=0;
		BackstageController bc=new BackstageController();
		bc.startRapidFireRound();
	}
	
	public void showAnswersClicked(ActionEvent ae) throws IOException
	{
		timer.cancel();
		System.out.println(rapidFireCounter);
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/RapidFireAnswerScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/RapidFire.css").toExternalForm());
	     RapidFireController controller = loader.getController();
	     controller.showAnswers();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
	}
	
	public void backButtonOfTeamClicked()
	{
		BackstageController bc=new BackstageController();
		bc.startHomeScreen();
	}
	
	public void nextButtonClicked()
	{
		rapidFireCounter++;
		setQuestion();
	}
	
	public void showAnswers()
	{
		lblQuestions.setWrapText(true);
		lblAnswers.setWrapText(true);
		if(rapidFireCounter==12)
			rapidFireCounter--;
		for(int i=0;i<=rapidFireCounter;i++)
		{
			if(group==0)
			{
				lblQuestions.setText(lblQuestions.getText()+Question.queGrpTopaz[i][0]+"\n");
				lblAnswers.setText(lblAnswers.getText()+Question.queGrpTopaz[i][1]+"\n");
			}
			else if(group==1)
			{
				lblQuestions.setText(lblQuestions.getText()+Question.queGrpIndicolite[i][0]+"\n");
				lblAnswers.setText(lblAnswers.getText()+Question.queGrpIndicolite[i][1]+"\n");
			}
			else if(group==2)
			{
				lblQuestions.setText(lblQuestions.getText()+Question.queGrpMelopearl[i][0]+"\n");
				lblAnswers.setText(lblAnswers.getText()+Question.queGrpMelopearl[i][1]+"\n");
			}
			else if(group==3)
			{
				lblQuestions.setText(lblQuestions.getText()+Question.queGrpEmerald[i][0]+"\n");
				lblAnswers.setText(lblAnswers.getText()+Question.queGrpEmerald[i][1]+"\n");
			}
		}
	}
	
	public void setTimeUp()
	{
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		Media wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		MediaPlayer wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
		lblQuestionPane.setText("TIME UP!");
		btnNext.setVisible(false);
		btnShowAnswers.setVisible(true);
	}
	
	@FXML
	public void timerStart()
	{
		timer=new Timer();
		TimerTask decrementTime=new TimerTask() {
			@Override
			public void run() 
			{
				Platform.runLater(new Runnable()
				{
					@Override
					public void run() 
					{
						if(time<10)
							lblTimer.setText("0"+time);
						else
							lblTimer.setText(""+time);
						if(time==0)
						{
							setTimeUp();
						}
					}
				});
				time--;
				if(time==0)
				{
					timer.cancel();
				}
			}
		};
		timer.scheduleAtFixedRate(decrementTime,0,1000l);
	}

}
