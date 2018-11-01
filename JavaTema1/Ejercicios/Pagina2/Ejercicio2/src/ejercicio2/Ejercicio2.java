/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Implementa un algoritmo que muestre todos los múltiplos de n entre n y m·n, ambos inclusive, donde n y m son números introducidos por el usuario.
	
        */
            Scanner sc = new Scanner (System.in);
        System.out.println("introduce el valor de n");
        int n =sc.nextInt();
        System.out.println("introduce el valor de m");
        int  m = sc.nextInt();
        
        
            for(int i=n;i<=n*m;i+=n){
            System.out.println(i);
        }    
    }
    
}
