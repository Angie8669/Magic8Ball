package magic8Ball;

import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class MagicEightBall extends StackPane {
	public MagicEightBall() {
		
		Label label = new Label("Magic 8 Ball");
		
		Circle circle = new Circle(300, 300, 250, Color.BLACK);
		
		Circle circle2 = new Circle(300, 300, 100, Color.BLUE);
		
        Text t = new Text("");
        t.setFont(Font.font("Times New Roman", 25));
        t.setFill(Color.WHITE);
        t.setX(300 - t.getBoundsInLocal().getWidth());
        t.setY(300 - t.getBoundsInLocal().getHeight());
        t.setWrappingWidth(150);
        t.setTextAlignment(TextAlignment.CENTER);
        
        this.getChildren().addAll(label, circle, circle2, t);
	}
	
	public void clearSaying() {
		this.getChildren();
		for(Node n : this.getChildren()) {
			if (n instanceof Text) {
				Text t = (Text) n; 
				t.setText("");
				return;
			}
		}
	}
	
	public void showSaying() {
		this.getChildren();
		for(Node n : this.getChildren()) {
			if (n instanceof Text) {
				Text t = (Text) n; 
				t.setText(WiseSayings.getRandomSaying());
				return;
			}
		}
	}
}
