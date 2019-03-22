/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.io.PrintStream;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 * 
 * 
 * 
 */

interface  Ordenable <T>{
 boolean esMayorQue(T obj , T obj1);
}
public class OrdenarPersona {

    public OrdenarPersona(int edad, String nombre, int peso) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "OrdenarPersona{" + "edad=" + edad + ", nombre=" + nombre + ", peso=" + peso + '}';
    }
    int edad;
    String nombre;
    int peso;

    static boolean esMayorQue(String txt1, String txt2) {
        boolean resultado = false;
        boolean finalizar = false;
        for (int i = 0; !finalizar && i < txt1.length() && i < txt2.length(); i++) {
            if (txt1.charAt(i) > txt2.charAt(i)) {
                resultado = true;
                finalizar = true;
            } else if (txt1.charAt(i) > txt2.charAt(i)) {
                finalizar = true;
            }

        }
        return resultado;

    }

    static void ordenar(Ordenable func1 ,OrdenarPersona [] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (func1.esMayorQue(j, j)) {
                    OrdenarPersona temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    System.out.println(array[i]);
                }

            }
        }

    }

    public static void main(String[] args) {
        OrdenarPersona op1 = new OrdenarPersona(56,"pepe",78);
        OrdenarPersona op2 =  new OrdenarPersona(87 ,"juan",54);
        
       OrdenarPersona [] p = new OrdenarPersona[2];
       p[1]= op1;
       p[2]= op2;
       
       
        Ordenable func1 = new Ordenable <OrdenarPersona>(){
            @Override
            public boolean esMayorQue(OrdenarPersona obj, OrdenarPersona obj1) {
                return obj.edad > obj.edad;
              
                
             
                
                
                
            }
            
        };
        
        
OrdenarPersona.ordenar(func1, p);


        
        
        
     

}
}




