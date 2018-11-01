/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que el usuario vaya introduciendo números enteros. El
programa finaliza cuando el usuario introduce el número 0. En ese momento se le muestra
la suma total de los números positivos y la suma total de los números negativos
         */

        Scanner sc = new Scanner(System.in);

        int sumaPositiva = 0;
        int sumaNegativa = 0;


        int num = 1;
        while (num != 0) {
              System.out.println("introduce un numero entero");
            num = sc.nextInt();
          
            if (num > 0) {
                sumaPositiva += num;
            } else {
                sumaNegativa += num;
            }

        }
        System.out.println("la suma de numeros positivos es " + sumaPositiva);
        System.out.println("la suma de numeros positivos es " + sumaNegativa);
    }
}
