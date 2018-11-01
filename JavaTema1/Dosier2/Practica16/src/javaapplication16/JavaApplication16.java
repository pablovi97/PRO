/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       /*
        Cálculo del área de una Finca. La finca es rectangular así que el usuario
introducirá el número de metros de cada lado y se le mostrará el área calculada tanto en
metros cuadrados como en centímetros cuadrados
        */
       
        System.out.println("dame la base del rectangulo");
        int base =sc.nextInt();
          System.out.println("dame la altura del rectangulo");
        int altura =sc.nextInt();
        
        
        int area = base * altura ;
        System.out.println(area+" metros");
       
    }
    
}
