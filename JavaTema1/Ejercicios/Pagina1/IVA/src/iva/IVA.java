/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iva;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class IVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Calcular el IVA del precio de un producto
        
        */
            Scanner sc = new Scanner(System.in);
        System.out.println("dime el precio del producto: ");
        
          int precio = sc.nextInt();
          
          final double IVA = 0.16;
          double resultado = precio * IVA ;
          System.out.println("el  iva es: "+ resultado);
          System.out.println("el precio con iva es: "+(precio + resultado) );
          
    }
    
}
