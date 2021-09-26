package GameWindow;

import java.util.Random;

/**
 * The Dado Class that creates only one instance of the class and allows to throw dice.
 *
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class Dado {
    public static Dado instance;
    public Random random;


    /**
     * This is the constructor method of the class, initialize the randon var to a new Random Object.
     */
    private Dado(){
        random = new Random();
    }

    /**
     * This method verificates if exists any instance of the class, and return the existing one if there is
     * or create one to return it.
     * @return instance the object to get access to the method to throw dice.
     */
    public static Dado getInstance() {
        if (instance == null){
            instance = new Dado();
        }
        return instance;
    }

    /**
     * This method throw dice in a range of 1 to 4, both included.
     * @return the number of boxes to move the player.
     */
    public int tirarDado(){
        return random.nextInt(4)+1;
    }
}
