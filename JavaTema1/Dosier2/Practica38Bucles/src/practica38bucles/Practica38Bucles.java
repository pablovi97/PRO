/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica38bucles;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica38Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
5días 15horas 15minutos 0segundos
         */
        Scanner sc = new Scanner(System.in).useLocale(Locale.CHINA);
        System.out.println("Dame el numero de horas");
        double horasIniciales = sc.nextDouble();

        int divisor = 24;
        double horasRestantes = horasIniciales;
        for (int i = 1; i < 4; i++) {
            int cantidad = (int)(horasRestantes / divisor);
            System.out.println(cantidad + "");
            horasRestantes =horasRestantes - cantidad*divisor;
            switch (i) {

                case 1:
                    System.out.println("dias");
                    break;
                case 3:
                    divisor = 60;
                    
                    
                    System.out.println("minutos");
                    horasRestantes*=divisor;
                    
                    
                    break;
                case 2:
                    divisor = 60;
                    System.out.println("horas");
                    horasRestantes*=divisor;
            }
        }
    }

}
