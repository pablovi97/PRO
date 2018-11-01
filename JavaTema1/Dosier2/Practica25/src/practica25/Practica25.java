/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica25;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que le pida al usuario que introduzca una letra y por
medio de una estructura switch, evitando el mayor número de sentencias break posibles ,
muestre en pantalla el mensaje: “es una vocal” cuando el usuario haya introducido una
vocal ( ya sea minúscula o mayúscula ) y el mensaje: “no es una vocal” si no lo fuera.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una letra");
        String palabra = sc.nextLine();
        palabra =palabra.toLowerCase();
        char c = palabra.charAt(0);
        switch (palabra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case  "I":
            case "O":
            case "U":
                System.out.println("es una vocal");
                break;
            default:
                System.out.println("no es vocal");
                
        }

    }

}
