package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	private static Stage pstage;
	private Scene scene,newScene;
	@Override
	public void start(Stage primaryStage) {
		Main.pstage=primaryStage;
		try 
		{
			Parent root=FXMLLoader.load(getClass().getResource("/view/RoundSelectionScene.fxml"));
			scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/view/RoundSelectionScene.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setMaximized(true);
			primaryStage.show();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Scene changeScene(String newSceneURL)
	{
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource(newSceneURL));
			newScene = new Scene(root);
			Main.pstage.setScene(newScene);
			Main.pstage.setMaximized(true);
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return newScene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
