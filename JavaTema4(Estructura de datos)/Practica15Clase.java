/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Practica15Clase {
    public static void main(String[] args) {
      ArrayList<String> arr = new ArrayList<String>();
    arr.add("hola");
    arr.add("pablo");  
    arr.add("cabrera");
    for(Iterator it =arr.iterator(); it.hasNext();){
        String dato = (String)it.next();
        if(dato.equals("pablo")){
            it.remove();
            
        }else{
              System.out.println(dato);
        }
      
    }

    }
    
    
}
