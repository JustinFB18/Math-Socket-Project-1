package StartWindow;

import com.sun.javafx.fxml.FXMLLoaderHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class PlayerTwo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL location= getClass().getResource("StartWindow.fxml");
        loader.setLocation(location);
        loader.setController(new ControllerPlayerTwo());
        primaryStage.setTitle("Math Socket - Welcome");
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
