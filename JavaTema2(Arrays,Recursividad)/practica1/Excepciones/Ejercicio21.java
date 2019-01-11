/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        /*
        Crear un programa que reciba dos números del usuario. Si el primer número
no es un entero entre 1 y 100 lanzará una excepción que mostrará en pantalla “El número
debe ser un entero entre 1 y 100” 
        */
        Scanner sc = new Scanner (System.in);
        System.out.println("dame un numero entero mayor que 1 y menor que 100");
        int num1 = sc.nextInt();
        
        System.out.println("dame otro numero entero mayor que 1 y menor que 100");
        int num2 = sc.nextInt();
        
        if(num1 >100 || num1 <1){
            throw new Exception("El numero debe ser un entero entre 1 y 100");
        }
        
       
    }
    
}
