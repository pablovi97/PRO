/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica37bucle;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica37Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDinero = 0;

        int dinero = 0;
        for (int i = 100; i > 1; i /= 10) {
            for (int j = 5; j >= 1; j /= 2) {

                System.out.println("Cuantos billetes de: " + i * j);
                dinero = sc.nextInt();

                totalDinero += dinero * i * j;

            }
            
           }
        System.out.println("cuantos billetes de 5");
        dinero = sc.nextInt();
        totalDinero += dinero;
        System.out.println(totalDinero);    
    }//Faltan las monedas
}