/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class ordenarNumero2 {

    static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1] + " ]");
    }

    static int[] tomaDeDatos(int size, int limiteInf, int limiteSup) {
        Scanner sc = new Scanner(System.in);
        int array[];

        array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(limiteSup - limiteInf +1) + limiteInf;

        }
        return array;
    }

    public static int buscarMaximo(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        return max;
    }

    public static void ordenarArray(int array[]) {
        int maximo = buscarMaximo(array);
        int auxiliar[] = new int[maximo + 1];
        for (int i = 0; i < array.length; i++) {
            auxiliar[array[i]]++;

        }
        System.out.println("el auxiliar");
        mostrarArray(auxiliar);
        int j = 0;
        for (int i = 0; i < auxiliar.length; i++) {
            while (auxiliar[i] > 0) {
                array[j] = i;
                j++;
                auxiliar[i]--;
            }

        }
    }

    public static void ordenarArray2(int array[]) {
        /*
        tomamos el primeroe elmento del array
        [2,11,5,8,4,9]
        decimos que ese primer elemento es la parte ordenada del array
        [2,   11,5,8,4,9]
        Ahora tomamos el siguiente numero como el que vamos a incorporar al subarray
        ordenado tomamos el 11
        
        Preguntamos ¿ es 11 menor que 2?
        como no lo es lo incluimos directamente en el nuevo subarray ordenado
        [2,11,    5,8,4,9]
        
        
        tomamos el siguiente del grupo desordenado
        que es el 5 y preguntamos ¿ es el 5 menor que el 11?
        si la respuesta es afirmativa los intercambiamos
        [2,5,11,   8,4,9]
        
        volvemos a preguntar por el 5 ¿ es el 5 menor que el 2?
        la respuesta es no asi que no tenemos que ir intercambiando y pasamos al siguiente grupo
        desordenado
        [2,5,8,11  ,4,9]
         */

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
               mostrarArray(array);
            }
        }
    }

    public static void main(String[] args) {
        //Metodo generar array tomaDeDatos(size,randoMinimo,rangoMaximo)
        int atleatorios[] = tomaDeDatos(10, 0, 50);
       //ordenarArray(atleatorios);
       // System.out.println("");
       // mostrarArray(atleatorios);
        ordenarArray2(atleatorios);

    }

}
