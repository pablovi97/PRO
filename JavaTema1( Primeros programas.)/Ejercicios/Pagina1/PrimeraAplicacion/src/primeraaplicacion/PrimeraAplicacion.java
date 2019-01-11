/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraaplicacion;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class PrimeraAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int numero;
          String unTexto;
        /*
        para que nos salga un mensaje por pantalla
        */
        System.out.println("Dame un numero");
        /*
        Para hacer un "input"
        */
        Scanner miVariableLectura = new Scanner(System.in); 
        /*
        Creamos una variable "numero" y la declaramos como entero con "int" 
        y la igualamos al input 
        */
        
        unTexto = miVariableLectura.nextLine();
        System.out.println("El texto introducido es : ");
        System.out.println(unTexto);
        /*
        Declaramos la a y la b como enteros
        */
        int a ,b,c;
           String texto1 ,texto2;
           
           texto1 = "hola";
           texto2 = "mundo";
           
           System.out.println("hola"+"mundo");
           System.out.println(texto1 + texto2);
           
           a = 5;
           b = 7;
           c = a + b;
           /*
           se concatena en vez de una "," en psint es una "+"
           */
           System.out.println("la suma de 5 + 7 es :" + c);
           /*
           suma texto y numeros no sua solo concatena con un parentesis
           ejecutaria primero a y b
           */
           System.out.println("hola"+ a + b);
           /*
           numero mas numero los suma
           */
           System.out.println( a + b);
        
    }

}
