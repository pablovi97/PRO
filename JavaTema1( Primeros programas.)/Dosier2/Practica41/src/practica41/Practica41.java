/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica41;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Escribir un programa que el usuario escriba una cadena de texto y se le
muestre el texto al revés. Ej “cabello” mostraría: “ollebac”
Nota: “cabello”.substring(2,3) devuelve: “b” que es la tercera letra de ese texto.
         */
        System.out.println("Escribe un texto");
        String text = sc.nextLine();
        String resultado = "";
        for (int i = 0; i < text.length(); i++) {

            String letra = text.substring(i, i + 1);
            resultado = letra + resultado;

        }

        System.out.println(resultado);
    }

}
