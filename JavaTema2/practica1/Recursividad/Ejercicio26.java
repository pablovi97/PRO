/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import static practica1.Ejercicio25.sumaArray;
import static practica1.Ejercicio25.tomaDeDatos;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        /*
        Multiplicar todos los elementos de un array mediante recursión
         */
        int array[] = tomaDeDatos();
        System.out.println("la suma de los array es: " + multiplicarArray(0, array));
    }

    public static int[] tomaDeDatos() {
        System.out.println("Que cantidad de numeros para el array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int array[];

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("num" + (i + 1) + ":");
            array[i] = sc.nextInt();

        }
        return array;
    }

    public static int multiplicarArray(int n, int array[]) {

        int resultado = 0;
        if (n >= array.length - 1) {
            resultado = array[n];

        } else {

            resultado = multiplicarArray(n + 1, array) * array[n];

        }

        return resultado;

    }

}
