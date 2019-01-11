/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
       /*
        Hacer un programa que se le pase un número entero y determine si es
múltiplo de 3 y de 5. Un módelo de mensajes a mostrar sería:
- x es multiplo de 3 pero no es múltiplo de 5
- x no es múltiplo de 3 pero sí es múltiplo de 5
- x no es múltiplo de 3 ni de 5
- x es múltiplo de 3 y de 5
        */
       System.out.println("dime un numero entero");
        int num = sc.nextInt();
        
        
        if(num % 3 == 0){
            if(num%5==0){
                 System.out.println(num+"es multiplo de 3");
          
          }else{ 
                System.out.println(num+"es multiplo de 3 pero no de 5");
            }
        }else{
                    if(num%5==0){
                        System.out.println("es mulplo de 5 pero no de 3");
                    } 
            
      
        }
           
    }
}     
    

