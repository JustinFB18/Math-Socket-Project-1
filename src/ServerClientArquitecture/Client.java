package ServerClientArquitecture;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private static final String HOST ="127.0.0.1";
    private static final int PORT = 8080;
    private static DataInputStream incomingMessage;
    private static DataOutputStream outgoingMessage;
    private static Socket client;
    private static Client instance;

    private Client() {
    }

    public static Client getInstance() {
        if (instance == null){
            instance = new Client();
        }
        return instance;
    }

    public static void createClient() throws IOException {
        client = new Socket(HOST,PORT);
        incomingMessage = new DataInputStream(client.getInputStream());
        outgoingMessage = new DataOutputStream(client.getOutputStream());
    }

    public void closeConnections() throws IOException {
        client.close();
        incomingMessage.close();
        outgoingMessage.close();
    }

    public static void main(String[] args) throws IOException {
        Client c = new Client();
        c.createClient();
    }
}
