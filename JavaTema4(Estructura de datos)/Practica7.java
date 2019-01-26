/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo
 */
public class Practica7 {
    /*
    Práctica 7: Tarea de autoaprendizaje: Investiga un poco sobre StringBuilder toma una
cadena de texto y haz uso de los métodos: delete(), append(), insert(), replace() debes
mostrar casos en los que es útil el uso de esos métodos y como usarlos.
    */
    
    
    //El StringBuilder es util cuando quieres concatenar mucho texto como un array grande .Lo que hace internamente es concaterar todo sumandolo y creando un nuevo String coon todo lo sumado .En cambio la concatenacion
    //normal te va creando un string diferente por cada concatenacion 
    
    
    public static void main(String[] args) {
           int array [] =  {2,3,4,5,66,34,2,1,};
           
           
           StringBuilder texto = new StringBuilder();
           
           
           for (int i = 0; i < array.length; i++) {
            texto.append(array[i]);
            //el append sirve para ir añadiendo cadenas de texto
            
        }
         
           System.out.println(texto);
             texto.delete(1, 3);
             //el delete va quitando de la cadena lo que le pidas en este caso quita desde el priemro de la cadena hasta el tercero
             System.out.println(texto);
             
             texto.insert(3, "HOLA!");
             //el insert inserta un  string de texto dentro de la cadena en donde nosotros le digamos 
             System.out.println(texto);
             
             texto.replace(1, 2, "PRUEBA!");
             //el replace reemplaza uno o varios elementos de la cadena por el que queramos 
             System.out.println(texto);
             
    }
 

   
   
   
}
