/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        /*
         sin usar bucles for, while, do while obtener el número menor de un array
         */
        int[] array = {9, 2, 9, 3, 4, 3, 5, 10};

        int res = obtenerMenor(array, 0, array[0]);
        System.out.println("el menor del array es : " + res);

    }

    public static int obtenerMenor(int array[], int n, int min) {

        if (n != array.length - 1) {

            if (array[n] < min) {
                min = obtenerMenor(array, n + 1, array[n]);

            } else {
                min = obtenerMenor(array, n + 1, min);

            }
        }

        return min;

    }

}
