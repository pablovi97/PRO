/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica23 {
    /*
    Probar en el IDE las siguientes comparaciones. Obtener una salida en pantalla
del valor booleano correspondiente y explicar por qué motivo la comparación nos sale true
o false:
new String("test").equals("test") true
new String("test") == "test" false
new String("test") == new String("test") false
"test" == "test" true
    */
    public static void main(String[] args)throws Exception {
      //Coche c = new Coche("paco",5);
       // System.out.println(c); 
        
        
        Fraccion fr1 = new Fraccion(234,436);
       Fraccion fr2 = new Fraccion(1,2);
    
      
       //System.out.println( Fraccion.opuesto(fr1));
        System.out.println(Fraccion.multiplicacion(fr1, fr2));
              
    }
}
