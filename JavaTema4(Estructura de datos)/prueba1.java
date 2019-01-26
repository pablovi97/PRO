/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo viera martin
 */
public class prueba1 {

    public static void main(String[] args) {
        int array[][] = new int[3][];
       
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
        for (int i = 0; i < array.length; i++) {
           
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
                
            }
            System.out.println("");
        }
        
      /*
        for (int fila[]: array){
          
            System.out.println(fila);
         
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=new int[4];
            for (int j = 0; j < array[i].length; j++) {
               array[i][j]=i;
                
            }
            
        }
        
        for (int fila[] : array){
            for(int columna : fila){
                System.out.print(columna +" ");
            }
            System.out.println("");
        }
        */
        
    }

}
