package StartWindow;

import ServerClientArquitecture.Client;
import ServerClientArquitecture.Server;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControllerPlayerTwo extends MainController{
    private boolean state = false;

    @FXML
    public void initialize() throws IOException {
        Client.getInstance();
        System.out.println("CONTROLADOR 2");
        if (!state) {
            Client.createClient();
            state = true;
        }
    }
}
