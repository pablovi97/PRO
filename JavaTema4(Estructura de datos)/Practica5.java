/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.Scanner;

/**
 *
 * @author pablo viera martin
 */
public class Practica5 {

    public static void main(String[] args) {
        /*
        Práctica 4: Utilizando bucles crear un array de dos dimensiones donde la primera fila haya
un elemento, en la segunda fila 2 elementos, en la tercera fila 3 elementos … Llegar así
hasta 20.

        Práctica 5: Observa la siguiente salida de programa:

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
Siempre el primer y el último elemento de cada fila es 1. Fijémonos ahora en la fila:
1 4 6 4 1
el 4 se obtiene sumando 1 3 que tiene encima.
el 6 se obtiene sumando 3 3 que tiene encima.
Si nos fijamos todos los elementos intermedios se generan así:
array[i][j] = array[i-1][j-1] + array[i-1][j]
Utiliza el array que creaste en la práctica anterior para rellenarlo y posteriormente mostrarlo
en pantalla de la forma que acabamos de describir
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("dame la n");
        int n = sc.nextInt();
        System.out.println("dame la m");
        int m = sc.nextInt();

        int array[][] = trianguloPascal(n);
        mostrarArray(array);
        int n1 = n-1;
        int m1 = m-2;
        System.out.println(array[n1][m1]);

    }

    public static void mostrarArray(int array[][]) {
        int i = 0;
        
            
        
        for (int[] fila : array) {
            System.out.println("");
            for (int dato : fila) {
              
              
                System.out.print( ""+  dato );

            }
            System.out.println("");
        }
        
    }

    public static int[][] trianguloPascal(int size) {
        int[][] array = new int[size][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
            array[i][0] = 1;
            array[i][array[i].length - 1] = 1;
            for (int j = 1; j < array[i].length - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }

        }
        return array;
    }

}
