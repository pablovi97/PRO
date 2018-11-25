/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica8 {

    public static void main(String[] args) {
        /*
        Crear un programa que, mediante un bucle, guarde 10 números en un array
introducidos por el usuario. Luego, también con un bucle, muestre cada uno de esos
números y el índice que le corresponde en el array
         */

        
        int array[];
         array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero para el array "+i);
            array[i] = sc.nextInt();
        }
        System.out.println("Los numero que has introducido son : ");
        mostrarArray(array);
        mostrarArrayConIndice(array);
    }

    private static void mostrarArray(int[] array) {

        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println(array[array.length - 1] + " ]");

    }
    public static void mostrarArrayConIndice(int[] array){
        System.out.println("INDICE DE LOS ARRAYS:");
        for (int i = 0; i < 10; i++) {
            System.out.println("array["+i+"]:"+array[i]+" ,");
        }
    
}
}
