/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*
        Escribe un programa que calcule el salario semanal de un empleado en base
a las horas trabajadas, a razón de 18 euros la hora
        */
        System.out.println("dime las horas trabajadas");
         double horas ;
         
            System.out.println("dime las horas trabajadas el lunes");
         horas =sc.nextInt();
         
       
            System.out.println("dime las horas trabajadas el lunes");
         horas = horas + sc.nextInt();
            System.out.println("dime las horas trabajadas el martes");
         horas = horas + sc.nextInt();
            System.out.println("dime las horas trabajadas el miercoles");
         horas = horas + sc.nextInt();
            System.out.println("dime las horas trabajadas el jueves");
         horas = horas + sc.nextInt();
            System.out.println("dime las horas trabajadas el viernes");
         horas = horas + sc.nextInt();
         
         
         
         double salario = horas * (int)18;
         System.out.println("salario ="+salario);
   
    }
    
}
