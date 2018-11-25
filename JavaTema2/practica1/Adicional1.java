/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Adicional1 {

    public static void main(String[] args) {
        int size = 10;
        int[] array;
        array = new int[size];
        
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        
        int[] array1 = array;
       
          
        int[] array2 = array1;
        array[2 ] = 7;
        System.out.println(array[2]);
        System.out.println(array1[2]);
        System.out.println(array2[2]);
         mostrarArray(array);
        mostrarArray(array1);
        
        
        int array3[] = {3, 4, 0, 7, 5};
        
        mostrarArray(array3);
       
    }

    private static void mostrarArray(int[] array) {
        
        
        System.out.print("[ ");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+",");
            
        }
        System.out.println(array[array.length-1]+" ]");
      
     }

}
