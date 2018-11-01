/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica46;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        /*
        Convertir un número a binario. El usuario introduce un número entero
decimal y el programa muestra en pantalla como es su forma en binario
        */
        
        System.out.println("Dame un numero entero");
        int num = sc.nextInt();
        
        String binario = "";
        
        int temporal = num ;
        while(temporal>0){
            binario =""+temporal%2+binario;
            temporal /=2;
        }
        System.out.println(binario);
    }
    
}

