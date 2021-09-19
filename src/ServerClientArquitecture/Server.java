package ServerClientArquitecture;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int PORT = 8080;
    private ServerSocket serverSystem;

    public void createServer() throws IOException {
        serverSystem = new ServerSocket(PORT);
        System.out.println("Servidor abierto");
    }

    public void kill() throws IOException {
        serverSystem.close();
    }

    public void waitingClient() throws IOException{
        while (true) {
            Socket client = serverSystem.accept();
            System.out.println("Cliente conectado");
        }
    }
    public static void main(String[] args) {
        Server myServer = new Server();
        try{
            myServer.createServer();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
