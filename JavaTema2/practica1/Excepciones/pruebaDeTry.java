/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class pruebaDeTry {
    public static void main(String[] args) throws Exception {
       
        
        System.out.println("dame un numero por favor");
        int numero = proximoEntero();
        System.out.println("una suma para probar que es un numero es : sumamos "+numero+" mas 4 es = " +(numero+4) );
      
    }
    public static int proximoEntero() throws Exception{
        /**
         * @author Pablo Viera
         * Este programa funciona convirtiendo un string a un entero
         * usando el codigo ASCII
         */
        Scanner sc = new Scanner (System.in);
        String texto = sc.nextLine();
          int cifra = 0;
          int numeroFinal= 0;
        for (int i = 0; i < texto.length(); i++) {
            
          char c = texto.charAt(i);
            
          if((int)c < 48 || (int)c> 57){
              throw new Exception("No has introducido un numero");
          }else{
          cifra = c -'0';
          numeroFinal *=10;
           numeroFinal += cifra;
          }
        }
      
        return numeroFinal;
    }
    
}
