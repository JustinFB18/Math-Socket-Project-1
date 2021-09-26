package GameWindow;

import java.util.Random;

public class CasillaReto {
    Random random;
    private static CasillaReto instance;
    private CasillaReto(){
        random = new Random();
    }

    public static CasillaReto getInstance() {
        if (instance == null){
            instance = new CasillaReto();
        }
        return instance;
    }

    public void mostrarReto(){
        double resultado = 0;
        String[] operaciones = new String[] {"+","-","/","*"};
        int x = random.nextInt(51);
        int y = random.nextInt(51);
        int operacion = random.nextInt(4);
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
