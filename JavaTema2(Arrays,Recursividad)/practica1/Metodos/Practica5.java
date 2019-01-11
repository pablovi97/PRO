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
public class Practica5 {

    public static void main(String[] args) {
        /*
        Crear un método llamado factorial() que obtenga el factorial de un número.
Hacer uso de él en un programa que el usuario introduzca por teclado un número y se le
muestre el factorial de ese número
         */
 /*
        Crear un método llamado combinacion() que se le pasen dos números y
obtenga la combinación de esos dos números. Este método debe hacer uso del método
factorial creado en la práctica anterior. La fórmula de la combinación es:
combinacion(n,r) = factorial(n) / ( factorial(n-r) * factorial(r))
         */
        Scanner sc = new Scanner(System.in);
        //System.out.println("Escribe un numero para su factorial");
        //int num =  sc.nextInt();
        System.out.println("Escribe num1");
         int num1 = sc.nextInt();
        System.out.println("Escribe num2");
         int num2 = sc.nextInt();
         
         //System.out.println(factorial(num));
        System.out.println( combinacion(num1,num2)); 
        
        System.out.println("enum para julio" +Mes.Julio);
    }

    public static double factorial(int num) {
        int n = 1;

        if (num > 0) {
            for (int i = num; i >= 1; i--) {
                n *= i;
            }
            return n;

        }
        return 0;
    }
    public static double combinacion(int num1 ,int num2){
        double comb = factorial(num1)/(factorial(num1-num2)*factorial(num2));
        return comb;
    }
       public enum Mes{
            Enero,
            Febrero,
            Marzo,
            Abril,
            Mayo,
            Junio,
            Julio,
            Agosto,
            Septiembre,
            Octubre,
            Noviembre,
            Diciembre
            
        }
}
