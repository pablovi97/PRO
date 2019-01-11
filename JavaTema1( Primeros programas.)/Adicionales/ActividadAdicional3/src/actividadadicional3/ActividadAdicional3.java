/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadadicional3;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class ActividadAdicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("dame el numero de patas");
        Scanner sc = new Scanner(System.in);

        int patas = sc.nextInt();
        int aleatorio = (int) (Math.random() * (90 - 65) + 65);

        char c1 = (char) aleatorio;
        aleatorio = (int) (Math.random() * (90 - 65) + 65);
        char c2 = (char) aleatorio;
        aleatorio = (int) (Math.random() * (90 - 65) + 65);
        char c3 = (char) aleatorio;
        aleatorio = (int) (Math.random() * (90 - 65) + 65);
        char c4 = (char) aleatorio;
        aleatorio = (int) (Math.random() * (90 - 65) + 65);
        char c5 = (char) aleatorio;
      
        String palabra = ""+c1+c2+c3+c4+c5;
        
        switch (palabra) {

           
        }

    }

}
