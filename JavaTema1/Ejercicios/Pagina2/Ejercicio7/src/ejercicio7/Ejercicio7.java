/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import static java.awt.SystemColor.text;
import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
     //Diseña un algoritmo que solicite la lectura, 
	//letra a letra, de un texto que no contenga letras mayúsculas. 
	//Si el usuario teclea una letra mayúscula, el algoritmo solicitará nuevamente la 
	//introducción del texto cuantas veces sea preciso.   
        */
    Scanner sc = new Scanner(System.in);
    String text;
    do{
        System.out.println("Escribir un texto n minusculas");
        text =sc.nextLine();
    }while(text==text.toLowerCase());
    }
    
}
