package StartWindow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        URL location= getClass().getResource("StartWindow.fxml");
        loader.setLocation(location);
        loader.setController(new ControllerPlayerOne());
        primaryStage.setTitle("Math Socket - Welcome");
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 500, 450));
        primaryStage.show();
    }
    /*
    @Override
    public void start(Stage s){
        // set title for the stage
        s.setTitle("creating textInput dialog");

        // create a tile pane
        TilePane r = new TilePane();

        // create a text input dialog
        TextInputDialog td = new TextInputDialog("enter any text");

        // setHeaderText
        td.setHeaderText("enter your name");

        // create a button
        Button d = new Button("click");

        // create a event handler
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                // show the text input dialog
                td.show();
            }
        };

        // set on action of event
        d.setOnAction(event);

        // add button and label
        r.getChildren().add(d);

        // create a scene
        Scene sc = new Scene(r, 500, 300);

        // set the scene
        s.setScene(sc);

        s.show();
    }

     */

    public static void main(String[] args) {
        launch(args);
    }
}
