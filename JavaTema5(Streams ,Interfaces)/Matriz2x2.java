/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author pablo
 */
public class Matriz2x2 {

  
    /*
    Práctica 20: Tomando la clase MatrizCuadrada de la práctica 6 Ahora Crearemos una
Clase: Matriz2x2 que hace referencia a las matrices cuadradas de dimensión 2. El usuario
tendrá la posibilidad de agregar una nueva matriz a la lista, quitar una matriz de la lista.
Cada vez que realice una operación se le mostrará la lista completa de matrices que quede
después de la operación
Para el funcionamiento de este programa se utilizará la estructura dinámica que se considere
conveniente. La Clase Matriz2x2 debe tener un método toString() que facilite que se
muestre la matriz correctamente en pantalla al mostrar la lista de matrices
La lista de matrices siempre se mostrará ordenada. El orden entre matrices cuadradas de
dimensión dos lo va a establecer el determinante de la matriz. Ej
a b
c d determinante = a*d - c*b
     */

    public static void mostrarArray(int almacen[][]) {

        for (int i = 0; i < almacen.length; i++) {
            int fila[] = almacen[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);

            }
            System.out.println("");

        }

    }

    public Matriz2x2(int n) {
        this.filas = n;
    }
    int filas;

    int array[][];

    public Matriz2x2(int a, int b, int c, int d) {
        array = new int[2][2];
        array[0][0] = a;
        array[0][1] = b;
        array[1][0] = c;
        array[1][1] = d;

    }

    public static Matriz2x2 suma(Matriz2x2 c, Matriz2x2 d) {
        Matriz2x2 resultado = new Matriz2x2(
                c.array[0][0] + d.array[0][0],
                c.array[0][1] + d.array[0][1],
                c.array[1][0] + d.array[1][0],
                c.array[1][1] + d.array[1][1]);

        return resultado;
    }

    public static void main(String[] args) {
        /*
        
*/
ArrayList<Matriz2x2> fr = new ArrayList<>();
        Matriz2x2 mt1 = new Matriz2x2(4);
        Matriz2x2 mt2 = new Matriz2x2(7);
        Matriz2x2 mt3 = new Matriz2x2(8);
        Matriz2x2 mt4 = new Matriz2x2(2);
        Matriz2x2 mt5 = new Matriz2x2(9);
        fr.add(mt1);
        fr.add(mt2);
        fr.add(mt3);
        fr.add(mt4);
        fr.add(mt4);
        
        Comparator<Matriz2x2> cmtMatriz = (p1, p2) -> Double.compare(p1.filas, p2.filas);
        Collections.sort(fr,cmtMatriz);
        for (Matriz2x2 matriz2x2 : fr) {
            System.out.println(matriz2x2.filas);
        }

    }
}
