/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio18_Corregido;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class JavaApplication49 {


    
    public static String obtenerDistanciaMenor(int []array, String []mensajes){
        //tomamos un valor inicial. Realmente nos da igual el que tomemos
        //como el pivote comienza en la posición 0 tomamos de momento como el mejor
        //número para ese pivote el número de la posición 1
        int distanciaMinima = Math.abs(array[1] - array[0]);
        int mejorPivote = 0;
        int mejorNumeroParaPivote = 1;
        String resultado = "" +array[0] + " " + array[1];
        
        
        for (int pivote = 0; pivote < array.length-1; pivote++) {
            int distanciaMinimaParaPivoteActual;
            distanciaMinimaParaPivoteActual = Math.abs(array[pivote+1] - array[pivote]);
            mejorNumeroParaPivote = pivote+1;
            for (int j = pivote+1; j < array.length; j++) {
                
                if( distanciaMinimaParaPivoteActual > Math.abs(array[j] - array[pivote])){
                    distanciaMinimaParaPivoteActual = Math.abs(array[j] - array[pivote]);
                    mejorNumeroParaPivote = j;
                }
                
            }
            //almacenamos en el array de mensajes los datos resultantes
            //para éste pivote
            mensajes[pivote] = "Para: " + array[pivote] + " el mejor número es: " + array[mejorNumeroParaPivote];
            
            //si la distancia obtenida para este pivote
            //es la mejor la guardamos para devolverla al finalizar el método
            if( distanciaMinima > distanciaMinimaParaPivoteActual){
                distanciaMinima = distanciaMinimaParaPivoteActual;
                resultado = "" +array[pivote] + " " + array[mejorNumeroParaPivote];
                
            }
        }
        
        return resultado;
    }
    
     public static int[] generarArray(int size, int limInf, int limSup){
        int array[] = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rnd.nextInt(limSup - limInf + 1) + limInf ;
        }
        return array;
    }
     
     
    public static void mostrarArray(int array[]){
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
        System.out.println("");
    }
         
    public static void main(String[] args) throws Exception {

        int numeros[] = generarArray(10, 0, 100);
        
        mostrarArray(numeros);
        
        String mensajesObtenidos[] = new String[numeros.length];
        
        String resultado = obtenerDistanciaMenor(numeros, mensajesObtenidos);
    
        System.out.println("Los mejores números son: " + resultado);
        
        //ahora podemos visualizar lo que ocurrió en cada iteración
        //gracias al array mensajesObtenidos ( realmente no lo necesitamos
        // para la ejecución del ejercicio )
        
        for (int i = 0; i < mensajesObtenidos.length-1; i++) {
            System.out.println(mensajesObtenidos[i]);
            
        }
        
   
    }
    
}
