package StartWindow;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private final int PORT = 8080;
    private ServerSocket serverSystem;

    public void createServer() throws IOException {
        serverSystem = new ServerSocket(PORT);
        while (true) {
            Socket client = serverSystem.accept();
        }
    }
}
