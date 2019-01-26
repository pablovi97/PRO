/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica2 {

    public static void main(String[] args) {
        /*
        Práctica 2: crear un programa que lea por teclado números enteros y los guarde en una
matriz de 5 filas por 4 columnas. Se deberá buscar el número mayor y el número menor
mostrándolos así como las posiciones que ocupen. Finalmente se mostrará el array
completo (poner un ‘\n’ en los print al final de cada fila del array) recorriéndolo mediante
bucles for-each
         */

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[5][4];

        for (int i = 0; i < array.length; i++) {
            int[] fila = array[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.println("Dame dato " + j + " de fila: " + i);
                fila[j] = sc.nextInt();

            }

        }
        mostrarArray(array);

        maximoMinimo(array);

    }

    public static void maximoMinimo(int array[][]) {

        int mayor = -1;
        int menor = 200000;
        int posXmayor = 0;
        int posYmayor = 0;
        int posXmenor = 0;
        int posYmenor = 0;
        for (int i = 0; i < array.length; i++) {
            int[] fila = array[i];
            for (int j = 0; j < fila.length; j++) {
                if (fila[j] > mayor) {
                    mayor = fila[j];
                    posXmayor = i;
                    posYmayor = j;
                }
                if (fila[j] < menor) {
                    menor = fila[j];
                    posXmenor = i;
                    posYmenor = j;
                }
            }
        }
        System.out.println("pos mayor: (  " + posXmayor + " , " + posYmayor + ") posmenor : (  " + posXmenor + " , " + posYmenor + ")");
    }

    public static void mostrarArray(int array[][]) {
        int i = 0;
        for (int[] fila : array) {

            for (int dato : fila) {
                System.out.print(" " + dato);
            }
            System.out.println("");
        }
    }
}
