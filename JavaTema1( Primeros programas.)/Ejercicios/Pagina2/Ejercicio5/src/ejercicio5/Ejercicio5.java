/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
     //El número de combinaciones que podemos formar tomando m elementos de un conjunto con n elementos es: C(m,n) = n! / (n \u2212 m)!m! . 
//Diseña un algoritmo que pida el valor de n y m y calcule Cm n .
//(Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes comprobar la validez 
//de tu programa introduciendo los valores n = 15 y m = 10: el resultado es 3003.)

         */

        System.out.println("dime el primer numero");
        int n = sc.nextInt();
        System.out.println("dime el segundo numero");
        int m = sc.nextInt();

        int g = 1;
        int j = 1;
        if (n > 0) {
            for (int i = n; i == 1; i -= 1) {

                g *= i;

            }
            System.out.println(g);

        } else if (n == 0) {
            System.out.println(1);
        }
        if (m > 0) {
            for (int i = m; i == 1; i -= 1) {

                j*= i;

            }
            System.out.println(j);

        } else if (m == 0) {
            System.out.println(1);
        }
        
        
        int combinacion =g/(g-j)/(g-j)*j;
        System.out.println(combinacion);
    }
}
