/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraysbidimensionales;

import java.util.HashMap;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Notas {
    String nombre;
    double notas;
    String asignatura;
    HashMap<String,HashMap<String,Integer>> estudiantes;
    
    
    public Notas(){
        
       estudiantes = new HashMap <String , HashMap<String,Integer>> ();
    }
    public boolean agregarEstudiantes(String dni){
        boolean resultado = false;
        if (estudiantes.size() <=40){
                    estudiantes.put(dni,new HashMap<String,Integer>());
                    resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    public boolean introducirNota(String dni ,String asignatura, int nota){
        boolean resultado = false;
        
    HashMap<String ,Integer>notasEstudiante = estudiantes.get(dni);
    if (notasEstudiante != null && notasEstudiante.size() <=10){
        notasEstudiante.put(asignatura, nota);
        resultado = true;
    }
    return resultado;
}
    
}
