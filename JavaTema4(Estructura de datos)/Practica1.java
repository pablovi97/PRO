/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo
 */
public class Practica1 {

    public static void main(String[] args) {
        /*
        Práctica 1: Probar el código anterior y luego recorrer el array para mostrar en pantalla la
información que tiene almacenada. Toma captura de pantalla de la salida que muestra. ¿ se
ha modificado el array ? 
        */
        int array[] = {7, 3, 9, 2, 8};
        for (int elemento : array) {
            elemento = 20;
            System.out.println(elemento);//muestra 20  y no se ha modificado el array porque esta guardando los balores del array en elmento sin alterar el array y luego cambia elemento a 20
            
        }
        
    }

}
