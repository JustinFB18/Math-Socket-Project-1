package GameWindow;

import java.util.Random;

public class Dado {
    public static Dado instance;
    public Random random;
    private Dado(){
        random = new Random();
    }

    public static Dado getInstance() {
        if (instance == null){
            instance = new Dado();
        }
        return instance;
    }

    public int tirarDado(){
        return random.nextInt(4)+1;
    }
}
