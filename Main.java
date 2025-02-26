package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Text name = new Text("Harlis Feimster.");
		Text email = new Text("feimsterh2@montclair.edu");
		Text major = new Text("Computer Science");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
