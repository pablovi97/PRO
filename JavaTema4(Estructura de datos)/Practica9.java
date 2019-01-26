/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
public class Practica9 {

    public static void main(String[] args) {
        /*
        Práctica 9: Hacer un programa que el usuario introduzca un texto por teclado y mediante
expresiones regulares se determine si es un número válido. Observa que esto significa que
debe empezar por una cifra o por los símbolos +- Que después aparezcan cifras y sólo
cifras salvo la coma: “,” la cuál nos serviría para delimitar los decimales.
Hacer dos versiones, en la primera debe haber una coincidencia completa en el String que el
usuario nos pase, en la segunda basta con que lo primero que muestre la cadena sea un
número válido aunque después aparezca más texto.

         */
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);

        String Texto = sc.nextLine();

        Pattern p = Pattern.compile("([0-9]|[+-]){1,}[,]?[0-9]*");

        Matcher m = p.matcher(Texto);

        System.out.println("PARTE 1");
        if (m.matches()) {
            System.out.println("es correcto");

        } else {
            System.out.println("no es correcto");
        }
        System.out.println("PARTE2");
        if (m.find()) {
            System.out.println("es correcto");

        } else {
            System.out.println("no es correcto");
        }
    }

}
