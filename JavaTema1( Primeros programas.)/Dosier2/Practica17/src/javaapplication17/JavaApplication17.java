/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
      /*
        Crea un programa que calcule el IGIC (7%) de un producto dado su precio de
venta sin IGIC que introduzca el usuario por teclado.
        */
      
        System.out.println("dame la base del rectangulo");
        double precio =sc.nextInt();
        
        
     double igic = (precio * 7)/100;
     
     
     System.out.println("precio final con impuestos="+(igic + precio));
    }
    
}
