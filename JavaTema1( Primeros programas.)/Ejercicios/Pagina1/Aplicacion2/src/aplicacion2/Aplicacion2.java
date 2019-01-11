/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion2;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Aplicacion2 {
/*
    el programa nos pedira dos numeros y haremos una suma
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el primer numero");
         
         int numero1 =sc.nextInt();
         
        System.out.println("introduce del segundo numero");
    
         int numero2 =sc.nextInt(); 
         
         System.out.println("el resultado de la suma es: "+(numero1 + numero2));
    }
    
}
