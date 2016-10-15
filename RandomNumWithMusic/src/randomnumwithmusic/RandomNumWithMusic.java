/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumwithmusic;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class RandomNumWithMusic extends Application {

	MediaPlayer mediaplayer;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		Button btn_play;

		
                
                
               Label label1 = new Label("Correcly guess a number between 1 to 5:");
               TextField textField = new TextField ();
               btn_play = new Button("Enter");
                Random rand = new Random();
                int  RandomNumber = rand.nextInt(5) + 1;
                
		btn_play.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
                                 int inputNumber = Integer.parseInt(textField.getText());
                                System.out.println("The computer random number is "+ RandomNumber);
                                 if(inputNumber == RandomNumber){                                
				mediaplayer.play();
                                 }
                      }
		});
		

		Media musicFile = new Media(
				"file:///C:/Users/Personal/Documents/NetBeansProjects/RandomNumWithMusic/src/randomnumwithmusic/guessIt.mp3");

		mediaplayer = new MediaPlayer(musicFile);
		// mediaplayer.setAutoPlay(true);
		mediaplayer.setVolume(0.1);
		
		MediaView mediaView = new MediaView(mediaplayer);

		VBox root = new VBox();
		root.getChildren().addAll(mediaView,label1,textField,btn_play);
                root.setSpacing(10);
		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);

		stage.show();
	}

}