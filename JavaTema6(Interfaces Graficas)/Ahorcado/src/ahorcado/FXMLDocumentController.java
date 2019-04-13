/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.net.URL;
import java.util.HashSet;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.AccessibleAction;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Canvas canvas;
    @FXML
    private TextField textEnseñar;
    @FXML
    private Button ButtonApostar;
    @FXML
    private Label labelErrores;
    @FXML
    private TextField textApostar;
    @FXML
    private Label labelOportunidades;
    @FXML
    private GridPane grip;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    Ahorcado ahor;
    GraphicsContext gc;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        ahor = new Ahorcado();
        ahor.ocultarPalabra();

        gc.setFill(Color.BLACK);
        gc.fillRect(150, 300, 60, 5);
        gc.setFill(Color.BLACK);
        gc.fillRect(175, 50, 5, 250);
        gc.setFill(Color.BLACK);
        gc.fillRect(175, 50, 180, 5);
        gc.setFill(Color.BLACK);
        gc.setLineWidth(5.0);
        gc.strokeLine(295, 55, 180, 90);

    }

    @FXML
    private void apostarLetra(MouseEvent event) {

        if (textApostar.getText() == null) {

        } else {
            //char letraApostada = textApostar.getText().toLowerCase().charAt(0);

            String res = String.valueOf(ahor.apostarLetra(textApostar.getText().toLowerCase().charAt(0)));
            textEnseñar.setText(res);

            labelErrores.setText(ahor.enseñarFallos());
            if (textEnseñar.getText().equals(ahor.palabra)) {
                Dialog dialog = crearDialogWin();
                Optional<String> result = dialog.showAndWait();
              
                Button btn = new Button();
                btn.setText("Reiniciar");
                btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> reiniciar());
                grip.add(btn, 1, 0);
            }
            labelOportunidades.setText(ahor.OportunidadesRestantes() + "");
            textApostar.setText("");
            int option = ahor.OportunidadesRestantes();
            dibujoAhorcado(option);
            if (ahor.OportunidadesRestantes() < 1) {
                Dialog dialog = crearDialog();
                Optional<String> result = dialog.showAndWait();
               Button btn = new Button();
                btn.setText("Reiniciar");
                btn.addEventHandler(MouseEvent.MOUSE_CLICKED, evt -> reiniciar());
                grip.add(btn, 1, 0);

            }

        }

    }

    public void reiniciar() {
        ahor.reiniciarPartida();
        ahor.ocultarPalabra();
        textApostar.setText("");
        textEnseñar.setText("");
        labelErrores.setText("");
        labelOportunidades.setText("");
      
    }

    public void dibujoAhorcado(int option) {

        switch (option) {
            case 6:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                break;
            case 5:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.BLACK);
                gc.fillRect(335, 125, 5, 50);
                break;
            case 4:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.BLACK);
                gc.fillRect(335, 125, 5, 50);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);

                break;
            case 3:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.BLACK);
                gc.fillRect(335, 125, 5, 50);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 120, 380, 180);
                break;
            case 2:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.BLACK);
                gc.fillRect(335, 125, 5, 50);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 120, 380, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(300, 250, 335, 175);
                break;
            case 1:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.BLACK);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.BLACK);
                gc.fillRect(335, 125, 5, 50);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 120, 380, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(300, 250, 335, 175);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(400, 250, 340, 175);
                break;
            case 0:
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BURLYWOOD);
                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                gc.setFill(Color.BLACK);
                gc.fillRect(150, 300, 60, 5);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 5, 250);
                gc.setFill(Color.BLACK);
                gc.fillRect(175, 50, 180, 5);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(295, 55, 180, 90);
                gc.setFill(Color.RED);
                gc.fillOval(320, 75, 35, 50);
                gc.setFill(Color.RED);
                gc.fillRect(335, 125, 5, 50);
                gc.setStroke(Color.BLACK);
                gc.strokeLine(335, 125, 300, 180);
                gc.setFill(Color.BLACK);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.RED);
                gc.strokeLine(335, 125, 300, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.RED);
                gc.strokeLine(335, 120, 380, 180);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.RED);
                gc.strokeLine(300, 250, 335, 175);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.RED);
                gc.strokeLine(400, 250, 340, 175);
                gc.setLineWidth(5.0);
                gc.setStroke(Color.RED);
                gc.strokeLine(335, 100, 335, 55);
                break;
        }

    }

    Dialog crearDialog() {

        Dialog dialog = new Dialog<>();
        dialog.setTitle("AHORCADO");
        dialog.setHeaderText("Juego del Ahorcado");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextArea txaNotas = new TextArea();
        txaNotas.setText("HAS PERDIDO!!!!\n SUERTE LA PROXIMA VEZ!\n La palabra secreta era : " + ahor.palabra);
        dialog.getDialogPane().setContent(txaNotas);
        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {
                System.out.println(txaNotas.getText());

                return txaNotas.getText();

            } else {
                return null;
            }
        });
        return dialog;
    }

    Dialog crearDialogWin() {

        Dialog dialog = new Dialog<>();
        dialog.setTitle("AHORCADO");
        dialog.setHeaderText("Juego del Ahorcado");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextArea txaNotas = new TextArea();
        txaNotas.setText("HAS GANADO!!!!\n FELICIDADES!");
        dialog.getDialogPane().setContent(txaNotas);
        dialog.setResultConverter(button -> {
            if (button == ButtonType.OK) {
                System.out.println(txaNotas.getText());

                return txaNotas.getText();

            } else {
                return null;
            }
        });
        return dialog;
    }

}
