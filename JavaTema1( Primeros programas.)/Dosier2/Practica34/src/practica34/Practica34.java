/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica34;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Hacer un programa que muestre la secuencia de números: 71, 65,59,.., y que
pare cuando ya sean negativos
        */
        int num = 71;
        
        do{
           
           
            System.out.println(num);
             num =  (num-6);
        }while(num >= 0);
    }
    
}
