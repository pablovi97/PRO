/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Pablo Viera Martin .
 */
public class personaHablar {
    public static void main(String[] args) {
          Random rnd = new Random();
          
           int dato = rnd.nextInt(21) + 1;
           System.out.println(dato);
    }
    
}
