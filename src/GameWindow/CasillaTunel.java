package GameWindow;

import ServerClientArquitecture.Client;

import java.util.Random;

/**
 * The CasillaTunel Class that creates only one instance of the class and allows to know how many boxes to move forward.
 *
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class CasillaTunel {
    private CasillaTunel instance;
    private static Random random;
    /**
     * This is the constructor method of the class, initialize the randon var to a new Random Object.
     */
    private CasillaTunel(){
        Random random = new Random();
    }

    /**
     * This method verificates if exists any instance of the class, and return the existing one if there is
     * or create one to return it.
     * @return instance the object to get access to the method to throw dice.
     */
    public CasillaTunel getInstance() {
        if (instance == null){
            instance = new CasillaTunel();
        }
        return instance;
    }

    /**
     * Shows the number of boxes to move forward
     * @return a number of boxes to move forward
     */
    public static int camposPorAvanzar(){
        return random.nextInt(3)+1;
    }

    public static void main(String[] args) {
        System.out.println(camposPorAvanzar());
    }
}
