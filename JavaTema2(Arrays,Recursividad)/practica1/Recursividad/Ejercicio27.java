/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio27 {

    public static void main(String[] args) {

        //System.out.println(potencia(7,3));
        System.out.println(potencia2(5, 8));

    }

    public static int potencia(int base, int n) {
        int resultado;
        if (n == 1) {
            resultado = base;
        } else {
            resultado = potencia(base, n - 1) * base;
        }

        return resultado;
    }

    public static int potencia2(int base, int n) {
        int resultado;
        if (n == 1) {
            resultado = base;
        } else {
            resultado = potencia(base, n / 2);
            resultado *= resultado;
            if (n % 2 != 0) {
                resultado = resultado * base;
            }
        }

        return resultado;
    }

}
