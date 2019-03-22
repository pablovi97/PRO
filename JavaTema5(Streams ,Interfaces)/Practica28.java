/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author pablo
 */
public class Practica28 {

    public static void main(String[] args) {

        /*
        Práctica 28: Crear un ArrayList de Personas que incluya objetos Hombre y Mujer. Crea una
variable:
 Comparator<Persona> cmtPersona;
asigna a cmtPersona una expresión lambda que ordena las personas por peso ( igual tienes
que agregar un getter para peso en Persona ) y luego usa Collections.sort() para ordenar
mediante cmtPersona el ArrayList 
         */
     
       
        ArrayList<PersonaP12> pers = new ArrayList<>();
        pers.add(new Mujer("andrea ", "machado", "pepe", 20, 180, 60));
        pers.add("pepe", "estevez", "carlos", 18, 175, 73);
        pers.add("pep", "estev", "carl", 1, 17, 7);
        pers.add("anna", "perera", "perez,", 56, 56, 46);
        
      
       
        
        Comparator<PersonaP12> cmtPersona = (p1, p2) -> Double.compare(p1.peso, p2.peso);
        
       Collections.sort(pers,  cmtPersona);
        for (PersonaP12 p : pers) {
            System.out.println(p);
        }

            
        };
    

}
