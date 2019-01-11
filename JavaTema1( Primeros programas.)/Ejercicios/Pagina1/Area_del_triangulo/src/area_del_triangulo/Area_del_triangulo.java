/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_del_triangulo;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Area_del_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base del triangulo");
        double base = sc.nextInt();
        
        System.out.println("introduce la altura del triangulo");
        double altura = sc.nextInt();
        
        double area = base * altura /2 ;
        System.out.println("el area es: "+ area);
    }
    
}
