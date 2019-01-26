/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author pablo viera martin
 */
public class explicaciones {

    public static void main(String[] args) {
        /*
        int array[][] = new int[3][];

        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }

        
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
         
        ArrayList<String> al = new ArrayList<>();
        String s0 = "yea";
        String s1 = "yea1";
        String s2 = "yea2";
        String s3 = "yea3";
        String s4 = "yea4";
        al.add(s0);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
//Se recorre el arraylist y si se encuentra lo que quiere se borra
        for (String elemento : al) {
            if (elemento.equals(s2)) {
                al.remove(s2);
                
            }
        }
        for (String elemento : al) {
            System.out.println(elemento);
        }

    }
         
        ArrayList<Integer> miArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            miArray.add(rnd.nextInt(20));
        }
        for (Iterator it = miArray.iterator(); it.hasNext();) {
            int numero = (int) it.next();//se castea porque se meten objetos
            System.out.println(numero);
            it.remove();
            
            System.out.println("tamaño array: " + miArray.size());

         */
        HashMap<String, Double> t = new HashMap<String, Double>();
        t.put("Ana", 9.2);
        t.put("Luis", 8.5);
        t.put("Marta", 6.0);
        t.put("Marco", 5.5);
        t.put("Lidia", 8.0);
        Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = (Map.Entry<String, Double>) it.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
// it.remove();
        }
    }
}

