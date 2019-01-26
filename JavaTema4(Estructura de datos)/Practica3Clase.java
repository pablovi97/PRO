/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.Random;

/**
 *
 * @author Pablo viera martin
 */
public class Practica3Clase {

    public static void main(String[] args) {
        int array[][] = new int[3][];

        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];

        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(99) + 1;

            }
            System.out.println("");
        }
        for (int fila[] : array) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println("");
        }
    }
}
