/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosnakefx;

/**
 *
 * @author pablo
 */
public class Food {

    protected Punto posicion;
    boolean comido ;


    public Food(double x, double y) {
        this.posicion = new Punto(x, y);
        comido=false;

    }
}
