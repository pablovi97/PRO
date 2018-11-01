/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica32;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*
        Hacer un programa que reciba dos números enteros positivos del usuario y
muestre la suma de todos los números que hay entre esos dos números.
Ej. Usuario introduce: 10, 5 entonces la secuencia de números es:
5,6,7,8,9,10
y la suma de esos números es:
45
Hacer uso de un bucle for para este programa
        */
        System.out.println("Dame un numero entero positivo");
        int num1 = sc.nextInt();
        System.out.println("Dame un numero entero positivo");
        int num2 = sc.nextInt();
        int suma = 0;
        if(num1<num2 && num1 >0){
            for(int i=num1;i<=num2;i++){
                System.out.println("Los numeros que hay en medio son "+i);
                suma+=i;
                
                
                
            }
            System.out.println("La suma de todos los numeros es "+suma);
        }else if(num1>num2 && num2 >0){
             for(int i=num2;i<=num1;i++){
                System.out.println("Los numeros que hay en medio son "+i);
                suma+=i;
                
                
                
            }
            System.out.println("La suma de todos los numeros es "+suma);
        }
    }
    
}
