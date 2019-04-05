/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class Escenario {

    ArrayList<Coche> car = new ArrayList<>();

    public Escenario(int x1, int y1, int x2, int y2) {
        psup = new Punto(x1, y1);
        pinf = new Punto(x2, y2);
    }
    int x1;
    int y1;
    int x2;
    int y2;
    Punto psup;
    Punto pinf;

    public void agregarcoche(Coche c) {
        car.add(c);
    }

    public double posicionAtleatoriaX() {
        double atleatoriox;

        Random rnd = new Random();
        atleatoriox = rnd.nextInt(600) + 4;
        return atleatoriox;
    }

    public double posicionatleatoriaY() {
        double atleatorioy;
        Random rnd = new Random();
        atleatorioy = rnd.nextInt(350) + (-1);
        return atleatorioy;
    }

    public Punto puntoDentro(Punto p) {
        Punto punto;

        if (this.psup.x > p.x) {
            punto = new Punto(this.psup.x, p.y);
        } else if (this.psup.y > p.y) {
            punto = new Punto(p.x, this.psup.y);

        } else if (this.pinf.x < p.x) {
            punto = new Punto(this.pinf.x, p.y);
        } else if (this.pinf.y < p.y) {
            punto = new Punto(p.x, this.pinf.y);
        } else {
            punto = p;
        }

        return punto;
    }
    

    public double choque(Coche c) {
        double res = 0;
        for (Coche coche : car) {
            if (coche != c) {
                res = Math.sqrt((c.posicion.x - coche.posicion.x) * (c.posicion.x - coche.posicion.x)
                        + (c.posicion.y - coche.posicion.y) * (c.posicion.y - coche.posicion.y));
            }

        }

        return res;
    }

}
