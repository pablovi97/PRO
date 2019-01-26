/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Practica18 {

    public static void main(String[] args) {
        /*
        Práctica 18: Práctica de autoaprendizaje: Buscar información sobre las 3 estructuras que
acabamos de nombrar. Mostrar algún ejemplo respecto a los métodos: addAll(),
removeAll(), retainAll()
         */
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);

        arr1.add(12);
        arr1.add(20);
        arr1.add(45);
        
        
        
        for(Integer num : arr1){
            System.out.println(num);
        }
        System.out.println("_____________");
          ArrayList<Integer> arr2 = new ArrayList<Integer>(5);

        arr2.add(134);
        arr2.add(203);
        arr2.add(23);
         
        for(Integer num : arr2){
            System.out.println(num);
        }
        System.out.println("____________");
        
        arr1.addAll(arr2);
        
        //Enseñamos el primer array juntado con el segundo
        //el addall sirve para meter los datos de un arraylist dentro de otro
            
        for(Integer num : arr1){
            System.out.println(num);
        }
       System.out.println("______________");
        //El removaAll sirve para quitar los elementos del segundo array que introducimos antes
       arr1.removeAll(arr2);
        for(Integer num : arr1){
            System.out.println(num);
       }
         System.out.println("_____________________");
         //El retain all sirve para quitar los elementos del arra1 que tenia y los sustituye por los del otro
         arr1.retainAll(arr2);
         
          for(Integer num : arr1){
            System.out.println(num);
        }
        
        
        

    }
}
