/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica26;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escribe un programa que pida por teclado un día de la semana ( ún número
entero del 1 al 5 que representa de lunes a viernes ) y que diga qué asignatura toca a primera
hora ese día.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("dame el dia de la semana");
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();

        switch (palabra) {
            case "lunes":

            case "martes":

            case "viernes":
                System.out.println("PRO");
                break;
            case "jueves":
                System.out.println("ets");
                break;
            case "miercoles":
                System.out.println("CASA");
                break;
            default:
                System.out.println("ese dia no hay clase");
                break;
        }

    }

}
