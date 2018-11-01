/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadadicional2;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class ActividadAdicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        A el usuario se le va a preguntar "dime de cuantas patas quieres el animal?"
        si ha puesto dos patas =  "Gallina o persona"
        Si ha puesto cero = "Es una serpente"
        Si ha puesto mas de 100 = "es un ciempies"
        Si ha puesto un = "Es un caracol"
       
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas patas tiene el animal?");
        int patas = sc.nextInt();

        if (patas == 0) {
            System.out.println("es una serpiente");
        } else if (patas == 1) {
            System.out.println("Es un caracol");
        } else if (patas == 2) {
            System.out.println("Gallina o persona");

        } else if (patas == 4) {
            System.out.println("es un perro o un gato ");
        } else if (patas > 100) {
            System.out.println("es un ciempies");
        } else {
            System.out.println("no hay un animal asi");
        }

    }
}
