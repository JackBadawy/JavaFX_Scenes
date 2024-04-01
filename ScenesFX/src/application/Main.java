package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;


public class Main extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		//Stage stage = new Stage(); this make a new stage
		Group root = new Group();
		Scene scene = new Scene(root,Color.BROWN);
		
		Image icon = new Image("jb_FX.png");
		stage.getIcons().add(icon);
		stage.setTitle("First FX Stage -Woot Woot!!");
		stage.setWidth(420);
		stage.setHeight(420);
		stage.setResizable(false);
		//stage.setX(50);
		//stage.setY(50);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("YOU CANT ESCAPE UNLESS YOU PRESS q");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		stage.setScene(scene);
		stage.show();
	}
}
