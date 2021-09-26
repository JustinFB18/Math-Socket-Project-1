package ServerClientArquitecture;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * The Client Class that allows to connect to a server
 *
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class Client {
    private static final String HOST ="127.0.0.1";
    private static final int PORT = 8080;
    private static DataInputStream incomingMessage;
    private static DataOutputStream outgoingMessage;
    private static Socket client;
    private static Client instance;
    public static boolean state = false;

    /**
     * This is the constructor method of the class, initialize the randon var to a new Random Object.
     */
    private Client() {
    }

    /**
     * This method verificates if exists any instance of the class, and return the existing one if there is
     * or create one to return it.
     * @return instance the object to get access to the method to throw dice.
     */
    public static Client getInstance() {
        if (instance == null){
            instance = new Client();
        }
        return instance;
    }

    public static void createClient() throws IOException {
        client = new Socket(HOST,PORT);
        state = true;
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

    public static boolean isState() {
        return state;
    }
}
