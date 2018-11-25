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
public class Ejercicio25 {
    public static void main(String[] args) {
        /*
    Sumar todos los elementos de un array mediante recursión
    */ 
        
        int array[] = tomaDeDatos();
        System.out.println("la suma de los array es: "+sumaArray(0,array));
    }
    
  public static int[] tomaDeDatos(){
      System.out.println("Que cantidad de numeros para el array");
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
   
   public static int sumaArray(int n,int array[]){
      
       System.out.println("hemos entrado en iteracion: "+n);
 int resultado = 0;
       if(n >= array.length-1){
         resultado=array[n];
           System.out.println("hemos llegado al final del array no hay que sumar  mas :array[n]=  "+array[n]);
          
       }else{
        
           System.out.println("hacemos recursion para n+1?= "+(n+1));
        resultado = sumaArray(n+1,array)+array[n];
         
  
   }
         System.out.println("");
           System.out.println("------");
           System.out.println("n = "+n);
           System.out.println("resultado = "+resultado);
           System.out.println("array[n] = "+ array[n]);
           System.out.println("");
           System.out.println("----\n");
           
       return resultado;
      
       
      
       
   }

 
    
}
