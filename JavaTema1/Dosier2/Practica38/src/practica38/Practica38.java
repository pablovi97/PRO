/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica38;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Hacer un programa que recibe un número de horas, por ejemplo 135.25 y lo
convierte a un formato de: días, horas, minutos, segundos. Siguiendo el ejemplo anterior:
5días 15horas 15minutos 0segundos
         */
        Scanner sc = new Scanner(System.in).useLocale(Locale.CHINA);
        System.out.println("Dame el numero de horas");
        double horasIniciales = sc.nextDouble();
        int dia = (int) (horasIniciales / 24);
        int hora = (int) (horasIniciales % 24);
        int minutos = (int) ((horasIniciales % 24 - hora) * (double) 60);
        int segundo = (int) ((((horasIniciales % 24 - hora) * (double) 60) - minutos) * 60);
        System.out.println(dia + " dias");
        System.out.println(hora + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundo + " segundos");
    }

}
