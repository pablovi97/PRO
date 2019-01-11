/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
números son mayores que la media calculada.
        */
         int array[] = new int[10];
         Random rnd = new Random();
         for (int i = 0; i < 10; i++) {
            array[i] =rnd.nextInt(99)+1;
        }
        double med = media(array);
        System.out.println("la media es "+med);
       
        for (int i = 0; i < array.length; i++) {
            if( array[i] > med){
                System.out.println("el numero "+array[i]+" es mayor que la media");
            }
            
        }
    }
    static double media (int array[]){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;
        return media;
     } 
}

