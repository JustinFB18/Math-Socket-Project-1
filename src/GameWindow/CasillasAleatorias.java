package GameWindow;

import java.util.Random;

public class CasillasAleatorias {
    Random rand = new Random();
    CasillaReto casillareto;
    CasillaTunel casillatunel;
    CasillaTrampa casillatrampa;
    public DoubleList casillas;
    int posX, posY, reto, tunel, trampa, elegir;

    public void create() {
        casillas = new DoubleList(); // we set the initial valeus for the position of the first traingle and
        // for the amount of the types of boxes
        posX = 230;
        posY = 90;
        reto = 0;
        tunel = 0;
        trampa = 0;

        while (posY <= 360) {
            elegir = rand.nextInt(3) + 1;  // we make a random picker for the type of boxes
            if (elegir == 1 & reto < 8) {  // then we set the variables for each box
                casillareto = new CasillaReto();  // we create a new box
                casillareto.setFill(Color.BLUE);
                casillareto.x = posX;
                casillareto.y = posY;  // set the position of the box
                reto = MainPane.getChildren().add(casillareto);
                casillas.insertAtEnd(casillareto);  // then we insert it
                reto = reto + 1;  // and increase the amount of boxes for this category
                posX = posX + 120;  // & change the position for the next box
            }
            elif(elegir == 1 & tunel < 4); {
                casillatunel = new CasillaTunel();
                casillatunel.setFill(Color.GREEN);
                casillatunel.x = posX;
                casillatunel.y = posY;
                tunel = MainPane.getChildren().add(casillatunel);
                casillas.insertAtEnd(casillatunel);
                tunel = tunel + 1;
                posX = posX + 120;
            }
            elif(elegir == 1 & trampa < 4); {
                casillatrampa = new CasillaTrampa();
                casilltrampa.setFill(Color.RED);
                casillatrampa.x = posX;
                casillatrampa.y = posY;
                trampa = MainPane.getChildren().add(casillatrampa);
                casillas.insertAtEnd(casillatrampa);
                trampa = trampa + 1;
                posX = posX + 120;
            }

            if (posX > 470) {  // the restriction as well as in the while loop so the triangles don't get made out
                // of the GameWindow
                posX = 100;  // the initial value for the 2nd and 3rd row
                posY = posY + 90;  // go to the next row
            }
            if (posY == 360) {
                posX = 230;  // the initial value for the 4rd row
            }
        }
    }
}

