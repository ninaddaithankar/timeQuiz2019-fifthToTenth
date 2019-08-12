package application;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class MCQController {
	
	Timer timer;
	@FXML private Button btnStart;
	@FXML private Button btnOptionA;
	@FXML private Button btnOptionB;
	@FXML private Button btnOptionC;
	@FXML private Button btnOptionD;
	@FXML private Label lblTextQuestionPane;
	@FXML private Label lblImageQuestionPane;
	@FXML private Label lblTimer;
	@FXML private AnchorPane optionsPane;
	@FXML private ImageView questionImage;
	@FXML private Button revealOptions;
	
	private Media correctSoundMedia,wrongSoundMedia;
	private MediaPlayer cmp,wmp;
	
	private int time=26;
	private static int click=0;
	
	
	@FXML
	public void startRound()
	{
		lblTextQuestionPane.setWrapText(true);
		lblImageQuestionPane.setWrapText(true);
		btnStart.setVisible(false);
		displayQuestionAndAnswers();
	}
	
	@FXML
	public void revealOptionsClicked()
	{
		revealOptions.setVisible(false);
		optionsPane.setVisible(true);
		lblTimer.setText("45");
		timerStart();
	}
	
	@FXML
	public void nextButtonClicked(ActionEvent ae)
	{
		if(Question.counter<3)
		{
			timer.cancel();
			time=26;
			click=0;
			Question.counter++;
			lblTextQuestionPane.setVisible(false);
			optionsPane.setVisible(false);
			lblImageQuestionPane.setVisible(false);
			questionImage.setVisible(false);
			displayQuestionAndAnswers();
			repaintOriginal(btnOptionA);
			repaintOriginal(btnOptionB);
			repaintOriginal(btnOptionC);
			repaintOriginal(btnOptionD);
			if(Question.counter==3)
			{
				Button next=(Button)ae.getSource();
				next.setVisible(false);
			}
		}
	}
	
	@FXML
	public void backButtonClicked()
	{
		timer.cancel();
		time=26;
		click=0;
		Question.counter=0;
		BackstageController bc=new BackstageController();
		bc.startTakeYourPickRound();
		Question.standard=0;
	}
	
	public void displayQuestionAndAnswers()
	{
		if(Question.standard==5)
		{
			if(Question.que_fifth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_fifth[Question.counter][0]);
				btnOptionA.setText(Question.opt_fifth[Question.counter][0]);
				btnOptionB.setText(Question.opt_fifth[Question.counter][1]);
				btnOptionC.setText(Question.opt_fifth[Question.counter][2]);
				btnOptionD.setText(Question.opt_fifth[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_fifth[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_fifth[Question.counter][0]);
				btnOptionA.setText(Question.opt_fifth[Question.counter][0]);
				btnOptionB.setText(Question.opt_fifth[Question.counter][1]);
				btnOptionC.setText(Question.opt_fifth[Question.counter][2]);
				btnOptionD.setText(Question.opt_fifth[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(Question.standard==6)
		{
			if(Question.que_sixth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_sixth[Question.counter][0]);
				btnOptionA.setText(Question.opt_sixth[Question.counter][0]);
				btnOptionB.setText(Question.opt_sixth[Question.counter][1]);
				btnOptionC.setText(Question.opt_sixth[Question.counter][2]);
				btnOptionD.setText(Question.opt_sixth[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_sixth[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_sixth[Question.counter][0]);
				btnOptionA.setText(Question.opt_sixth[Question.counter][0]);
				btnOptionB.setText(Question.opt_sixth[Question.counter][1]);
				btnOptionC.setText(Question.opt_sixth[Question.counter][2]);
				btnOptionD.setText(Question.opt_sixth[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(Question.standard==7)
		{
			if(Question.que_seventh[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_seventh[Question.counter][0]);
				btnOptionA.setText(Question.opt_seventh[Question.counter][0]);
				btnOptionB.setText(Question.opt_seventh[Question.counter][1]);
				btnOptionC.setText(Question.opt_seventh[Question.counter][2]);
				btnOptionD.setText(Question.opt_seventh[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_seventh[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_seventh[Question.counter][0]);
				btnOptionA.setText(Question.opt_seventh[Question.counter][0]);
				btnOptionB.setText(Question.opt_seventh[Question.counter][1]);
				btnOptionC.setText(Question.opt_seventh[Question.counter][2]);
				btnOptionD.setText(Question.opt_seventh[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(Question.standard==8)
		{
			if(Question.que_eighth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_eighth[Question.counter][0]);
				btnOptionA.setText(Question.opt_eighth[Question.counter][0]);
				btnOptionB.setText(Question.opt_eighth[Question.counter][1]);
				btnOptionC.setText(Question.opt_eighth[Question.counter][2]);
				btnOptionD.setText(Question.opt_eighth[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_eighth[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_eighth[Question.counter][0]);
				btnOptionA.setText(Question.opt_eighth[Question.counter][0]);
				btnOptionB.setText(Question.opt_eighth[Question.counter][1]);
				btnOptionC.setText(Question.opt_eighth[Question.counter][2]);
				btnOptionD.setText(Question.opt_eighth[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(Question.standard==9)
		{
			if(Question.que_ninth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_ninth[Question.counter][0]);
				btnOptionA.setText(Question.opt_ninth[Question.counter][0]);
				btnOptionB.setText(Question.opt_ninth[Question.counter][1]);
				btnOptionC.setText(Question.opt_ninth[Question.counter][2]);
				btnOptionD.setText(Question.opt_ninth[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_eighth[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_eighth[Question.counter][0]);
				btnOptionA.setText(Question.opt_ninth[Question.counter][0]);
				btnOptionB.setText(Question.opt_ninth[Question.counter][1]);
				btnOptionC.setText(Question.opt_ninth[Question.counter][2]);
				btnOptionD.setText(Question.opt_ninth[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
		else if(Question.standard==10)
		{
			if(Question.que_tenth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText(Question.que_tenth[Question.counter][0]);
				btnOptionA.setText(Question.opt_tenth[Question.counter][0]);
				btnOptionB.setText(Question.opt_tenth[Question.counter][1]);
				btnOptionC.setText(Question.opt_tenth[Question.counter][2]);
				btnOptionD.setText(Question.opt_tenth[Question.counter][3]);
				lblTextQuestionPane.setVisible(true);
				revealOptions.setVisible(true);
			}
			else
			{
				questionImage.setImage(new Image(Question.que_tenth[Question.counter][2]));
				lblImageQuestionPane.setText(Question.que_tenth[Question.counter][0]);
				btnOptionA.setText(Question.opt_tenth[Question.counter][0]);
				btnOptionB.setText(Question.opt_tenth[Question.counter][1]);
				btnOptionC.setText(Question.opt_tenth[Question.counter][2]);
				btnOptionD.setText(Question.opt_tenth[Question.counter][3]);
				lblImageQuestionPane.setVisible(true);
				questionImage.setVisible(true);
				revealOptions.setVisible(true);
			}
		}
	}
	
	@FXML
	public void optionClicked(ActionEvent ae)
	{
		click++;
		Button clickedOption=(Button)ae.getSource();
		Question.selectedOption=clickedOption.getText();
		boolean answer=Question.checkAnswer();
		if(MCQController.click==1)
		{
			if(answer==true)
			{
				repaintTrue(clickedOption);
				playCorrectSound();
				timer.cancel();
			}
			else 
			{
				repaintFalse(clickedOption);
				playWrongSound();
			}
		}
		else
		{
			if(answer==true)
			{
				repaintTrue(clickedOption);
				playCorrectSound();
				timer.cancel();
			}
			else 
			{
				timer.cancel();
				displayCorrectOption();
				repaintFalse(clickedOption);
				playWrongSound();
			}
		}
	}
	
	public void displayCorrectOption()
	{
		if(!(Question.correctOption.equals(Question.selectedOption)))
		{
			if(btnOptionA.getText()==Question.correctOption)
			{
				repaintTrue(btnOptionA);
			}
			else if(btnOptionB.getText().equals(Question.correctOption))
			{
				repaintTrue(btnOptionB);
			}
			else if(btnOptionC.getText().equals(Question.correctOption))
			{
				repaintTrue(btnOptionC);
			}
			else if(btnOptionD.getText().equals(Question.correctOption))
			{
				repaintTrue(btnOptionD);
			}
		}
	}
	
	

	private void playWrongSound() {
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
	}

	private void repaintFalse(Button clickedOption) {
		clickedOption.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#D91E36 10%, #FF787C 50%, #D91E36 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}

	private void repaintTrue(Button clickedOption) {
		clickedOption.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#60993E 10%, #96E8BC 50%, #60993E 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}
	
	private void repaintOriginal(Button button)
	{
		button.setStyle("-fx-font-size: 45px;\r\n" + 
				"	-fx-font-family:  Merriweather;\r\n" + 
				"	-fx-font-weight: bold;\r\n" + 
				"	-fx-background-color: #54FFE5, linear-gradient(#52B7B5 10%, #54FFE5 50%, #52B7B5 100%) ;\r\n" + 
				"	-fx-border-radius: 15.0px ;\r\n" + 
				"	-fx-background-radius: 15.0px;\r\n" + 
				"	-fx-text-fill: #1C2541; \r\n" + 
				"	-fx-effect: dropshadow( gaussian , rgba(60,60,60,1.0), 30, 0.5 , 2 , 2 );");
	}

	private void playCorrectSound() {
		
		String correctSoundPath=new File("src/sounds/correctsound.wav").getAbsolutePath();
		correctSoundMedia=new Media(new File(correctSoundPath).toURI().toString());
		cmp=new MediaPlayer(correctSoundMedia);
		cmp.play();
	}

	private void setTimeUp()
	{
		playWrongSound();
		if(Question.standard==5)
		{
			if(Question.que_fifth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(Question.standard==6)
		{
			if(Question.que_sixth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(Question.standard==7)
		{
			if(Question.que_seventh[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(Question.standard==8)
		{
			if(Question.que_eighth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(Question.standard==9)
		{
			if(Question.que_ninth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
		else if(Question.standard==10)
		{
			if(Question.que_tenth[Question.counter][2].equals("text"))
			{
				lblTextQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
			}
			else
			{
				lblImageQuestionPane.setText("TIME UP!");
				btnOptionA.setText("");
				btnOptionB.setText("");
				btnOptionC.setText("");
				btnOptionD.setText("");
				questionImage.setVisible(false);
			}
		}
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
