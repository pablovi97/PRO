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
public class Punto {

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
  public String toString() {
       return "x=" + x + ", y=" + y ;
   }
    double x;
    double y;
    
    
   public void copiarPosicion(Punto v){

         this.x = v.x;

         this.y = v.y;

     }
}
