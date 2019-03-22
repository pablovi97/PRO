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
public class Fraccion implements OrdenableP17<Fraccion> {

    /*
    Práctica 19: Crear la clase Fraccion con atributos: int numerador, int denominador un
    constructor que recibe los dos paramentros y otro que recibe únicamente el numerador ( el
    denominador será 1 ) con métodos: double toDouble() que devuelve el resultado de la
    división y un toString() en el formato: 3/5 donde 3 sería el numerador y 5 el
    denominador. Fraccion implementará la interfaz Ordenable los métodos: esMayorQue() …
    utilizarán la comparación de los double resultantes al hacer la división para comparar dos
    fracciones, siendo mayor una fracción si el double resultante es mayor
     */
    @Override
    public String toString() {
        return "Fraccion{" + numerador + "/" + denominador + ", producto=" + producto + ", param=" + param + '}';
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.producto = numerador / denominador;
        this.param = numerador / 1;
    }

    int numerador;
    int denominador;
    int producto;
    int param;

    double toDouble() {
        return producto;
    }

    public boolean esMayorQue(OrdenableP17 elemento1) {
        boolean resultado = false;
        Fraccion f = (Fraccion) elemento1;
        if (f.producto > 0) {
            resultado = true;

        } else {
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args) {
        OrdenableP17 elemento1 = new Fraccion(3, 6);
        OrdenableP17 elemento2 = new Fraccion(5, 8);

        if (elemento1.esMayorQue(elemento2)) {
            System.out.println("la primera fraccion es mayor que la segunda es mayor que el");
        } else {
            System.out.println("el segundo es mayor");

        }
        /*
        Práctica 22: Crear un ArrayList con objetos Fraccion ordenarlos utilizando una clase
anónima que implemente Comparator<Fraccion>
         */
        Fraccion p1 = new Fraccion(5, 6);
        Fraccion p2 = new Fraccion(7, 6);
        Fraccion p3 = new Fraccion(5, 7);
        Fraccion p4 = new Fraccion(8, 6);
        Fraccion p5 = new Fraccion(5, 1);
        Fraccion p6 = new Fraccion(6, 6);

        ArrayList<Fraccion> fc = new ArrayList<>();
        fc.add(p1);
        fc.add(p2);
        fc.add(p3);
        fc.add(p4);
        fc.add(p5);
        fc.add(p6);
        Comparator<Fraccion> cm = new Comparator<Fraccion>() {
            @Override
            public int compare(Fraccion o1, Fraccion o2) {
                return Integer.compare(o1.producto, o2.producto);
            }
        };
        Collections.sort(fc, cm);
        for (Fraccion p : fc) {
            System.out.println(p);
        }

    }

    @Override
    public boolean esMayorQue(Fraccion object) {
        return this.toDouble() > object.toDouble();

    }

    @Override
    public boolean esMenorQue(Fraccion object) {
        return this.toDouble() < object.toDouble();
    }

    @Override
    public boolean esIgualQue(Fraccion object) {
        return this.toDouble() == object.toDouble();
    }

}
