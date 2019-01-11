/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

/**
 *
 * @author pablo
 */
public class Practica1 {

    public static void main(String[] args) {
        int a, b;
        a = 7;
        b = a; //en estos momentos b vale 7 porque "copiamos" de a hacia b
        System.out.println("b:" + b + " a:" + a);

        //modificar b no tiene efecto en a
        b = 3;
        System.out.println("b:" + b + " a:" + a);

    }
}
