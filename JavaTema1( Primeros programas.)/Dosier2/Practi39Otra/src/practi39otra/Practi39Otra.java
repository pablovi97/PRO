/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practi39otra;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practi39Otra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cociente = num;
        int resto;
        int nuevoNumero = 0;
        do {

            resto = cociente % 10;
            cociente /= 10;
            nuevoNumero = nuevoNumero * 10 + resto;

        } while (cociente != 0);
        System.out.println(nuevoNumero);
    }

}
