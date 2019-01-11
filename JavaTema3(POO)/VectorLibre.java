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
public class VectorLibre {

    public VectorLibre(int origen, int fin) {
        this.origen = origen;
        this.fin = fin;
    }

    public VectorLibre(int fin) {
        this(0,fin);
        
    }
   
    int origen;
    int fin;
   
}
