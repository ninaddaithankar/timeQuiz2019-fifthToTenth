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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class AudioVisualController 
{
	
	@FXML private Button btnVisualOne;
	@FXML private Button btnVisualTwo;
	@FXML private Button btnVisualThree;
	@FXML private Button btnVisualFour;
	
	@FXML private Button btnAudioOne;
	@FXML private Button btnAudioTwo;
	@FXML private Button btnAudioThree;
	@FXML private Button btnAudioFour;
	
	
	@FXML private Button btnPlay;
	@FXML private Button btnStop;
	@FXML private Button btnAnswer;
	@FXML private Button btnClue;
	@FXML private Label lblQuestionPane;
	@FXML private Label lblAnswer;
	@FXML private Label lblClue;
	@FXML private Label lblTimer;
	@FXML private ImageView imageView;
	
	private static boolean btnVOneClicked;
	private static boolean btnVTwoClicked;
	private static boolean btnVThreeClicked;
	private static boolean btnVFourClicked;
	private static boolean btnAOneClicked;
	private static boolean btnATwoClicked;
	private static boolean btnAThreeClicked;
	private static boolean btnAFourClicked;
	
	
	@FXML private Button btnPlayAudio;
	@FXML private Button btnStopAudio;
	@FXML private Button btnAnswerAudio;
	@FXML private Button btnClueAudio;
	@FXML private Label lblQuestionPaneAudio;
	@FXML private Label lblAnswerAudio;
	@FXML private Label lblClueAudio;
	private boolean timerStarted;
	private int time=31;
	
	private Timer timer;
	
	@FXML private MediaView mediaView;
	private Media media;
	private MediaPlayer mediaPlayer;
	@FXML
	public void playButtonClicked()
	{
		mediaPlayer.setOnEndOfMedia(()->{
			System.out.println("Called");
			btnPlay.setVisible(true);
			btnStop.setVisible(false);
			visualTimerStart();
		});
		mediaPlayer.play();
		btnPlay.setVisible(false);
		btnStop.setVisible(true);
	}

	@FXML
	public void stopButtonClicked()
	{
		btnPlay.setVisible(true);
		btnStop.setVisible(false);
		mediaPlayer.stop();
		
	}
	
	public void setButtons()
	{
		if(btnVOneClicked==false)
			btnVisualOne.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #FC9E4F 100%) ;");
			else
				btnVisualOne.setStyle("-fx-background-color: transperant ; -fx-border-color: white;-fx-text-fill: white");
			
			if(btnVTwoClicked==false)
				btnVisualTwo.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #FC9E4F 100%) ;");
				else
					btnVisualTwo.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnVThreeClicked==false)
				btnVisualThree.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #FC9E4F 100%) ;");
				else
					btnVisualThree.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnVFourClicked==false)
				btnVisualFour.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #FC9E4F 100%) ;");
				else
					btnVisualFour.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnAOneClicked==false)
				btnAudioOne.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #545677 100%) ;");
				else
					btnAudioOne.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnATwoClicked==false)
				btnAudioTwo.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #545677 100%) ;");
				else
					btnAudioTwo.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnAThreeClicked==false)
				btnAudioThree.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #545677 100%) ;");
				else
					btnAudioThree.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
			
			if(btnAFourClicked==false)
				btnAudioFour.setStyle("-fx-background-color: #54FFE5, linear-gradient(#BCEDF6 10%, #54FFE5 30%, #545677 100%) ;");
				else
					btnAudioFour.setStyle("-fx-background-color: transperant ;-fx-border-color: white;-fx-text-fill: white");
		}
	
	
	@FXML
	public void backButtonClicked()
	{
		BackstageController bc=new BackstageController();
		bc.startHomeScreen();
	};
	
	@FXML
	public void backButtonOfAudioVisualClicked(ActionEvent ae)
	{
		if(timerStarted)
		{
			timer.cancel();
			timerStarted=false;
		}
		try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AudioVisualSelection.fxml"));
		     Parent root = loader.load();
			 Scene newScene=new Scene(root);
			 newScene.getStylesheets().add(getClass().getResource("/view/AudioVisualScene.css").toExternalForm());
		     AudioVisualController controller = loader.getController();
		     controller.setButtons();
		    
			 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
			 
			 window.setScene(newScene);
			 window.setMaximized(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	};
	
	public void visualClicked(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton==btnVisualOne)
		{
			Question.visualButtonClicked=0;
			btnVOneClicked=true;
		}
		else if(clickedButton==btnVisualTwo)
		{
			Question.visualButtonClicked=1;
			btnVTwoClicked=true;
		}
		else if(clickedButton==btnVisualThree)
		{
			Question.visualButtonClicked=2;
			btnVThreeClicked=true;
		}
		else if(clickedButton==btnVisualFour)
		{
			btnVFourClicked=true;
			Question.visualButtonClicked=3;
		}
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AudioVisualScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/AudioVisualScene.css").toExternalForm());
	     AudioVisualController controller = loader.getController();
		 controller.setVisualQuestion();
		
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
	}
	
	public void audioButtonClicked(ActionEvent ae) throws IOException
	{
		Button clickedButton=(Button)ae.getSource();
		if(clickedButton==btnAudioOne)
		{
			Question.audioButtonClicked=0;
			btnAOneClicked=true;
		}
		else if(clickedButton==btnAudioTwo)
		{
			btnATwoClicked=true;
			Question.audioButtonClicked=1;
		}
		else if(clickedButton==btnAudioThree)
		{
			btnAThreeClicked=true;
			Question.audioButtonClicked=2;
		}
		else if(clickedButton==btnAudioFour)
		{
			btnAFourClicked=true;
			Question.audioButtonClicked=3;
		}
		
		 FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/AudioScene.fxml"));
	     Parent root = loader.load();
		 Scene newScene=new Scene(root);
		 newScene.getStylesheets().add(getClass().getResource("/view/AudioVisualScene.css").toExternalForm());
	     AudioVisualController controller = loader.getController();
	     controller.setAudioQuestion();
	    
		 Stage window=(Stage)((Node)ae.getSource()).getScene().getWindow();
		 
		 window.setScene(newScene);
		 window.setMaximized(true);
	}
	
	public void setVisualQuestion() 
	{
		if(Question.visualQuestions[Question.visualButtonClicked][4].equals("image"))
		{
			lblClue.setWrapText(true);
			btnPlay.setVisible(false);
			btnStop.setVisible(false);
			lblQuestionPane.setText(Question.visualQuestions[Question.visualButtonClicked][0]);
			imageView.setImage(new Image(Question.visualQuestions[Question.visualButtonClicked][1]));
			lblAnswer.setText(Question.visualQuestions[Question.visualButtonClicked][2]);
			lblClue.setText(Question.visualQuestions[Question.visualButtonClicked][3]);
			mediaView.setVisible(false);
			imageView.setVisible(true);
			visualTimerStart();
			
		}
		else
		{
			btnPlay.setVisible(true);
			String path=new File(Question.visualQuestions[Question.visualButtonClicked][1]).getAbsolutePath();
			media=new Media(new File(path).toURI().toString());
			mediaPlayer=new MediaPlayer(media);
			mediaView.setMediaPlayer(mediaPlayer);
			lblQuestionPane.setText(Question.visualQuestions[Question.visualButtonClicked][0]);
			lblAnswer.setText(Question.visualQuestions[Question.visualButtonClicked][2]);
			lblClue.setText(Question.visualQuestions[Question.visualButtonClicked][3]);
			mediaView.setVisible(true);
			imageView.setVisible(false);
		}
	}
	
	public void setAudioQuestion()
	{
		lblClueAudio.setWrapText(true);
			btnStopAudio.setVisible(false);
			lblQuestionPaneAudio.setText(Question.audioQuestions[Question.audioButtonClicked][0]);
			lblAnswerAudio.setText(Question.audioQuestions[Question.audioButtonClicked][2]);
			lblClueAudio.setText(Question.audioQuestions[Question.audioButtonClicked][3]);
			
	}
	
	public void playAudioClicked()
	{
		String path=new File(Question.audioQuestions[Question.audioButtonClicked][1]).getAbsolutePath();
		media=new Media(new File(path).toURI().toString());
		mediaPlayer=new MediaPlayer(media);
		mediaPlayer.setOnEndOfMedia(()->{
			System.out.println("Called");
			btnPlayAudio.setVisible(true);
			btnStopAudio.setVisible(false);
			audioTimerStart();
			
		});
		
		mediaPlayer.play();
		btnPlayAudio.setVisible(false);
		btnStopAudio.setVisible(true);
		
		
	}
	
	public void stopAudioClicked()
	{
		mediaPlayer.stop();
		btnPlayAudio.setVisible(true);
		btnStopAudio.setVisible(false);
	}
	
	public void showAnswerAudioClicked()
	{
		lblClueAudio.setVisible(false);
		lblAnswerAudio.setVisible(true);
		if(timerStarted)
		{
			timer.cancel();
			timerStarted=false;
		}
		String correctSoundPath=new File("src/sounds/correctsound.wav").getAbsolutePath();
		Media correctSoundMedia=new Media(new File(correctSoundPath).toURI().toString());
		MediaPlayer cmp=new MediaPlayer(correctSoundMedia);
		cmp.play();
	}
	
	public void showClueAudioClicked()
	{
		lblAnswerAudio.setVisible(false);
		lblClueAudio.setVisible(true);
	}
	
	public void showAnswerClicked()
	{
		lblClue.setVisible(false);
		lblAnswer.setVisible(true);
		if(timerStarted)
		{
			timer.cancel();
			timerStarted=false;
		}
		String correctSoundPath=new File("src/sounds/correctsound.wav").getAbsolutePath();
		Media correctSoundMedia=new Media(new File(correctSoundPath).toURI().toString());
		MediaPlayer cmp=new MediaPlayer(correctSoundMedia);
		cmp.play();
	}
	
	public void showClueClicked()
	{
		lblAnswer.setVisible(false);
		lblClue.setVisible(true);
	}
	
	public void setVisualTimeUp()
	{
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		Media wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		MediaPlayer wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
		imageView.setVisible(false);
		mediaView.setVisible(false);
		lblQuestionPane.setText("Time Up!");
		lblClue.setText("Time Up!");
	}
	
	public void setAudioTimeUp()
	{
		String wrongSoundPath=new File("src/sounds/wrongsound.wav").getAbsolutePath();
		Media wrongSoundMedia=new Media(new File(wrongSoundPath).toURI().toString());
		MediaPlayer wmp=new MediaPlayer(wrongSoundMedia);
		wmp.play();
		lblQuestionPaneAudio.setText("Time Up!");
		lblClueAudio.setText("Time Up!");
	}
	
	
	
	@FXML
	public void audioTimerStart()
	{
		timerStarted=true;
		timer = new Timer();
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
							setAudioTimeUp();
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
	
	@FXML
	public void visualTimerStart()
	{
		timerStarted=true;
		timer = new Timer();
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
							setVisualTimeUp();
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


