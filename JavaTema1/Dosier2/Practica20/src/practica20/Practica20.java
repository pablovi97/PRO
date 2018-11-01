/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica20;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        /*
        Hacer un programa que se le pase un número entero y que devuelva los
siguientes mensajes:
- Si es impar: “El número: x es impar”
- Si es par: “El número x es par”
Donde x es el número introducido por el usuario
        */
        
        System.out.println("dime un numero entero");
        int num = sc.nextInt();
        
        double resto = (int)num % 2 ; 
        
        if(resto == 0){
            System.out.println(num+" es par");
        }else{
            System.out.println(num+" es impar");
        }
    }
    
}
