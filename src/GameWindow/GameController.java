package GameWindow;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class GameController {
    @FXML
    public Pane MainPane;
    @FXML
    public Button DiceButton;
    @FXML
    public TextArea valorDado;
    public double scaleX = 0.75;
    public double scaleY = 0.75;

    @FXML
    public void initialize() {
        // The first triangle
        /*Polygon trianguloInicio = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        trianguloInicio.setLayoutX(100);
        trianguloInicio.setLayoutY(92);
        trianguloInicio.setFill(Color.BEIGE);
        trianguloInicio.setRotate(90);
        trianguloInicio.setScaleX(scaleX);
        trianguloInicio.setScaleY(scaleY);

        // The last triangle
        Polygon trianguloFinal = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        trianguloFinal.setLayoutX(104);
        trianguloFinal.setLayoutY(348);
        trianguloFinal.setFill(Color.RED);
        trianguloFinal.setRotate(-90);
        trianguloFinal.setScaleX(scaleX);
        trianguloFinal.setScaleY(scaleY);

        // First row triangles
        Polygon triangulo2 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo2.setLayoutX(104);
        triangulo2.setLayoutY(348);
        triangulo2.setFill(Color.RED);
        triangulo2.setRotate(90);
        triangulo2.setScaleX(scaleX);
        triangulo2.setScaleY(scaleY);

        Polygon triangulo3 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo3.setLayoutX(104);
        triangulo3.setLayoutY(348);
        triangulo3.setFill(Color.RED);
        triangulo3.setRotate(90);
        triangulo3.setScaleX(scaleX);
        triangulo3.setScaleY(scaleY);

        Polygon triangulo4 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo4.setLayoutX(104);
        triangulo4.setLayoutY(348);
        triangulo4.setFill(Color.RED);
        triangulo4.setRotate(180);
        triangulo4.setScaleX(scaleX);
        triangulo4.setScaleY(scaleY);

        // Second row triangles

        Polygon triangulo5 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo5.setLayoutX(104);
        triangulo5.setLayoutY(348);
        triangulo5.setFill(Color.RED);
        triangulo5.setScaleX(scaleX);
        triangulo5.setScaleY(scaleY);
        triangulo5.setRotate(-90);

        Polygon triangulo6 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo6.setLayoutX(104);
        triangulo6.setLayoutY(348);
        triangulo6.setFill(Color.RED);
        triangulo6.setScaleX(scaleX);
        triangulo6.setScaleY(scaleY);
        triangulo6.setRotate(-90);

        Polygon triangulo7 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo7.setLayoutX(104);
        triangulo7.setLayoutY(348);
        triangulo7.setFill(Color.RED);
        triangulo7.setScaleX(scaleX);
        triangulo7.setScaleY(scaleY);
        triangulo7.setRotate(-90);

        Polygon triangulo8 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo8.setLayoutX(104);
        triangulo8.setLayoutY(348);
        triangulo8.setFill(Color.RED);
        triangulo8.setScaleX(scaleX);
        triangulo8.setScaleY(scaleY);
        triangulo8.setRotate(180);

        // Third row triangles

        Polygon triangulo9 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo9.setLayoutX(104);
        triangulo9.setLayoutY(348);
        triangulo9.setFill(Color.RED);
        triangulo9.setScaleX(scaleX);
        triangulo9.setScaleY(scaleY);
        triangulo9.setRotate(90);

        Polygon triangulo10 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo10.setLayoutX(104);
        triangulo10.setLayoutY(348);
        triangulo10.setFill(Color.RED);
        triangulo10.setScaleX(scaleX);
        triangulo10.setScaleY(scaleY);
        triangulo10.setRotate(90);

        Polygon triangulo11 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo11.setLayoutX(104);
        triangulo11.setLayoutY(348);
        triangulo11.setFill(Color.RED);
        triangulo11.setScaleX(scaleX);
        triangulo11.setScaleY(scaleY);
        triangulo11.setRotate(90);

        Polygon triangulo12 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo12.setLayoutX(104);
        triangulo12.setLayoutY(348);
        triangulo12.setFill(Color.RED);
        triangulo12.setScaleX(scaleX);
        triangulo12.setScaleY(scaleY);
        triangulo12.setRotate(180);
        // Four row triangles
        Polygon triangulo13 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo13.setLayoutX(104);
        triangulo13.setLayoutY(348);
        triangulo13.setFill(Color.RED);
        triangulo13.setScaleX(scaleX);
        triangulo13.setScaleY(scaleY);
        triangulo13.setRotate(-90);

        Polygon triangulo14 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo14.setLayoutX(104);
        triangulo14.setLayoutY(348);
        triangulo14.setFill(Color.RED);
        triangulo14.setScaleX(scaleX);
        triangulo14.setScaleY(scaleY);
        triangulo14.setRotate(-90);

        Polygon triangulo15 = new Polygon(new double[]{-50.0, 40.0, 50.0, 40.0, 0.0, -60.0});
        triangulo15.setLayoutX(104);
        triangulo15.setLayoutY(348);
        triangulo15.setFill(Color.RED);
        triangulo15.setScaleX(scaleX);
        triangulo15.setScaleY(scaleY);
        triangulo15.setRotate(-90);

        // Adding Triangles to the pane
        MainPane.getChildren().add(trianguloInicio);
        MainPane.getChildren().add(triangulo2);
        MainPane.getChildren().add(triangulo3);
        MainPane.getChildren().add(triangulo4);
        MainPane.getChildren().add(triangulo5);
        MainPane.getChildren().add(triangulo6);
        MainPane.getChildren().add(triangulo7);
        MainPane.getChildren().add(triangulo8);
        MainPane.getChildren().add(triangulo9);
        MainPane.getChildren().add(triangulo10);
        MainPane.getChildren().add(triangulo11);
        MainPane.getChildren().add(triangulo12);
        MainPane.getChildren().add(triangulo13);
        MainPane.getChildren().add(triangulo14);
        MainPane.getChildren().add(triangulo15);
        MainPane.getChildren().add(trianguloFinal);*/
    }
    public void tirarDados(){
        Dado dado = Dado.getInstance();
        int valor = dado.tirarDado();
        valorDado.setText(String.valueOf(valor));
    }
}
