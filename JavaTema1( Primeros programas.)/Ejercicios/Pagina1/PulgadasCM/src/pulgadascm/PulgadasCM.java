/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulgadascm;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class PulgadasCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        transformar pulgadas a cm una pulgada es = 2.54
        */
           Scanner sc = new Scanner(System.in);
        System.out.println("dime la cantidad de pulgadas: ");
        
         double medida = sc.nextInt();
            final double pulgada = 2.54;
            double resultado = medida * pulgada ;
            System.out.println("el resultado es "+ resultado);
    }
    
}
