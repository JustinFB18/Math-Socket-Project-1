package StartWindow;

import GameWindow.GameController;
import GameWindow.MainGameWindow;
import ServerClientArquitecture.Client;
import ServerClientArquitecture.Server;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ControllerPlayerOne extends MainController{
    private boolean state = false;
    public Stage stage;
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
                System.out.println("statePor aqui = " + state);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public boolean ClientList() {
        System.out.println(Client.isState());
        if (Client.isState()) {
            if (!GetName().equalsIgnoreCase("")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void jugadoresConectados() throws IOException {
        System.out.println("jugador: "+Client.isState());
        System.out.println("Server: "+ GetName());
        if (ClientList()){
            stage = (Stage) playButton.getScene().getWindow();
            stage.close();
            MainGameWindow.main();
            /*Stage primaryStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            URL location= getClass().getResource("/GameWindow/Game.fxml");
            loader.setLocation(location);
            loader.setController(new GameController());
            primaryStage.setTitle("Math Socket");
            Parent root = loader.load();
            primaryStage.setScene(new Scene(root, 600, 500));
            primaryStage.show();*/
        }
    }

    @Override
    public void jugar(ActionEvent e) throws IOException {
        super.jugar(e);
        jugadoresConectados();
    }
}