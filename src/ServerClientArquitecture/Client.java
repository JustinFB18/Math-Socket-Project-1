package ServerClientArquitecture;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    private final String HOST ="127.0.0.1";
    private final int PORT = 5000;
    private DataInputStream incomingMessage;
    private DataOutputStream outgoingMessage;
    private Socket client;

    public void createClient() throws IOException {
        client = new Socket(HOST,PORT);
        incomingMessage = new DataInputStream(client.getInputStream());
        outgoingMessage = new DataOutputStream(client.getOutputStream());
    }

    public void closeConnections() throws IOException {
        client.close();
        incomingMessage.close();
        outgoingMessage.close();
    }
}
