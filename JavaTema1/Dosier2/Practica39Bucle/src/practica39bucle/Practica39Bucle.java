/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica39bucle;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica39Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        do{
            
      
        System.out.println("Dame un numero entre 10 y 99");
        num =sc.nextInt();
        if(!(num > 9 && num<100)){
            System.out.println("El numero no es valido");
        }
         }while(!(num > 9 && num<100)); 
        int cifra0 = num % 10;
        int  cifra1 = num /10;
        int nuevoNumero = cifra0*10;
        nuevoNumero +=cifra1;
        System.out.println(nuevoNumero);
    }
    
}
