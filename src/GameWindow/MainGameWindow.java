package GameWindow;

import StartWindow.ControllerPlayerOne;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;
import java.net.URL;

public class MainGameWindow {

    public static void main() throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        URL location= MainGameWindow.class.getResource("Game.fxml");
        loader.setLocation(location);
        loader.setController(new GameController());
        primaryStage.setTitle("Math Socket - Game");
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 700, 450));
        int[] casillas = casillasAleatorias();
        System.out.println(casillas[0]+" "+casillas[1]+" "+casillas[2]);
        primaryStage.show();
    }

    public static int[] casillasAleatorias() {
        Random random = new Random();
        int casillasReto;
        while(true){
            casillasReto = random.nextInt(12)+1;
            if (casillasReto>=8){
                break;
            }
        }
        //14 because the first and the last are almost empty
        int casillasTunel = random.nextInt((14-casillasReto)/2)+1;
        int casillasTrampa = 14-casillasReto-casillasTunel;
        int[] casillas = new int[]{casillasReto, casillasTrampa, casillasTunel};
        return casillas;
    }
}
