/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que se emule un juego de lanzar 3 dados. En cada
iteración se muestra el resultado sacado en cada uno de los dados y cuánto es el acumulado
de esa tirada de 3 dados. Cuando el usuario pulse en “f” o “F” el programa finaliza ymuestra el acumulado de puntos de sumar todas las tiradas y el número de tiradas
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(6); //genera un aleatorio desde 0 hasta 5
         */
        Scanner sc = new Scanner(System.in);
        int dado1 = 0;
        int dado2 = 0;
        int dado3 = 0;
        int suma = 0;
        String letra = "k";
        int i = 0;
        while (!"f".equals(letra)) {

            dado1 = (int) (Math.random() * (7 - 1) + 1);
            System.out.println(dado1);
            dado2 = (int) (Math.random() * (7 - 1) + 1);
            System.out.println(dado2);
            dado3 = (int) (Math.random() * (7 - 1) + 1);
            System.out.println(dado3);
            suma = (dado1 + dado2 + dado3 + suma);
            System.out.println("escribe una letra ");

            letra = sc.next().toLowerCase();
            i++;

        }

        System.out.println(suma + " esta en la iteracion " + i);
    }

}
