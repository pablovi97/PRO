/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadadicional5;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class ActividadAdicional5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Calcular las medias introducidas por usuarios
        y que pare cuando se meta una nota negativa
         */
        Scanner sc = new Scanner(System.in);
        int nota;
        int i = 0;
        int acumulador = 0;
       
        for (nota = 0; nota >= 0; i++) {

            acumulador += nota;
           
            System.out.print("introduce una nota ");
            nota = sc.nextInt();
        }
        acumulador -= nota;
      
        double media = acumulador / i;
        System.out.println(media);

    }

}
