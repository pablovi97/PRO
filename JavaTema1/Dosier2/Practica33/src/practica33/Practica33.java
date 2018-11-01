/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica33;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Se pretende imitar el comportamiento de un sistema de control por pin. El
usuario tiene 3 intentos para acertar con el pin, cada vez de esos tres intentos que falle se le
informa y se le dice el número de intentos que le queda. Si acierta se le muestra un mensaje
que diga: “El código es correcto. Bienvenido” Si no acierta en los tres intentos el programa
termina
Hacer 3 versiones de este código una con while, otra con do while y finalmente for
         */

        Random rand = new Random();
        int randomNum = rand.nextInt((99 - 1) + 1) + 1;
        System.out.println("Con que bucle quieres haerlo? 1(While),2(do while,3(for))");
        int numBucle = sc.nextInt();

        int i = 0;
        int num = 0;
        int g = 0;
        switch (numBucle) {
            case 1:
                while (g >= 3 || num == randomNum) {
                    System.out.println("Introduce un numero pin");
                    num = sc.nextInt();
                    g++;
                }
                if (num == randomNum) {
                    System.out.println("El codigo es correcto Bienbenido!!!");
                } else {
                    System.out.println("no has puesto el numero correcto y has superado los intentos");
                }
                break;
            case 2:
                do {
                    System.out.println("Introduce un numero pin");
                    num = sc.nextInt();
                    i++;
                } while (num != randomNum || i != 3);
                if (num == randomNum) {
                    System.out.println("El codigo es correcto Bienbenido!!!");
                } else {
                    System.out.println("no has puesto el numero correcto y has superado los intentos");
                }
                break;
            case 3:
                for (int j = 1; j <= 3 || num == randomNum; j++) {
                    System.out.println("Introduce un numero pin");
                    num = sc.nextInt();
                }
                if (num == randomNum) {
                    System.out.println("El codigo es correcto Bienbenido!!!");
                } else {
                    System.out.println("no has puesto el numero correcto y has superado los intentos");
                }
                break;
            default:
                break;
        }
    }
}
