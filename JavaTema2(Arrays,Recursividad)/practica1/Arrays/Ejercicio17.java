/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Crear un programa que reproduzca el algoritmo anterior
        */
        
        
     
        int unarray[];
        unarray = tomaDeDatos();
        mostrarArray(unarray);
        System.out.println("");
        System.out.println("el array ordenado : " + Arrays.toString(ordenarArray(unarray)));

    }

    static int[] ordenarArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                    
                }
                
            }
            
        }
        return array;

       

    }

    static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.print(array1[array1.length - 1] + " ]");
    }

    static int[] tomaDeDatos() {
        System.out.println("Que cantidad de numeros para el array?");
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
    
}
