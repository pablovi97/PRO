/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Crear un programa que reciba un número entero y que muestre su
descomposición en números primos:
300 = 2*2*3*5*5
        */
        
        System.out.println("Dame un numero entero");
        int  original =sc.nextInt();
        int numero = original;
        int divisor = 2;
        String asterisco = "";
       
        do{
             int i = 0;
            while(numero % divisor == 0){
               i++;
                numero /= divisor;
            }
            
            if(i > 1){
                System.out.print(asterisco+"("+divisor+"^"+i+")");
            }else if(i == 1){
                 System.out.print(asterisco+divisor);
            }
            asterisco = "*";
            divisor++;
        }while(numero >1);
    }
    
}
