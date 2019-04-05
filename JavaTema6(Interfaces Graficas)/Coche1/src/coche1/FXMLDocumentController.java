/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche1;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author pablo
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private TextArea txa;
    @FXML
    private ImageView imwCocheAzul;
    @FXML
    private ImageView imwCocheRojo;
    @FXML
    private Button btn1;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        text += "Para encender el coche pulsar :E\nPara quitar el freno de mano pulsar : F\n"
                + "Para apagar el coche pulsar :O\nPara poner frenomano poner :P\n";

        txa.setText(text);
        txa.appendText("");
    }
    Coche cAzul;
    Coche cRojo;
    Coche otrocoche;
    Escenario escenario;
    Coche coches;

    ArrayList<Coche> vehiculo = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random rnd = new Random();
        escenario = new Escenario(4, -1, 600, 350);

        imwCocheAzul.setLayoutX(escenario.posicionAtleatoriaX());
        imwCocheAzul.setLayoutY(escenario.posicionatleatoriaY());
        imwCocheRojo.setLayoutX(escenario.posicionAtleatoriaX());
        imwCocheRojo.setLayoutY(escenario.posicionatleatoriaY());

        cAzul = new Coche("imwCocheAzul", imwCocheAzul.getLayoutX(), imwCocheAzul.getLayoutY(), escenario, 50);
        vehiculo.add(cAzul);
        cRojo = new Coche("imwCocheRojo", imwCocheRojo.getLayoutX(), imwCocheRojo.getLayoutY(), escenario, 50);
        vehiculo.add(cRojo);

        escenario.agregarcoche(cAzul);
        escenario.agregarcoche(cRojo);

    }
    String text = "";
    boolean coche = false;

    @FXML
    private void mover(KeyEvent event) {

        KeyCode kc = event.getCode();
     //   if (!escenario.cochesfuera()) {

            System.out.println(escenario.pinf);
           // System.out.println("coques:" + coches.choque(otrocoche));
            if (escenario.choque(coches) > coches.Radio) {

                switch (kc) {

                    case P:
                        text += "FRENO DE MANO PUESTO!" + "\n";
                        coches.frenoMano = true;
                        txa.setText(text);
                        //System.out.println(coches.choque(otrocoche));
                        txa.appendText("");
                    case O:
                        text += "COCHE APAGADO!" + "\n";
                        txa.setText(text);
                        //System.out.println(coches.choque(otrocoche));
                        txa.appendText("");
                        coches.encendido = false;
                        break;
                    case F:
                        text += "FRENO DE MANO QUITADO!" + "\n";
                        txa.setText(text);
                        //System.out.println(coches.choque(otrocoche));
                        txa.appendText("");
                        coches.frenoMano = false;
                        break;
                    case E:
                        text += "COCHE ENCENDIDO!" + "\n";
                        txa.setText(text);
                        //System.out.println(coches.choque(otrocoche));
                        txa.appendText("");
                        coches.encendido = true;
                        break;
                    case W:
                    case UP:
                        text += coches.moverArriba(10) + "\n";
                        car.setLayoutY(coches.posicion.y);
                        //System.out.println(coches.choque(otrocoche));
                        txa.setText(text);
                        txa.appendText("");

                        break;
                    case S:
                    case DOWN:

                        text += coches.moverAbajo(10) + "\n";
                        car.setLayoutY(coches.posicion.y);
                       // System.out.println(coches.choque(otrocoche));
                        txa.setText(text);
                        txa.appendText("");

                        break;
                    case A:
                    case LEFT:

                        text += coches.moverIzquierda(10) + "\n";
                        car.setLayoutX(coches.posicion.x);
                        //System.out.println(coches.choque(otrocoche));
                        txa.setText(text);
                        txa.appendText("");
                        break;
                    case D:
                    case RIGHT:
                        text += coches.moverDerecha(10) + "\n";
                        car.setLayoutX(coches.posicion.x);
                        //System.out.println(coches.choque(otrocoche));
                        txa.setText(text);
                        txa.appendText("");
                        break;
                    default:
                        String letra = kc.getName();

                }
            } else {
                Dialog dialog = crearDialog();
                Optional<String> result = dialog.showAndWait();
                if (result.isPresent()) {
                    text += dialog.getResult() + "\n";
                    txa.setText(text);
                    txa.appendText("");
                }
            }

      //  }else{
            
      //  }

    }

    ImageView car;

    @FXML
    private void seleccionarCoche(MouseEvent event) {

        car = (ImageView) event.getSource();

        for (Coche coche1 : vehiculo) {
            if (car.getId().equals(coche1.nombre)) {
                System.out.println("entra");
                coches = coche1;
                text += coche1.toString() + "\n";
            } else if (!car.getId().equals(coche1.nombre)) {
                otrocoche = coche1;
                System.out.println("fuera" + otrocoche.nombre);
            }

        }

        System.out.println(text);
        txa.setText(text);
        txa.appendText("");

    }

    @FXML
    private void ejecutar(MouseEvent event) {

    }

    Dialog crearDialog() {

        System.out.println("esta aqui");

        Dialog dialog = new Dialog<>();
        dialog.setTitle("input notas ponderadas");
        dialog.setHeaderText("ver/editar notas de la ponderación elegida");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextArea txa = new TextArea();
        txa.setText("HAY CHOQUE!");
        dialog.getDialogPane().setContent(txa);
        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {

                return txa.getText();

            } else {
                return null;
            }
        });
        return dialog;
    }

}
