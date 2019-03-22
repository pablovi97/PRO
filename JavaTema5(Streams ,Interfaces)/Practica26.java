/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

/**
 *
 * @author pablo
 */
public class Practica26 {

    /*
    Práctica 26: Crear la interfaz funcional: Mates que tiene el método:
public abstract int calc(int x);
En el main crear una lambda para obtener el número al cuadrado, otra para calcular el
factorial. Crea un método parecido al anterior: mostrarResultado(int x, Mates func) que nos
muestre en pantalla el resultado. Pasarle tanto el factorial como el cuadrado
     */
    public static void mostrarResultado(int x, Mates op) {
        System.out.println(op.calc(x));
    }

    public static void main(String[] args) {

        Mates<Integer> mt = (int x) -> {
            return x * x;
        };
        Mates<Integer> fc = (int x) -> {
            int i;
            for (i = 1; i < x; i++) {
                i *= i;

            }
            return i;
        };
        mostrarResultado(3, mt);
        mostrarResultado(7, fc);
    }

}

@FunctionalInterface
interface Mates<T> {

    public abstract int calc(int x);

}
