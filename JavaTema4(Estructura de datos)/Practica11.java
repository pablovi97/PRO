/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Practica11 {

    public static void main(String[] args) {
        /*
        Práctica 11: Crear un programa para la “frase del día” El usuario introduce al principio
todas las frases que quiera ( escribirá la palabra “fin” para finalizar la entrada de frases )
Todas las frases quedarán almacenadas en un ArrayList<String> posteriormente se le
muestra una frase elegida al azar de entre todas las introducidas. Diciendo: “la frase del día
es:
”
se debe garantizar que todas puedan ser elegidas ( un aleatorio desde 0 hasta
arraylist.length() )
         */
        /*
        Práctica 12: Modificar el programa anterior para que lo que muestre sea todas las frases
que empiecen con la letra a mayúscula: “A”
        */
        ArrayList<String> al = new ArrayList<>(10);

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String frase = "";
        while (!frase.equals("fin")) {
            System.out.println("Escribe la frase del dia ");
            System.out.println("para finalizar escribe fin");
            frase = sc.nextLine();
            al.add(frase);
            
        }
        al.remove("fin");
        System.out.println(" la frase del dia es :");
        System.out.println(al.get(rnd.nextInt(al.size())));
        System.out.println("Las frases que empiezan por 'A' ");
        System.out.println("");
         Iterator it = al.iterator();
        while(it.hasNext()){
           String frase1 = it.next().toString();
           if(frase1.charAt(0)== 'A'){
               System.out.println(frase1);
           }
        }
     

    }

}
