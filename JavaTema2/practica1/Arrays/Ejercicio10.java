/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import static practica1.Ejercicio10.media;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        /*
        Hacer un programa que primero solicita la cantidad de números que se van a
inroducir. Después de haberlos introducido muestra la media y los números que se han
introducido
        */
   
        
      
  
        int unarray[];
        unarray = tomaDeDatos();
        System.out.println("la media es : " +  media(unarray) + " la varianza es: "+varianza(unarray) );
        
    }
    
      static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.print(array1[array1.length - 1] + " ]");
        }
    
    
    
      static double media (int array[]){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double media = suma / array.length;
        return media;
     }


     static double varianza(int array[]){
        double media = media(array);
        int suma = 0;
        int i = 0;
        for ( i = 0; i < array.length; i++) {
            
            suma += (array[i]-media)*array[i] - media;
            
        }
              
           return suma / (double)array.length;
    }
   static int[] tomaDeDatos(){
      System.out.println("Que cantidad de numeros para varianza?");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int array[];
        
       array = new int[size];
       for (int i = 0; i < array.length; i++) {
           System.out.println("num"+(i+1)+":");
           array[i] = sc.nextInt();
          
      }
       return array;
  }  
        
}
