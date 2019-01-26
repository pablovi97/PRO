/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Practica16 {
    public static void main(String[] args) {
        /*
        Práctica 16: Crear un diccionario de español/inglés. Se deberán registrar al menos 10
palabras en español y su traducción en inglés. Se deberá realizar con un HashMap y con un
TreeMap. Recorrer en ambos casos la estructura completa y mostrar en pantalla Hacer una
captura de pantalla de cada una de las ejecuciones ¿ alguno se muestra ordenado ?
        */
             /*   
         HashMap<String, String> t = new HashMap<String, String>();
        t.put("hola", "hello");
        t.put("adios", "good bye");
        t.put("lapiz", "pencil");
        t.put("Marco", "marcus");
        t.put("Lidia", "lindsay");
        t.put("mono", "monkey");
        t.put("pablo", "paul");
        t.put("serpiente", "snake");
        t.put("verde", "green");
        t.put("lobezno","wolverine");
         Iterator it = t.entrySet().iterator();
         while (it.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
            System.out.println("Clave=" + entry.getKey() + ", Valor=" + entry.getValue());
// it.remove();
        }
*/
             
          TreeMap<String, String> t = new TreeMap<String, String>();
        t.put("hola", "hello");
        t.put("Adios", "good bye");
        t.put("lapiz", "pencil");
        t.put("Marco", "marcus");
        t.put("Lidia", "lindsay");
        t.put("mono", "monkey");
        t.put("pablo", "paul");
        t.put("serpiente", "snake");
        t.put("verde", "green");
        t.put("lobezno","wolverine");
        t.put("hola", "pepe");
    
        
           Set set = t.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());

      }
        
    }
   
}
