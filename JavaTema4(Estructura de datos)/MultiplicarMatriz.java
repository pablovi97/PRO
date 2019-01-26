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
public class MultiplicarMatriz {

    int columnas;
    int filas;
    int datos1[][];
    int datos2[][];

    public MultiplicarMatriz(int colum, int filas) {
        this.columnas = colum;
        this.filas = filas;
        datos2 = new int[filas][columnas];
        datos1 = new int[columnas][filas];

    }

    public int[][] matrizA(int... valor) {
        int i = 0;
        int j = 0;
        for (int val : valor) {
            datos1[i][j] = val;

            j++;
            if (j == filas) {
                j = 0;
                i++;
            }
        }
        mostrarArray(datos1);
        return datos1;
    }

    public int[][] matrizB(int... valor) {
        int i = 0;
        int j = 0;
        for (int val : valor) {
            datos2[i][j] = val;

            j++;
            if (j == columnas) {
                j = 0;
                i++;
            }
        }
        mostrarArray(datos2);
        return datos2;
    }

    int[][] multiplicarmatriz() throws Exception {
        int columnaA = datos1[0].length;
        int filaA = datos1.length;

        int filaB = datos2.length;
        int columnaB = datos2[0].length;

        if (columnaA != filaB) {
            throw new Exception("Dimensiones Incompatibles");
        } else {
            int[][] datos3 = new int[filaA][columnaB];
            for (int i = 0; i < filaA; i++) {
                for (int j = 0; j < columnaB; j++) {
                    for (int k = 0; k < columnaA; k++) {
                        datos3[i][j] = datos3[i][j] + datos1[i][k] * datos2[k][j];
                    }
                }
            }
            mostrarArray(datos3);
            return datos3;
        }
    }

    public void mostrarArray(int almacen[][]) {

        for (int i = 0; i < almacen.length; i++) {
            int fila[] = almacen[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j] + " ,");

            }
            System.out.println("");

        }

    }

    public static void main(String[] args) throws Exception {
        MultiplicarMatriz mm = new MultiplicarMatriz(3, 2);
        mm.matrizB(3, 4, 5, 6, 7, 8);
        mm.matrizA(5, 6, 8, 7, 3, 4);
        mm.multiplicarmatriz();

    }
}
