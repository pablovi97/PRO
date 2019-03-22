/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Universidad {

    String nombre;
    String ciudad;
    HashMap<String, Departamento> departamentos;
    HashMap<String, Estudiante> estudiantes;
    HashMap<String, Trabajador> trabajadores;

    public Universidad(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        departamentos = new HashMap<>();
        estudiantes = new HashMap<>();
        trabajadores = new HashMap<>();
    }

    public HashSet<String> titulacionesDisponibles() {
        HashSet<String> matriculable = new HashSet<>();
        for (Departamento dep : departamentos.values()) {
            for (String titulacion : dep.titulaciones) {
                matriculable.add(titulacion);
            }
        }
        return matriculable;
    }

    public void agregarTrabajador(Trabajador t) {
        trabajadores.put(t.dni.dni, t);
    }

    public String listarEstudiantes() {
        String res = "";
        for (Estudiante estudiante : this.estudiantes.values()) {
            res += estudiante + "\n";
        }
        if (res.equals("")) {
            res = "No hay estudiantes.";
        }
        return res;
    }

    public String listarTrabajadores() {
        String res = "";
        for (Trabajador trabajadores : this.trabajadores.values()) {
            res += trabajadores + "\n";
        }
        if (res.equals("")) {
            res = "No hay trabajadores.";
        }
        return res;
    }

    public String listarDepartamento() {
        String res = "";
        for (Departamento depart : this.departamentos.values()) {
            res += depart + "\n";
        }
        if (res.equals("")) {
            res = "No hay departamentos.";
        }
        return res;
    }

    public Departamento crearDepartamento(String nombre) {
        Departamento dep = new Departamento(nombre, this);
        departamentos.put(nombre, dep);
        return dep;
    }

    public Departamento obtenerDepartamento(String nombre) {
        return departamentos.get(nombre);
    }

    public boolean agregarTitulacionesDepartamento(Departamento dep, String titulacion) {
        boolean ret = true;
        if (dep != null) {
            ret = dep.agregarTitulaciones(titulacion);

        }
        return ret;
    }

    @Override
    public String toString() {
        return "Universidad: " + nombre + " Ciudad:" + ciudad + " ";
    }

    class Departamento {

        String nombre;
        HashSet<String> titulaciones;
        Universidad universidad;

        public Departamento(String nombre, Universidad universidad) {
            this.nombre = nombre;
            this.titulaciones = new HashSet<>();
            this.universidad = universidad;
        }

        public String listadoTitulaciones() {
            String resultado = "";
            int i = 0;
            for (String titulacion : titulaciones) {
                resultado += (i++) + ") " + titulacion + "\n";
            }
            return resultado;
        }

        public boolean agregarTitulaciones(String t) {
            boolean ret = false;
            if (Titulaciones.titulaciones.contains(t.toUpperCase())) {
                titulaciones.add(t.toUpperCase());
                ret = true;
            } else {
                ret = false;
            }
            return ret;
        }

        @Override
        public String toString() {
            String tit = "Titulaciones: ";
            ArrayList<String> arr = new ArrayList<>(titulaciones);
            for (int i = 0; i < arr.size() - 1; i++) {
                tit += arr.get(i) + ", ";
            }
            tit += arr.get(arr.size() - 1);
            return "Departamento{" + "nombre= " + nombre + ", " + tit + '}';
        }
    }

    public boolean crearEstudianteDeGrado(String titulacion, String expediente, String dni, String nombre) {
        boolean existeTitulacion = true;
        HashSet<String> titulaciones = this.titulacionesDisponibles();
        if (titulaciones.contains(titulacion.toUpperCase())) {
            try {
                EstudianteDeGrado es = new EstudianteDeGrado(titulacion.toUpperCase(), new Expediente(expediente), new Dni(dni), nombre);
                estudiantes.put(es.dni.dni, es);
            } catch (Exception exception) {
                System.out.println("Dni o expediente erroneo.");
            }
        } else {
            existeTitulacion = false;
        }
        return existeTitulacion;
    }

    public EstudianteDeGrado obtenerEstudianteDeGrado(String dni) {
        return (EstudianteDeGrado) estudiantes.get(dni);
    }

    public String listarEstudiantesDeGrado() {
        String res = "";
        for (Estudiante value : estudiantes.values()) {
            if (value instanceof EstudianteDeGrado) {
                res += value + "\n";
            }
        }
        return res;
    }

    class EstudianteDeGrado extends Estudiante {

        String titulacion;

        public EstudianteDeGrado(String titulacion, Expediente expediente, Dni dni, String nombre) {
            super(expediente, dni, nombre);
            this.titulacion = titulacion;
        }

        @Override
        public String toString() {
            return super.toString() + " titulación: " + titulacion; //To change body of generated methods, choose Tools | Templates.
        }

    }

}
