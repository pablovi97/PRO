/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      /*
        Realizar un programa que sirva para convertir grados Farenheit en centígrados
El usuario introducirá los grados Farenheit y se le mostrará la equivalencia en centígrados.
La fórmula es:.
C = ( F – 32 ) * 5/9
donde C es grados centígrados y F es Farenheit
        */
      
      
        System.out.println("dime grados farenheit");
        
        double farenheit = sc.nextDouble();
        double cent = (farenheit -32)*5/9;
        System.out.println(cent);
             
                }
    
}
