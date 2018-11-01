/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadadicional6;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class ActividadAdicional6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Cuanto dienro tienes y que te lo descompoga en billetes 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto dinero tienes?");
        int cantidad = sc.nextInt();
        int k = 0;
        int v = 0;
        int l = 0;
        int f = 0;
        int g = 0;

        for (int i = 100; i >= 1; i /= 10) {
            for (int j = 5; j >= 1; j /= 2) {
                while (cantidad >= 500) {

                    k++;
                    cantidad = cantidad - j * i;

                }
                while (cantidad >= 200 && cantidad < 500) {

                    v++;
                    cantidad = cantidad - j * i;

                }
                while (cantidad >= 100 && cantidad < 200) {

                    l++;
                    cantidad = cantidad - j * i;

                }

                while (cantidad >= 50 && cantidad < 100) {

                    f++;
                    cantidad = cantidad - j * i;

                }

                while (cantidad >= 20 && cantidad < 50) {

                    g++;
                    cantidad = cantidad - j * i;

                }

            }

        }
        System.out.println("hacen falta " + k + " billetes de 500");
        System.out.println("hacen falta " + v + " billetes de 200");
        System.out.println("hacen falta " + l + " billetes de 100");
        System.out.println("hacen falta " + f + " billetes de 50");
        System.out.println("hacen falta " + g + " billetes de 20");

    }

}
