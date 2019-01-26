/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5.Clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Comparador1 {

    public static void main(String[] args) {
        /*
        int[] arr = {8, 1, 11, 5, 21, 10, 4, 15};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
         */
        ArrayList<Integer> arl = new ArrayList<Integer>(10);
        arl.add(8);
        arl.add(1);
        arl.add(11);
        arl.add(5);
        arl.add(21);
        arl.add(10);
        arl.add(4);
        arl.add(15);
//antes de ordenar:
        for (Integer num : arl) {
            System.out.print(num + " ");
        }
        System.out.println("");
        Collections.sort(arl);
//ya ordenado:
        for (Integer num : arl) {
            System.out.print(num + " ");
        }
    }
}
