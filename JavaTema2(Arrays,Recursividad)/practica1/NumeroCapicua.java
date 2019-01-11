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
public class NumeroCapicua {
    public static void main(String[] args) {
        /*
        Hacer un numero capicua
        */
        int num = 12321;
        String auxiliar= ""+num;
        String reverso= "";
        for (int i = 0; i < auxiliar.length() ; i++) {
            char caracter = auxiliar.charAt(i);
           // reverso+=caracter;
            reverso = ""+caracter+reverso;
        }
        if (reverso.equals(auxiliar)){
            System.out.println("es capicua");
        }else{
            System.out.println("no es capicua");
        }
        
        
        
        
    }
    
}
