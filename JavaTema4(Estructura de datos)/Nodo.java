/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Nodo {

    int dato;
    Nodo next;

    public static void main(String[] args) {
        // 3 8 12 6

        Nodo head = new Nodo();
        head.dato = 3;

        Nodo siguiente = new Nodo();
        siguiente.dato = 8;
        siguiente.next = null;

        head.next = siguiente;

        Nodo otro = new Nodo();
        otro.dato = 12;
        otro.next = null;

        siguiente.next = otro;

        Nodo otronuevo = new Nodo();
        otronuevo.dato = 6;
        otronuevo.next =  siguiente;

        head.next = otronuevo;

        Nodo aux = head;

        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.next;
        }

    }

}
