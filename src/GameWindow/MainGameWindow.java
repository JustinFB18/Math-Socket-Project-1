package GameWindow;

import StartWindow.ControllerPlayerOne;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MainGameWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        URL location= getClass().getResource("Game.fxml");
        loader.setLocation(location);
        loader.setController(new ControllerPlayerOne());
        primaryStage.setTitle("Math Socket - Game");
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
