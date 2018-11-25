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
public class Ejercicio18_2 {

    public static void main(String[] args) {
     /*
        NO ESTA COMPLETO
        */
        int array[] = generarArray(5, 1, 100);
        mostrarArray(array);
        int distancia[];
        int posicionMenor;
         int distanciasActual;
        for (int i = 0; i < array.length; i++) {
                    int iteracion = 0;
             distancia = obtenerDistancia(array, iteracion);
            posicionMenor = menorDistancia(distancia);
            distanciasActual = distancia[posicionMenor];
        
            System.out.println("numeros mas cercanos para esta iteracion ");
            System.out.println(array[iteracion]+" y "+array[posicionMenor]);
            System.out.println("tiene una distancia de "+distanciasActual);
           
        }
    
    }

    static int[] obtenerDistancia(int array[], int posicion) {
        int distancias[] = new int[array.length];
        for (int i = 0; i < distancias.length; i++) {
            int pivote = array[posicion];

            int diferencias = Math.abs(array[i] - pivote);
            distancias[i] = diferencias;

        }
        distancias[posicion] = -1;
        return distancias;
    }
    
    public static int  menorDistancia(int array[]){
        int posicionMenor = 0;
        if (array[posicionMenor] == -1){
            posicionMenor = 1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < array[posicionMenor] && array[i]>=0)
            posicionMenor = i;
        }
        return posicionMenor;
    }

    static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1] + " ]");
    }

    static int[] generarArray(int size, int limiteInf, int limiteSup) {
        Scanner sc = new Scanner(System.in);
        int array[];

        array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(limiteSup - limiteInf + 1) + limiteInf;

        }
        return array;
    }

}
