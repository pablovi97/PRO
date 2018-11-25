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
public class Practica9 {

    public static void main(String[] args) {
        /*
        Crear un programa que guarde en un array 10 números aleatorios entre 1 y 99
que sean pares. Luego mostrar en pantalla los 10 números, así como el máximo y el mínimo
de esos 10 números y las respectivas posiciones que ocupan en el array
         */

        Scanner sc = new Scanner(System.in);
        int size = 10;
        int array[] = new int[size];
        Random rnd = new Random();
int max = -1 ,posMax = 0,min = 101,posMin = 0;
        for (int i = 0; i < array.length;) {
            int dato = rnd.nextInt(99) + 1;
            /*
            ***OTRO METODO***
             int dato = (rnd.nextInt(49)+1)* 2;
            array[i]=dato;
             */
            if (dato % 2 == 0) {
                array[i] = dato;
                i++;
            }
        }
     
        
        for (int i = 0; i < array.length; i++) {
            if(max <array[i]){
                max = array[i];
                posMax = i;
            }if(min >array[i]){
                min = array[i];
                posMin = i;
            }
        }
           mostrarArray(array);
           System.out.println("max "+max+" posMax "+posMax);
            System.out.println("min "+min+" posMin "+posMin);
    }

    private static void mostrarArray(int[] array) {

        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println(array[array.length - 1] + " ]");

    }
}
