/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.adicional;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class ActividadAdicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Hacer un programa en el que el usuario introduce un numero
        si el numero esta entre [0,10] mostrar "es menor que 10"
        
        si esta entre [10,15] "esta entre 10 y 15"
        
        si el numero es mayor o igual a 15 mostrar "el numero es mayor o igual a 15"
        
         */
        System.out.println("Dime un numero:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error¡¡ has puesto un numero negativo");
        }else if (num < 10) {
                System.out.println(num + " es menor que 10");

        }else if (num < 15) {//"esta entre 10 y 15"
                    System.out.println(num + " esta entre 10 y 15");

        }else { //Caso mayor o igual que 15

                    System.out.println(num + " es mayor o igual a 15");

                }
            
        
    }

}
