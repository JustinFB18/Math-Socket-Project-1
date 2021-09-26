package GameWindow;

import java.util.Random;

public class CasillaTrampa {
    private static Random random;
    private CasillaTrampa instance;
    private CasillaTrampa(){
        Random random = new Random();
    }

    public CasillaTrampa getInstance() {
        if (instance == null){
            instance = new CasillaTrampa();
        }
        return instance;
    }

    public static int camposPorRegresar(){
        return random.nextInt(3)+1;
    }

    public static void main(String[] args) {
        System.out.println(camposPorRegresar());
    }
}
