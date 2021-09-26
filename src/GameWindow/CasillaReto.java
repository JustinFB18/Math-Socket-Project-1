package GameWindow;

import java.util.Random;


/**
 * The CasillaReto Class that creates only one instance of the class and allows to know the challenge for a player.
 *
 * @author Justin Fern&aacute;ndez y Abraham Venegas
 * @version 1
 */
public class CasillaReto {
    Random random;
    private static CasillaReto instance;

    /**
     * This is the constructor method of the class, initialize the randon var to a new Random Object.
     */
    private CasillaReto(){
        random = new Random();
    }

    /**
     * This method verificates if exists any instance of the class, and return the existing one if there is
     * or create one to return it.
     * @return instance the object to get access to the method to throw dice.
     */
    public static CasillaReto getInstance() {
        if (instance == null){
            instance = new CasillaReto();
        }
        return instance;
    }

    /**
     * Shows the challenge for other player
     */
    public void mostrarReto(){
        double resultado = 0;
        String[] operaciones = new String[] {"+","-","/","*"};
        // The range is from 0 to 51, excluding 51
        int x = random.nextInt(51);
        int y = random.nextInt(51);
        // The range is from 0 to 4, excluding 4
        int operacion = random.nextInt(4);
        // Chooses the operation to do randomly
        String operadorPorRealizar = operaciones[operacion];
        System.out.println("Realice: "+x+operadorPorRealizar+y);
        if (operadorPorRealizar.equals("+")){
            resultado = x + y;
        } else if(operadorPorRealizar.equals("-")){
            resultado = x - y;
        }else if(operadorPorRealizar.equals("/")){
            resultado = x / y;
        } else{
            resultado = x*y;
        }
        System.out.println("resultado = " + resultado);
    }

    public static void main(String[] args) {
        CasillaReto c = CasillaReto.getInstance();
        c.mostrarReto();
    }
}
