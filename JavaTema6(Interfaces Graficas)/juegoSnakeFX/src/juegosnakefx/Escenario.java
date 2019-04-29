/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosnakefx;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Random;

/**
 *
 * @author pablo
 */
public class Escenario {

    public Escenario(int x1, int y1, double x2, double y2) {
        psup = new Punto(x1, y1);
        pinf = new Punto(x2, y2);

        puntosObstaculo = new ArrayList<>();
        puntosSnake = new ArrayList<>();

        // food = new HashMap<>();
        food = new ArrayList<>();

    }
    int x1;
    int y1;
    int x2;
    int y2;
    Punto psup;
    Punto pinf;
    double atleatorioSnakex;
    double atleatorioSnakey;
    // double posx = atleatorioSnakex;
    double posy = atleatorioSnakey;
    ArrayList<Punto> puntosObstaculo;
    ArrayList<Punto> puntosSnake;

    // HashMap<Punto, Boolean> food;
    ArrayList<Food> food;

    public void nuevafood(int num) {
        System.out.println("comida:");
        Random rnd = new Random();
        boolean bool = false;

        for (int i = 0; i < num; i++) {

            puntosObstaculo.stream().anyMatch(punto -> {
                double x = rnd.nextInt((int) pinf.x - 10);
                double y = rnd.nextInt((int) pinf.y - 10);
                if (!choqueObs(new Punto(x, y))) {
                    food.add(new Food(x, y));

                } else {

                    do {

                        x = rnd.nextInt((int) pinf.x - 10);
                        y = rnd.nextInt((int) pinf.y - 10);
                    } while (choqueObs(new Punto(x, y)));
                    food.add(new Food(x, y));

                }
                return true;
            });

        }
    }

    public void nuevaObstaculo(int num) {
        System.out.println("obstaculos");
        Random rnd = new Random();
        boolean bool = false;
        for (int i = 0; i < num; i++) {
            double x = rnd.nextInt((int) pinf.x - 30);
            double y = rnd.nextInt((int) pinf.y - 30);
            if (!puntoDentro(new Punto(x, y))) {
                puntosObstaculo.add(new Punto(x, y));
                System.out.println(" crea bien obstaculos");
                System.out.println("x" + x);
                System.out.println("y" + y);
            } else {
                do {
                    x = rnd.nextInt((int) pinf.x - 30);
                    y = rnd.nextInt((int) pinf.y - 30);
                } while (puntoDentro(new Punto(x, y)));
                puntosObstaculo.add(new Punto(x, y));
            }

        }
    }

    public double posicionAtleatoriaX() {

        Random rnd = new Random();

        atleatorioSnakex = rnd.nextInt((int) pinf.x - 10);
        return atleatorioSnakex;

    }

    public void aumentartamañoSnake() {
        posy += 4;
        puntosSnake.add(new Punto(0, posy));

    }

    public double posicionatleatoriaY() {

        Random rnd = new Random();
        atleatorioSnakey = rnd.nextInt((int) pinf.y - 10);
        return atleatorioSnakey;
    }

    public Punto posAtleatoria() {

        Random rnd = new Random();
        Punto res;

        double x = rnd.nextInt((int) pinf.x - 30);
        double y = rnd.nextInt((int) pinf.y - 30);
        if (!puntoDentro(new Punto(x, y))) {
            res = new Punto(x, y);

        } else {
            do {
                x = rnd.nextInt((int) pinf.x - 30);
                y = rnd.nextInt((int) pinf.y - 30);
            } while (puntoDentro(new Punto(x, y)));
            res = new Punto(x, y);
        }
        return res;

    }

    public boolean puntoDentro(Punto p) {
        boolean res = false;

        if (this.psup.x > p.x) {
            res = true;
        } else if (this.psup.y > p.y) {
            res = true;

        } else if (this.pinf.x < p.x) {
            res = true;
        } else if (this.pinf.y < p.y) {
            res = true;
        } else {

        }

        return res;
    }

    public double choque(Punto p, double x, double y) {
        double res = 0;

        res = Math.sqrt((x - p.x) * (x - p.x)
                + (y - p.y) * (y - p.y));

        return res;
    }

    /*
    public boolean choqueObstaculos(Punto snake){
        
       
       boolean res = puntosObstaculo.stream().anyMatch(p->Math.sqrt((snake.x - p.x) * (snake.x - p.x)
                + (snake.y - p.y) * (snake.y - p.y)) <10 );
 
return res;
    }
     */
    public boolean choqueObs(Punto snake) {

        boolean res = false;
        for (Punto punto : puntosObstaculo) {
            if (snake.x > punto.x - 10 && snake.x < punto.x + 52 && snake.y > punto.y - 10 && snake.y < punto.y + 22) {
                res = true;
            }
        }

        return res;
    }
}
