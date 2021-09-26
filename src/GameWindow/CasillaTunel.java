package GameWindow;

import ServerClientArquitecture.Client;

import java.util.Random;

public class CasillaTunel {
    private CasillaTunel instance;
    private static Random random;
    private CasillaTunel(){
        Random random = new Random();
    }

    public CasillaTunel getInstance() {
        if (instance == null){
            instance = new CasillaTunel();
        }
        return instance;
    }

    public static int camposPorAvanzar(){
        return random.nextInt(3)+1;
    }

    public static void main(String[] args) {
        System.out.println(camposPorAvanzar());
    }
}
