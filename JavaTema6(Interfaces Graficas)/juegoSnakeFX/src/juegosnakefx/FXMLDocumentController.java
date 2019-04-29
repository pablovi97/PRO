/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosnakefx;

import java.net.URL;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author Pablo Viera Martin
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button btn;
    @FXML
    private Canvas canvas;
    GraphicsContext gc;
    Timeline timeline;

    int numY;
    int numX;

    Escenario escenario;
    Snake s;
    Punto anterior;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        gc = canvas.getGraphicsContext2D();
        escenario = new Escenario(0, 0, canvas.getWidth(), canvas.getHeight());

        escenario.nuevaObstaculo(20);
        escenario.nuevafood(10);
        System.out.println(escenario.food.size());

        numY = (int) escenario.posicionatleatoriaY();
        numX = (int) escenario.posicionAtleatoriaX();

        s = new Snake(new Punto(numX, numY));
        dibujarEscenario();

        int velocidad = 100;
        timeline = new Timeline(new KeyFrame(
                Duration.millis(velocidad), accion -> mover()
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

    private void dibujarEscenario() {

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(Color.BLACK);

        gc.setFill(Color.BLACK);
        gc.fillRect(numX, numY, 10, 10);

        dibujarObstaculos();

        dibujarFood();
        dibujarSnake();
    }

    void mover() {
        color();
        int paso = 3;

        comerFood();
        System.out.println(Snake.cuerpo.size());
        boolean todoComido = escenario.food.stream().allMatch(p -> p.comido == true);
        anterior = new Punto(numX, numY);

        // dibujarSnake();
        dibujarEscenario();
        if (todoComido) {
            timeline.stop();
            popUp("Has Ganado!!!");
        } else {
            if (!escenario.puntoDentro(new Punto(numX, numY))) {
                if (!escenario.choqueObs(new Punto(numX, numY))) {

                    System.out.println("numx" + numX);
                    System.out.println("numY" + numY);
                    if (arriba) {
                        gc.setFill(Color.BLACK);
                        numY -= paso;
                        gc.fillRect(numX, numY, 10, 10);
                    } else if (abajo) {
                        gc.setFill(Color.BLACK);
                        numY += paso;
                        gc.fillRect(numX, numY, 10, 10);

                    } else if (derecha) {
                        gc.setFill(Color.BLACK);
                        numX += paso;
                        gc.fillRect(numX, numY, 10, 10);
                    } else if (izquierda) {
                        gc.setFill(Color.BLACK);
                        numX -= paso;
                        gc.fillRect(numX, numY, 10, 10);
                    }
                    // autocolision();
                } else {
                    timeline.stop();

                    popUp("ha chocado!");
                }
            } else {
                timeline.stop();

                popUp("has perdido , salio del escenario!");

            }
        }

    }

    public void popUp(String res) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, res);
        alert.show();

    }

    @FXML
    private void ejecutar(MouseEvent event) {
        if (timeline.getStatus() == Timeline.Status.RUNNING) {
            timeline.stop();
        } else {
            timeline.play();
        }
        arriba = true;
    }

    public void comerFood() {

        escenario.food.stream().anyMatch(p -> {
            boolean res = false;
            if (escenario.choque(p.posicion, numX, numY) < 30) {

                p.comido = true;
                System.out.println("sout de p" + p);
                s.agrandarSnake(Snake.cuerpo.size());
                res = true;
            }
            return res;

        });

    }
    int color1;
    int color2;
    int color3;

    public void color() {
     
        if (color1 < 255) {
            color1 = color1 + 2;
                 
        } else if (color2 < 255) {
            color2 = color2 + 2;

        } else if (color3 < 255) {
            color3 = color3 + 2;
        }
           if (color1 > 255) {
            color1 = 0;
        } else if (color1 > 255) {
            color2 = 0;
        } else if (color3 > 255) {
            color3 = 0;
        }

        System.out.println("color 1" + color1);
        System.out.println("color 2" + color2);
        System.out.println("color 3" + color3);

    }

    public void autocolision() {
        for (Snake snake : Snake.cuerpo) {

            if (escenario.choque(snake.puntosMov, snake.cuerpo.get(0).puntosMov.x, snake.cuerpo.get(0).puntosMov.y) < 10) {
                popUp("AUTOCOLISION!");

            }
        }
    }

    public void dibujarSnake() {

        if (!Snake.cuerpo.isEmpty()) {
            s.moverSnake(anterior);
            for (Snake p : Snake.cuerpo) {
                gc.setFill(Color.rgb(color1, color2, color3));

                gc.fillRect(p.puntosMov.x, p.puntosMov.y, 10, 10);
            }

        }

    }

    public void dibujarFood() {

        for (Food comida : escenario.food) {

            if (comida.comido == false) {
                gc.setFill(Color.BLUE);
                gc.fillOval(comida.posicion.x, comida.posicion.y, 10, 10);
            } else {

            }

        }

    }

    public void dibujarObstaculos() {

        for (Punto o : escenario.puntosObstaculo) {
            gc.setFill(Color.RED);
            gc.fillRect(o.x, o.y, 50, 20);
        }
    }

    public void canvasArriba(int num) {

        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        dibujarFood();
        dibujarObstaculos();
        gc.setFill(Color.BLACK);
        numY -= num;

        gc.fillRect(numX, numY, 10, 10);
        comerFood();

    }

    public void canvasAbajo(int num) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        dibujarFood();
        dibujarObstaculos();
        gc.setFill(Color.BLACK);
        numY += num;

        gc.fillRect(numX, numY, 10, 10);
        comerFood();

    }

    public void canvasDerecha(int num) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        dibujarFood();
        dibujarObstaculos();
        gc.setFill(Color.BLACK);
        numX += num;

        gc.fillRect(numX, numY, 10, 10);
        comerFood();

    }

    public void canvasIzquierda(int num) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.BURLYWOOD);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

        dibujarFood();
        dibujarObstaculos();
        gc.setFill(Color.BLACK);
        numX -= num;

        gc.fillRect(numX, numY, 10, 10);
        comerFood();

    }

    boolean derecha;
    boolean izquierda;
    boolean arriba;
    boolean abajo;

    @FXML
    private void mover(KeyEvent event) {

        KeyCode kc = event.getCode();

        System.out.println(anterior);

        switch (kc) {

            case W:

            case UP:

                timeline.stop();
                canvasArriba(3);
                abajo = false;
                izquierda = false;
                derecha = false;
                arriba = true;
                timeline.play();
                break;
            case S:
            case DOWN:
                timeline.stop();
                canvasAbajo(3);
                abajo = true;
                izquierda = false;
                derecha = false;
                arriba = false;
                timeline.play();
                break;
            case A:
            case LEFT:
                timeline.stop();
                canvasIzquierda(3);
                abajo = false;
                izquierda = true;
                derecha = false;
                arriba = false;
                timeline.play();
                break;
            case D:
            case RIGHT:
                timeline.stop();
                canvasDerecha(3);
                abajo = false;
                izquierda = false;
                derecha = true;
                arriba = false;
                timeline.play();
                break;
            default:
                String letra = kc.getName();

        }

    }

}
