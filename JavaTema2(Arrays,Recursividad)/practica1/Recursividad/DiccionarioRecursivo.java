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
public class DiccionarioRecursivo {

    public static void main(String[] args) {
        //hacer combinacion con las letras de este abecedario y que ninguna se repita

        String dic[] = {"t", "a", "e", "r"};
        //diccionarioRecursivo(dic, 0, "");
        diccionarioRecursivo(dic, 0, "");
    }

    public static void diccionarioRecursivo(String array[], int indice, String carac) {
        String temp;
        String result = "";
        if (indice >= array.length) {
            System.out.println(carac);
        }else{
            String anterior =carac;
            for (int i = indice; i < array.length; i++) {
                 carac += array[i];
                 
                temp = array[i];

                array[i] = array[indice];

                array[indice] = temp;

             
                diccionarioRecursivo(array, indice + 1, carac);
                
                
                
               
                
                 temp = array[indice];

                array[indice] = array[i];

                array[i] = temp;
               carac =anterior;
                
            }
             
              

        }

    }
}
