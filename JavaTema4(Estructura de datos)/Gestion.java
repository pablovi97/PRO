/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Gestion {
    /*
    gestionar habitaciones


En los hoteles cuando se va a desayunar se suele preguntar la habitaciÃ³n de la persona que 
llega al comedor. Para contemplar si estÃ¡ dentro del precio establecido o hay que agregar
una tarifa adicional


No se entiende que una persona que haya ido a desayunar se le permita que vuelva mÃ¡s tarde
a hacerlo


Crear una clase: Gestion

tiene un constructor que acepta un String para que se ponga la fecha del dÃ­a 

con mÃ©todo: vieneADesayunar()

a ese mÃ©todo se le pasa el nÃºmero de la habitaciÃ³n

ese mÃ©todo devolverÃ¡ un "ok" o un "ya ha desayunado"

TambiÃ©n debe existir un mÃ©todo llamado: listado()

que nos mostrarÃ¡ un listado que primero mostrarÃ¡ el dÃ­a
y luego la lista de habitaciones que han venido a desayunar
    */
    String fecha;
    private HashSet<String> huespedes;
    public Gestion(String fecha) throws Exception{
        //La expresion da mal
      //if(fecha.matches("([2][0-9][0-9][0-9])-((0[0-9])|([1[0-2]]))-(([0-2][0-9])|([3[01]])")){
         this.fecha = fecha;
       //   System.out.println("Fecha OK!");
           
     // }else{
      //    throw new Exception("la fecha ha sido introducida mal ");
    //  }
      huespedes = new HashSet<String>();  
    }
    public String vieneADesayunar(String numhabit){
        
        return(huespedes.add(numhabit)?"ok":"ya ha desayunado");
       
        
    }
    
    public void listado(){
        System.out.println(this.fecha);
     for(String val : huespedes){
         System.out.println(val);
     }
            
    }
    
    
    public static void main(String[] args) throws Exception {
        Gestion gt = new Gestion("2019-11-24");
        System.out.println(gt.vieneADesayunar("123"));
        System.out.println(gt.vieneADesayunar("123"));
        gt.listado();
    }
 
    
}
