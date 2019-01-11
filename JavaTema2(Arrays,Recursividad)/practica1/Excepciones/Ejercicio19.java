/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        /*
        Crear un programa que incluya el código anterior e introducir texto en lugar
de un número cuando el programa lo solicite ¿ qué ocurre, hay un error ? Si es así ¿ cuál es
el tipo de error/excepción que se desencandena ? ( tomar captura de pantalla del error y
escribir el tipo de la excepción que se pudiera generar de haberla )

         */
        System.out.println("Introducir un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = 0, division = 0;
        try{
        numero = sc.nextInt();
        division = 5 / numero;
        System.out.println("El número introducido es: " + numero
                + " y la división de 5/" + numero + " da: " + division);
         }catch(InputMismatchException ex){
              
                System.out.println("introduce un numero no una letra");
         }
    }

}
