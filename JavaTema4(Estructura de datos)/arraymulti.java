/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author Pablo Viera Martin .
 */
public class arraymulti {

    public static void main(String[] args) {
        int[][] almacen = new int[3][4];
        almacen[0][0] = 5;
        almacen[1][0] = 1;
        almacen[2][2] = 13;

    mostrarArray(almacen);
    }
    public static void mostrarArray(int almacen[][]){
           
        for (int i = 0; i < almacen.length; i++) {
            int fila[] =almacen[i];
            for (int j = 0; j < fila.length; j++) {
                System.out.print(fila[j]);
                
            }
            System.out.println("");

        }
    }

}
