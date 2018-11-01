/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculomedia;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class CalculoMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        int i = 0;
        int sumaNota = 0;
        int notaMayor = 0;
        int notaMenor = 10;

        do {
            System.out.println("Introduce una nota");
            nota = sc.nextInt();

            if (nota < 10 && nota >= 0) {
                if (nota < notaMenor) {
                    notaMenor = nota;
                } else if (nota > notaMayor) {
                    notaMayor = nota;
                }
                sumaNota = sumaNota + nota;
                i++;

            } else {
                System.out.println("introduce una nota valida");
            }

        } while (nota != -1);
        if (i > 3) {
            int notaCont = sumaNota - (notaMenor + notaMayor);
            int nuevoI = i - 2;
            int notaMedia = notaCont / nuevoI;
            System.out.println("la nota media es " + notaMedia);

        } else {
            System.out.println("Tienes que meter mas de 3 notas ");
        }
    }

}
