/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practic40;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practic40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Escribir un programa que reciba un número entero mayor o igual a 0 y menor
o igual a 999 y muestre cuántas cifras tiene

         */
        
        System.out.println("Dime un numero entero de 0 hasta 999");
        String num = sc.nextLine();
        int j = 0;
       
       for (int i =num.length()-1;i >= 0;i--){

           j++;
            
        }
        System.out.println("este numero tiene "+j+" digitos");
    
    }

}
