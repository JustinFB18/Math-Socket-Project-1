package GameWindow;

import javafx.scene.shape.Polygon;

import java.util.Random;

/**
 * The CasillaTrampa Class that creates only one instance of the class and allows to know how many boxes to move back.
 *
 * @author Justin Fern&aacute;ndez and Abraham Venegas
 * @version 1
 */
public class CasillaTrampa extends Polygon {
    private static Random random;
    private static CasillaTrampa instance;

    /**
     * This is the constructor method of the class, initialize the random var to a new Random Object.
     */
    public CasillaTrampa(){
        Random random = new Random();
    }

    /**
     * This method verificates if exists any instance of the class, and return the existing one if there is
     * or create one to return it.
     * @return instance the object to get access to the method to throw dice.
     */
    public static CasillaTrampa getInstance() {
        if (instance == null){
            instance = new CasillaTrampa();
        }
        return instance;
    }

    /**
     * Shows the number of boxes to move back
     * @return a number of boxes to move back
     */
    public static int camposPorRegresar(){
        return random.nextInt(3)+1;
    }

    public static void main(String[] args) {
        System.out.println(camposPorRegresar());
    }
}
