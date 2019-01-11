/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

/**
 *
 * @author pablo
 */
public class Punto {

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto punto) {
        this.x = punto.x;
        this.y = punto.y;

    }
    @Override
     public String toString() {
        return "("+x+","+y+")";
    }
     
     public void equals(){
         if(this.x == this.y){
             System.out.println("es igual");
         }else{
             System.out.println("los puntos no son iguales");
         }
     }
   //  public double modulo(){
        // return this.x^2+this.y^2;
    // }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    double x;
    double y;
}
