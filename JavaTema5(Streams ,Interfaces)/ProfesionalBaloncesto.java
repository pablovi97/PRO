/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

import Dosier6.Jugador.Posicion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author pablo
 */
public class ProfesionalBaloncesto {

    /*
    Práctica 16: Crear la clase ProfesionalBaloncesto que representa a cualesquier profesional
    de baloncesto. Así tiene como atributos: nombre, apellidos, edad, ingresosAnuales,
    numeroFederado, con un constructor como mínimo y un toString()
    La clase Jugador que extiende a ProfesionalBaloncesto con atributos propios: posición
    ( enum para base, pivot,.. ) , partidosJugados , equipo
    La clase Entrenador que extiende a ProfesionalBaloncesto con atributos propios:
    porcentajeVictorias ( un número de 0 a 100)
    La clase Arbitro que extiende a ProfesionalBaloncesto con atributos propios:
    int faltasPitadas
    Todos los datos de los atributos propios hacen referencia a una temporada completa
    Poner en una LinkedList de tipo ProfesionalBaloncesto objetos de tipo Jugador, Entrenador,
    Arbitro. Recorrer la lista y mostrar únicamente los atributos propios de la clase de cada
    objeto ( no los atributos comunes con la superclase)
    
     */
    public ProfesionalBaloncesto(String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.ingresosAnuales = ingresosAnuales;
        this.numeroFederado = numeroFederado;

    }

    @Override
    public String toString() {
        return "ProfesionalBaloncesto{" + "nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + ", ingresosAnuales=" + ingresosAnuales + ", numeroFederado=" + numeroFederado + '}';
    }

    String nombre;
    int edad;
    String apellidos;
    double ingresosAnuales;
    String numeroFederado;

    public static void main(String[] args) {
        /*
        LinkedList<ProfesionalBaloncesto> pb = new LinkedList<>();

        ProfesionalBaloncesto lv = new Jugador(Posicion.alero, 40, "tenerife", "pepe", 27, "estevez quintero", 30.000, "72364");
        ProfesionalBaloncesto lh = new Arbitro(56, "pepe", 76, "quitero jhonson", 10.000, "98889");
        ProfesionalBaloncesto lj = new Entrenador(45, "pep", 67, " jhonson", 10.000, "98345");
        pb.add(lv);
        pb.add(lh);
        pb.add(lj);

        for (ProfesionalBaloncesto valor : pb) {
            System.out.println(valor);
        }
*/

        ArrayList<Jugador> jg = new ArrayList<>();
        Jugador lv4 = new Jugador(Posicion.base, 40, "tenerife", "pepe", 27, "estevez quintero", 30.000, "72364");
        Jugador lv1 = new Jugador(Posicion.alero, 41, "tenerife", "pep", 26, "estev quint", 30.000, "72234");
        Jugador lv2 = new Jugador(Posicion.pivot, 31, "tenerife", "juan", 24, "evez ero", 30.000, "72334");
        jg.add(lv4);
        jg.add(lv1);
        jg.add(lv2);
        
        /*
        Práctica 23: Crear un ArrayList con objetos Jugador (práctica 16) y ordenarlos utilizando
una clase anónima que implemente Comparator<Jugador> la comparación será mediante el
atributo partidosJugados
        */

        Comparator<Jugador> cm = new Comparator<Jugador>() {
            @Override
            public int compare(Jugador o1, Jugador o2) {
                return Integer.compare(o1.getPartidosJugados(), o2.getPartidosJugados());
            }
        };
        Collections.sort(jg, cm);
        for (Jugador p : jg) {
            System.out.println(p);
        }

    }

}

class Jugador extends ProfesionalBaloncesto implements Comparator<Jugador> {

    @Override
    public String toString() {
        return "Jugador{" + "partidosJugados= " + partidosJugados + ", equipo=" + equipo + "Posicion = " + posicion + '}';
    }

    public Jugador(Posicion posicion, int partidosJugados, String equipo, String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);
        this.partidosJugados = partidosJugados;
        this.equipo = equipo;
        this.posicion = posicion;

    }

    @Override
    public int compare(Jugador t, Jugador t1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public int compare(Jugador t, Jugador t1) {
//        return 
//    }
    public enum Posicion {
        base,
        pivot,
        alero,
        ala_pivot,
        escolta

    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    Posicion posicion;
    int partidosJugados;
    String equipo;

    public Jugador(String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);

    }

}

class Entrenador extends ProfesionalBaloncesto {

    @Override
    public String toString() {
        return "Entrenador{ " + "porcentajeDeVicoria= " + porcentajeDeVicoria + '}';
    }

    public Entrenador(int porcentajeDeVicoria, String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);
        this.porcentajeDeVicoria = porcentajeDeVicoria;

    }

    int porcentajeDeVicoria;

    public Entrenador(String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);
    }

}

class Arbitro extends ProfesionalBaloncesto {

    @Override
    public String toString() {
        return "Arbitro{ " + "faltasPitadas= " + faltasPitadas + '}';
    }

    public Arbitro(int faltasPitadas, String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);
        this.faltasPitadas = faltasPitadas;
    }

    int faltasPitadas;

    public Arbitro(String nombre, int edad, String apellidos, double ingresosAnuales, String numeroFederado) {
        super(nombre, edad, apellidos, ingresosAnuales, numeroFederado);
    }

}
