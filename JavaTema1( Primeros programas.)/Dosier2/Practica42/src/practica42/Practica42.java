/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica42;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Hay una cuadrilla de trabajadores que aceptar encargos. Pongamos por
ejemplo que tienen un encargo por 10000€. Al finalizar el trabajo observan que han
participado 5 componentes de la cuadrilla dedicando cada uno de ellos respectivamente el
siguiente número de horas:
10, 100, 100, 20, 20
Así que en total han invertido 250horas para un trabajo de 10000€ saliendo la hora
trabajada a: 40€
 Hacer un programa que les permita calcular lo que sale cada hora trabajada. Como datos de
entrada recibirá el dinero total que se pagará por el encargo. El número de participantes de
la cuadrilla y el número de horas que haya realizado cada uno de los participantes

        */
        
        System.out.println("De cuanto dinero es el encargo?");
        int encargo = sc.nextInt();
        System.out.println("Cuantos trabajadores tiene ese Encargo?");
        int trabajadores = sc.nextInt();
        int j = 1;
        for(int i=0; i<=trabajadores;i++){
            System.out.println("Cuantas horas ha trabajado el trabajador?"+(j++));
            int num = sc.nextInt();
            int dineroTotal= num * 40;
            System.out.println("Este trabajador va a cobrar "+dineroTotal);
        }
    }
    
}
