/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa para calcular el máximo común divisor ( mcd ) de dos
números enteros recibidos por teclado. Se deberá crear un método llamado mcd que recibe
los dos números y devuelve el máximo común divisor. El método main del programa es:
public static void main(String[] args) {
Scanner cin = new Scanner(System.in);
System.out.println("Cálculo de MCD para dos números");
System.out.print("Número 1: ");
int num1 = cin.nextInt();
System.out.print("Número 2: ");
int num2 = cin.nextInt();
String solucion = "MCD: " + mcd(num1,num2);
System.out.println(solucion);
}
         */
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de MCD para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();
        String solucion = "MCD: " + mcd(num1, num2);
        System.out.println(solucion);
        int  resultado = mcm(num1,num2);
        System.out.println("el MCM es : "+ resultado);
    }

    private static int mcd(int num1, int num2) {
        int resto = 1;
        while (resto != 0) {
            int cociente = (num1 / num2);
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
   static int mcm(int num1, int  num2){
       int res = num1*num2/mcd(num1,num2);
       return res;
   }
        

}
