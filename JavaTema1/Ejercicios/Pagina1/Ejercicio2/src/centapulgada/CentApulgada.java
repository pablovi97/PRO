/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centapulgada;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class CentApulgada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que sirva para convertir pulgadas a centímetros.
	Recuerda que 1 pulgada = 2.54 centímetros).
        */
         final double  pulgada ;
        pulgada = 2.54;
        Scanner sc = new Scanner(System.in);
        System.out.println("dime las pulgadas para transformarlas a cm");
        double medida = sc.nextInt();
        
        double resultado = medida * pulgada;
        System.out.println("el resultado es "+resultado+ "cm");
        
      
        
    }
    
}
