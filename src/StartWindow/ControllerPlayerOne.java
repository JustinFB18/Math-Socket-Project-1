package StartWindow;

import ServerClientArquitecture.Server;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ControllerPlayerOne extends MainController{
    private boolean state = false;
    Server s;

    @FXML
    public void initialize() throws IOException {
        s = new Server();
        System.out.println("Controlador 1");
        if (!state) {
            s.createServer();
            state = true;
        }
        new Thread(()-> {
            try {
                s.waitingClient();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }


}
