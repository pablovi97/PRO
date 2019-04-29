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
public class Obstaculo {
    
 protected Punto posicion;

    protected Escenario escenario;
    public Obstaculo( Escenario escenario, double x, double y ){
         this.posicion = new Punto(x, y);
         //ArrayList de puntos 
        this.escenario = escenario;
        
    }
}
