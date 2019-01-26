/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5.Clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Comparador2 {
}

class ComparadorPersonas implements Comparator<Persona> {
//PARA  NO TOCAR LA CLASE PRINCIPAL CREAMOS UNA NUEVA
    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}

class Persona implements Comparable<Persona> {

    private String nombre;
    private String apellido;
    private int edad;

    Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " edad: " + edad;
    }

    @Override
    public int compareTo(Persona o) {
        // (return this.edad -p.edad) OTRA FORMA DE HACERLO
        // return Integer.compare(edad, p.edad)
        //SI FUERA UN STRING : return this.nombre.compareTo(p.nombre)
        if (this.edad > o.edad) {
            return 1;
        } else if (this.edad < o.edad) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(3);
        personas.add(new Persona("Marta", "León", 25));
        personas.add(new Persona("Julián", "Luz", 20));
        personas.add(new Persona("Pilar", "Ramos", 29));
        Collections.sort(personas);
        //Collections.sort(personas,new ComparadorPersonas()) ESTO SIRVE PARA NO TOCAR LA CLASE PRINCIPAL
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
