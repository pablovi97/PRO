/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Ejercicio31Clase {

    public static void main(String[] args) {
        /*
        buscar en un array si coincide el numero del usuario mediante metodo recursivo
        usando el divide y venceras
         */
        int[] array = {2, 4, 6, 7, 8, 9,};
        Scanner sc = new Scanner(System.in);
        int num = 4;
        // num = sc.nextInt();

        /*
buscarPremio(array, 6, 7);
        if (buscarPremio(array, 6, 7) == false) {
            System.out.println("no te ha tocado el premio ");
        } else {
            System.out.println("te ha tocado el premio");
        }
*/
       //buscarRecursivo(array, 0, 6,4);
        if (buscarRecursivo(array, 0, 6,10) == false) {
            System.out.println("no te ha tocado el premio ");
        } else {
            System.out.println("te ha tocado el premio");
        }
    }

    public static boolean buscarPremio(int array[], int size, int num) {
        // boolean resultado = false;
        int mitad = size / 2;

        if (mitad != array.length - 1) {
            if (num < array[mitad]) {
                buscarPremio(array, mitad - 1, num);
                if (num == array[mitad]) {
                    // System.out.println("te ha tocado el premio");
                    //resultado = true;
                    return true;
                } else {

                }

            } else {
                if (num > array[mitad]) {
                    buscarPremio(array, mitad + 1, num);
                    if (num == array[mitad]) {
                        // System.out.println("te ha tocado el premio");
                        //resultado = true;
                        return true;
                    } else {

                    }
                }

            }
        }

        return false;
    }
    public static boolean buscarRecursivo(int array[] , int posInicio, int posFin, int numero  ){
        //CORREGITDO
        boolean resultado = false;
        if(posInicio > posFin){
            resultado = false;
        }else  if(posInicio == posFin){
            if(array[posInicio]==numero){
                resultado = true;
            }else{
                resultado = false;
            }
        }else if(posInicio +1 == posFin){
            if (array[posInicio]== numero || array[posFin]== numero){
                resultado = true;
            }else{
                resultado = false;
            }
        }else{
            //aqui tenemos un subarray de almenos 3 numeros
            int  media = (posInicio + posFin)/2;
            if(array[media]== numero){
                resultado= true;
            }else  if(array[media]>numero){
                resultado = buscarRecursivo(array, posInicio, media, numero);
            }else{
                resultado = buscarRecursivo(array, media, posFin, numero);
            }        
        }

        return resultado;
    }
}
