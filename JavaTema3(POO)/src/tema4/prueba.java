/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class prueba {

    public static void main(String[] args) {
        /*  Persona p= new Persona("alvaro","pepe",65);
        p.mostrarInfo();
        System.out.println(p.mostrarInfo());
       Persona.inicio();
         */

        // Conversor c = new Conversor(0);
        // System.out.println(c.geteuroAdolar(12));
        // System.out.println(c.getdolarAeuro(13));
        //Profesor p = new Profesor("pepe", "quintero", 13, true, false);
        //p.profesorDatos();
        //  CuentaBancaria cb= new CuentaBancaria("pepe");
        // System.out.println(cb.getNumero());
        Scanner sc = new Scanner(System.in);
        boolean acabarPrograma = false;

        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("cual es la posicicon inicial del coche ");
        int posini = sc.nextInt();
        Coche adrian = new Coche(nombre, posini);
        do {
            System.out.println("MENU");
            System.out.println("1) encender");
            System.out.println("2) quitar freno mano");
            System.out.println("3) apagar");
            System.out.println("4) poner freno mano");
            System.out.println("5) mover izquierda");
            System.out.println("6) mover derecha");
            int option = sc.nextInt();
            sc.nextLine();
            int pasos;
            switch (option) {
                case 1:
                    System.out.println(adrian.encender());

                case 2:
                    System.out.println(adrian.quitarFrenoMano());
                    break;
                case 3:
                    System.out.println(adrian.apagar());

                case 4:
                    System.out.println(adrian.ponerFrenoMano());
                    acabarPrograma = true;
                    break;
                case 5:
                    System.out.println("Cuento quieres moverte?");
                    pasos = sc.nextInt();
                    sc.nextLine();
                    System.out.println(adrian.moverIzquierda(pasos));
                    break;
                case 6:
                    System.out.println("Cuento quieres moverte?");
                    pasos = sc.nextInt();
                    sc.nextLine();
                    System.out.println(adrian.moverDerecha(pasos));
                    break;
                default:
                    acabarPrograma = true;
            }
        } while (!acabarPrograma);

    }

}
