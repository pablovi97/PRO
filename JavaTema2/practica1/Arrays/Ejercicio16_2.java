package practica1;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio16_2 {
    public static void main(String[] args) {
        /*
          /*
        Crear un programa que genere 10 números aleatorios enteros entre 1 y 100. Se
deben mostrar esos 10 números, la media de esos 10 números y decir cuáles de esos 10
números son mayores que la media calculada.
        */
      
        int array[] =  generarArray(10,1,100);
        mostrarArray(array);
        double media1 = media(array);
        System.out.println("media "+ media1);
        String resultado = (mayoresDelArray(array,  media1));
        System.out.println(resultado);
        
        
        
    }

    /**
     * Este metodo genera un array atleatorio con numeros enteros
     * atleatorios de tamaño el parametro size y los numeros se generan en el rango
     *  desde el parametro limiteinf y limitesup
     * @param size Tamaño del array deseado
     * @param limiteInf el tope de abajo
     * @param limiteSup valor que no pueden superar los numeros generados
     * @return un array con los atleatorios generados 
     */
      static int[] generarArray(int size, int limiteInf, int limiteSup) {
        Scanner sc = new Scanner(System.in);
        int array[];

        array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(limiteSup - limiteInf +1 ) + limiteInf;

        }
        return array;
    }
      
      
      static String mayoresDelArray(int array[] , double valorASuperar){
          String resultado = "";
          for (int i = 0; i < array.length; i++) {
              if(valorASuperar < array[i]){
                  resultado +=array[i]+" ";
                  
              }
              
          }
          return resultado;
      }
     public static double media (int array[] ){
         double suma = 0;
         
         for (int i = 0; i < array.length; i++) {
              suma+=array[i];
             
         }
         
         return suma/(double)array.length;
     }
       static void mostrarArray(int[] array1) {
        System.out.print("[ ");
        for (int i = 0; i < array1.length - 1; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println(array1[array1.length - 1] + " ]");
    }
    
}
