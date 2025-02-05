package magic8Ball;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainStart extends Application {
	boolean buttonPressed = false;
	public static void main(String[] args) {
        launch(args);
    }
	
	public void start(Stage primaryStage) {
        BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp, 600, 600);
		MagicEightBall m8b = new MagicEightBall();
		bp.setCenter(m8b);
		
		
		EventHandler<ActionEvent> btnEvent = new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent e) {
				buttonPressed = !buttonPressed;
				Button btn = (Button) e.getTarget();
				if(buttonPressed) {
					m8b.showSaying();
					btn.setText("Clear Answer");
				} else {
					m8b.clearSaying();
					btn.setText("Show Answer");
				}
			}
		};
		
	    Button sayingButton = new Button("Show Answer");
	    sayingButton.setLayoutX(300);
	    sayingButton.setLayoutY(550);
	    sayingButton.setOnAction(btnEvent);
	    BorderPane.setAlignment(sayingButton, Pos.CENTER);
	    bp.setBottom(sayingButton);
		
        primaryStage.setTitle("Magic 8 Ball");
    	primaryStage.setScene(scene);
        primaryStage.show();
	}
	 
	 
}
