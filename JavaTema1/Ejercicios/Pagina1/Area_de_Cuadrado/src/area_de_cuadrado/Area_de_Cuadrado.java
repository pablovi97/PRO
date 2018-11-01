/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_de_cuadrado;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Area_de_Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("introduce el lado del cuadrado");
        
          int lado = sc.nextInt();
          
          int area = lado * lado; 
          
          System.out.println(area);
    }
    
}
