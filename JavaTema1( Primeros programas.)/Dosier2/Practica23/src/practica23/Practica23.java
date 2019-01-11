/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Hacer un programa que resuelva ecuaciones de segundo grado. El usuario
        introduce los valores de a,b,c de la fórmula: aX^2+bX+c = 0
        Se debe mostrar las dos posibles soluciones, salvo que haya una raiz negativa en cuyo caso
        se mostrará el mensaje: “no hay solución real”
        Nota. Para resolver podemos hacer uso de: Math.sqrt() para obtener la raíz cuadrada
         */
        System.out.println("dime el primer numero que sera a");
        double a = sc.nextInt();
        System.out.println("dime el segundo numero que sera b");
        double b = sc.nextInt();
        System.out.println("dime el tercer numero que sera c");
        double c = sc.nextInt();

        double discriminante = (b * b - 4 * a * c);
        if (a == 0) {
            double resultado;
            resultado = -c / b;
            System.out.println("el resultado es " + resultado);
        } else if (discriminante < 0) {//Caso que no hay solucion
            System.out.println("no se puede calcular . la raiz negativa");
        } else if (discriminante == 0) {//Caso de una solucion
            double resultado = -b / (2 * a);
            System.out.println("el resultado es " + resultado);

        } else {//Caso de dos soluciones
            double x1 = -b + Math.sqrt(b * b - 4 * a * c) / (2 * a);
            double x2 = -b - Math.sqrt(b * b - 4 * a * c) / (2 * a);

            System.out.println("el resultado de la ecuancion de x1 es: " + x1 + " el resultado de la ecuancion de x2 es: " + x2);
        }

    }
}
