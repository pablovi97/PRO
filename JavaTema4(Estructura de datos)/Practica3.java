/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica3 {
    public static void main(String[] args) {
        /*
        Práctica 3: Se introducirá por teclado las dimensiones de una matriz ( la cantidad de filas y
la de columnas ) esa matriz se rellenará con números aleatorios enteros desde 1 a 99
inclusives. Calcular el valor medio de cada fila de la matriz y mostrarlo en pantalla
especificando a que fila corresponde cada media
        */
        
        Scanner sc = new Scanner (System.in);
       Random rand = new Random();
        System.out.println("introduce la dimension de las filas");
        int fila = sc.nextInt();
        System.out.println("introduce las dimensiones de las columnas");
        int columnas = sc.nextInt();
        
        int [][] array= new int [fila][columnas];
        
        for (int i = 0; i < array.length; i++) {
            int [] filas = array[i];
          
            for (int j = 0; j < filas.length; j++) {
               filas[j] = rand.nextInt((99 - 1) + 1) + 1;
          
            }
            System.out.println("fila "+ i + " la media es "+ media(filas) );
           
        }
        mostrarArray(array);
        
             
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
      static double media (int array[]){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;
        return media;
     }
    
}
