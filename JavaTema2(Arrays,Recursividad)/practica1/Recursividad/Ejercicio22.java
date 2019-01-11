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
public class Ejercicio22 {

    public static void main(String[] args) {
        /*
        Imaginemos que java no supiera realizar una multiplicación de dos números
enteros positivos. En ese caso aún podríamos realizar una multiplicación usando
recursividad aprovechando la siguiente propiedad de la multiplicación:
n*a = (n-1)*a + a
Así pues podríamos crear un método que se llame multiplicar() donde:
n*a = multiplicar(n,a) = multiplicar( n-1, a) + a
la condición base es que 1*a = a
Hacer un programa que resuelva las multiplicaciones utilizando recursión
         */

        System.out.println(multiplicar(4, 7));  
        //suma(4,7);
    }

    public static int multiplicar(int n, int a) {
        int resultado = 0;
        if (n == 0) {
            resultado = 0;
        } else if (n == 1) {
            resultado = a;
        } else {
            resultado = multiplicar(n - 1, a) + a;
        }/*
        (4,7)
        (3,14)
        (2,21)
        (1,28)
        la n es para la condicion de parada y la a se va sumando a+a 
        */

        return resultado;
    }
 

}
