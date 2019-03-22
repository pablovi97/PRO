/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraysbidimensionales;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Ciclo {

    /*
    1.- Escriba una clase que permita guardar las notas numéricas de cada estudiante en las asignaturas de un ciclo. 
    La clase asume que el ciclo tiene un máximo de 10 asignaturas y un máximo de 40 estudiantes.

 La clase permitirá Introducir notas, Mostrar las notas y obtener el promedio por clase.
     */
    
    String nombre;
    double notas;

    HashMap<String, HashMap<Asignatura, Integer>> estudiantes;

    public Ciclo() {

        estudiantes = new HashMap<String, HashMap<Asignatura, Integer>>();
    }

    public boolean agregarEstudiantes(String dni) {
        boolean resultado = false;

        if (estudiantes.size() <= 40) {
            estudiantes.put(dni, new HashMap<Asignatura, Integer>());

            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public double promedio() {
        int i = 0;

        double media = 0;
        for (HashMap<Asignatura, Integer> notas : estudiantes.values()) {
            for (Integer nota : notas.values()) {
                media += nota;
                i++;
            }
        }
        returen media/i;
    }

    public boolean introducirNota(String dni,  enum Asignatura, int nota) {
        boolean resultado = false;
        //Usar nombre;aqunque el dni es mejor porque se porhibe usar una segunda persona

        HashMap<Asignatura, Integer> notasEstudiante = estudiantes.get(dni);
        if (notasEstudiante != null && notasEstudiante.size() <= 10) {
            notasEstudiante.put(asignatura, nota);
            resultado = true;
        }
        return resultado;
    }

    enum Asignatura {
        LND,
        PRO,
        BAE,
        ETS,
        FOL,
        ING,

    }

    @Override
    public String toString() {
        //Entrey es el par clave valor
        //value es todo lo que hay en el hashmap
        String resultado = "";
        for (Map.Entry<String, <HashMap<String, Integer>> entry : estudiantes.entrySet()) {
            String nombreEstudiante = entry.getKey();
            HashMap<Asignatura, Integer> Calificaciones = entry.getValue();

            resultado += nombreEstudiante + "  : \n";

            for (Map.Entry<Asignatura, Integer> entry1 : calificaciones.entrySet()) {
                Asignatura asig = entry1.getKey();
                int nota =(int)entry1.getValue();
                
                resultado += "\t" + asig +": " +nota+"; ";
            }
            resultado +="\n";
        }
        return resultado; 
    }

    public static void main(String[] args) {
        

    }

}
