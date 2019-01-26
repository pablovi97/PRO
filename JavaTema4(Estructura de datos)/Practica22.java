/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author pablo
 */
public class Practica22 {

    public static void main(String[] args) {

        /*
    Práctica 22: El usuario debe ir introduciendo el nombre de cada partido político y el
número de votos que ha tenido. Después se le mostrará un menú donde puede elegir
introducir el nombre de un partido y que le muestre los votos que ha tenido. Así como
introducir un límite inferior de votos y uno superior para que se le muestren los partidos y
los votos que han tenido que estén dentro de los límites. Utilizar la estructura dinámica más
apropiada para este caso. Justificar su elección entre comentarios
         */
        
        
        Elecciones el = new Elecciones();
        el.introducirdatos("Partido de las ovejas", 111);
        el.introducirdatos("Partido de las cabras", 120);
        el.introducirdatos("Partido de los toros", 90);
        el.introducirdatos("Partido de las moscas", 300);
        el.introducirdatos("Partido de las vacas", 130);
        
        
        System.out.println("__________________");
        
        el.mostrarListaPartido();
        
        System.out.println("_____________");
            el.mostrarunpartido("Partido de las vacas");
        System.out.println("________________");
        
        el.mostartotal(200, 100);
        
    }

}

class Elecciones {

    public Elecciones() {

    }
    HashMap<String, Integer> t = new HashMap<>();

    public void introducirdatos(String partido, int votos) {
        t.put(partido, votos);
    }

    public void mostrarListaPartido() {
        Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();

            System.out.println("Partido =" + entry.getKey());

        }
     
    

    }
    
    public void mostrarunpartido(String partido){
         Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();

            if (partido == entry.getKey() ) {
                System.out.println("Partido =" + entry.getKey() + ", votos =" + entry.getValue());
            }

        }
    }

    public void mostartotal(int limiSup, int limiInf) {
        Iterator it = t.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();

            if (limiInf <= entry.getValue() && entry.getValue() < limiSup) {
                System.out.println("Partido =" + entry.getKey() + ", votos =" + entry.getValue());
            }

        }

    }
}
