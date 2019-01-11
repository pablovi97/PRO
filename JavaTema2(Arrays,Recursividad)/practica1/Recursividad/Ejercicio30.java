/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        /*
        Partamos de la siguiente serie:
1 - 1/2 + 1/3 - 1/4 + 1/5 - ... - 1/2*n + 1/2*n+1 - …
Podemos diseñar un procedimiento recursivo para calcular la suma de los n primeros
elementos de la serie, de modo que usemos una función diferente para los elementos pares e
impares
         */
        System.out.println(impar(7)); 

    }

    public static double impar(int n) {
        double resultado = 0;
        if (n % 2 == 0) {
            resultado = par(n);
        } else {
            if (n == 1) {
                resultado = n;
            } else {
                // EXPLICACION : impar(5) = par(4)+1/5
                resultado = par(n - 1) + 1 / (double) n;
            }

        }

        return resultado;

    }

    public static double par(int m) {
        double resultado = 0;

        if (m <= 0) {
            resultado = 0;
        } else {
            if (m % 2 != 0) {
                resultado = impar(m);
            } else {
                resultado = impar(m - 1) - 1 / (double) m;
            }

        }

        return resultado;
    }

}
