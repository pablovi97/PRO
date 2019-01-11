/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        /*
        Crear un programa que genere 20 números aleatorios enteros entre 1 y 100.
Este array una vez se hay rellenado no se puede modificar. Crear un segundo array donde se
almacenará una copia de los 5 números más pequeños del primer array. Mostrar en pantalla
el contenido del array de 20 números y mostrar cuáles son los 5 números más pequeños
         */
        int cantidad = 20;
        int array[] = atleatorio(cantidad);
        mostrarArray(array);
        int cantMenores = 5;
        
        int menores[] = obtenerMenores(cantMenores, array);
        
        System.out.println("los menores son: ");
        mostrarArray(menores);

        System.out.println("la pocicion de los menores en el array es : ");
       pocicion5(menores ,array);
       
    }

    public static int[] atleatorio(int size) {
        Random rnd = new Random();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100) + 1;

        }
        return array;

    }

    public static void mostrarArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println("]");
    }

    public static int[] obtenerMenores(int size, int array[]) {
        int resultado[] = new int[size];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = i;
             }
            for (int j = resultado.length; j < array.length; j++) {
                int posMayorResultado = pocicionMaximo(resultado,array);
                if (array[j] < array[resultado[posMayorResultado]] ){
                    resultado[posMayorResultado] = j;
                }
            }
       
        return resultado;
    }

   
    public static int pocicionMaximo(int[] resultadoPosic , int[] array) {
        int posMax = 0;
        if (resultadoPosic != null) {

            for (int i = 0; i < resultadoPosic.length; i++) {
                if (array[resultadoPosic[posMax]] < array[resultadoPosic[i]]) {
                    posMax = i;
                }

            }
        } else {
            posMax = -1;
        }
        return posMax;

    }
    
    public static void pocicion5(int array1[] , int array2[]){
       for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array2[j] == array1[i]) {
                    System.out.println("la posicion de "+array1[i]+" es "+j);
                    
                }
            }
        }
             
        }
        /*
    PRACTICA13
         Crear una variante del programa anterior que en lugar de guardar una copia de
los números más pequeños guarde la posición en la que están esos números. 
        */
        
    }
    