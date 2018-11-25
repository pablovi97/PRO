/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        /*
        Crear un programa que introduzca 5 números y muestre cuáles son los dos
números más cercanos. Por ej. Si:
14,11,2,10,17 => 11,10
         */
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("introduce un numero para el array " + i);
            array[i] = sc.nextInt();
        }
        mostrarArray(array);
        int distanciaMenor = 10000;

        int ult1 = 0;
        int ult2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int distancia = Math.abs(array[i] - array[j]);

                if (distancia < distanciaMenor ) {
                    distanciaMenor = distancia;
                    ult1 = array[i];
                    ult2 = array[j];
                }

            }

        }

        System.out.println("los numeros mas cercanos son " + ult1 + " y " + ult2 + " con distancia " + distanciaMenor);

    }

    static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1] + " ]");
    }
    

}

