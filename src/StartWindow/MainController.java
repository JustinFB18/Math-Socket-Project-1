package StartWindow;

import GameWindow.MainGameWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.TilePane;

import java.io.IOException;


public class MainController {
    @FXML
    private TextField namePlayerTxt;
    String name = "";
    public void jugar(ActionEvent e) throws IOException {
        name = namePlayerTxt.getText();
        // create a tile pane
        TilePane r = new TilePane();
        // create a alert
        Alert a = new Alert(Alert.AlertType.NONE);
        if (name.length() == 0){
            // set alert type
            a.setAlertType(Alert.AlertType.ERROR);
            a.setContentText("Nombre inválido. Vuelva a intentarlo.");
            a.setHeaderText(null);
            // show the dialog
            a.show();
        }else {
            System.out.println("Your name is: " + name);
        }
    }


    public String GetName(){
        return name;
    }
}
