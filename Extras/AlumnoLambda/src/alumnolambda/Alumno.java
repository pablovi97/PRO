/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Alumno extends Persona{

    @Override
    double calcularPesoIdeal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    enum Asignatura{
        LND, PRO, BAE, FOL, ETS, LNT, SSF
    }
    
    class Calificacion{
        Asignatura asignatura;
        int nota;
        public Calificacion(Asignatura a, int n){
            asignatura = a;
            nota = n;
        }
        public Calificacion(){
            this(null,0);
        }
        
        public String toString(){
            return asignatura + ": " + nota +"; ";
        }
    }
    
    public Alumno(String nombre, String ape1, int edad, int altura, double peso) {
        super(nombre, ape1, edad, altura, peso);
        calificaciones = new ArrayList<Calificacion>();
    }

    public Alumno(){
        this("anónimo","desconocido",18,180,75);
    }
    
    ArrayList<Calificacion> calificaciones;
    
    
    public void agregarCalificacion(Asignatura asig, int nota){
        calificaciones.add(new Calificacion(asig, nota));
    }
    
    @Override
    public String toString(){
        String resultado = "";
        resultado= nombre + " " + apellido1 + " edad: " + edad + 
                " altura: " + alturaEnCm +"cm peso: "+pesoEnKg+"kg"+
                "\n Calificaciones: \n";
        for (Calificacion calificacion : calificaciones) {
            resultado += calificacion;
        }
    
        return resultado;
    }
    
    
}
