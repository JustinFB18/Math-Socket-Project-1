package StartWindow;

import ServerClientArquitecture.Client;
import ServerClientArquitecture.Server;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControllerPlayerTwo extends MainController{
    private boolean state = false;
    @Override
    public void jugar(ActionEvent e) throws IOException {
        super.jugar(e);
        Client.getInstance();
        System.out.println("CONTROLADOR 2");
        if (!state) {
            Client.createClient();
            state = true;
        }
    }
}
