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
public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Crear un programa que introduzca 10 números por teclado y mostrarlos
ordenados de menor a mayor al finalizar

        */
       int result[] =  ordenarArray(tomaDeDatos());
       
       
       mostrarArray(result);
    }
       static int[] tomaDeDatos(){
      System.out.println("Introduzca 10 numeros ");
      Scanner sc = new Scanner(System.in);
      int size = 10;
      int array[];
        
       array = new int[size];
       for (int i = 0; i < array.length; i++) {
           System.out.println("num"+(i+1)+":");
           array[i] = sc.nextInt();
          
      }
       return array;
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

}
