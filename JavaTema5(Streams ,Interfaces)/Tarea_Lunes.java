/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Tarea_Lunes {

    /*
    Localizar la tercera altura mayor en la clase persona introduciendo un arraylist de hombres y mujeres sin que se repita
     */
 /*
    //MODO FACIL
    public static void main(String[] args) {
         double maximoTres = personas.stream()
                 .sorted((a,b)->Double.compare(b.altura, a.altura))
                 .map(p->p.altura)
                 .distinc()
                 .limit(3)
                 .skip(2)
                 .finFirst()
                 .orElse(-1);
    }
     */
    public static void main(String[] args) {

        PersonaP12 p1 = new Mujer("andrea ", "machado", "pepe", 20, 180, 60);
        PersonaP12 p2 = new Hombre("pepe", "estevez", "carlos", 18, 175, 73);
         PersonaP12 p3 = new Mujer("anna", "perera", "perez,", 56, 190, 46);
        PersonaP12 p4 = new Hombre("pep", "estev", "carl", 1, 17, 7);
        PersonaP12 p5 = new Mujer("anna", "perera", "perez,", 56, 56, 46);
        PersonaP12 p6 = new Mujer("anna", "perera", "perez,", 56, 190, 46);
        ArrayList<PersonaP12> pers = new ArrayList<>();
        pers.add(p1);
        pers.add(p2);
        pers.add(p3);
        pers.add(p4);
        pers.add(p5);
        pers.add(p6);

//        PersonaP12 [] p = (PersonaP12[]) pers.toArray();
//        
//        
//        for (int i = 0; i < p.length; i++) {
//            System.out.println(p[i].edad +" ");
//            
//        }
        mostrarSegundoMayor(pers);

    }

    public static void mostrarSegundoMayor(ArrayList<PersonaP12> pers) {
        int[] arr = new int[pers.size()];
        int i = 0;
        for (PersonaP12 per : pers) {

            arr[i] = per.altura;

            i++;

        }
        ordenar0(arr);

    }

    static boolean esMayorQue(int txt1, int txt2) {
        boolean resultado = false;

        if (txt1 > txt2) {
            resultado = true;

        } else {
            resultado = false;
        }

        return resultado;

    }

    static void ordenar0(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

               if (array[i] == array[j]) {
                    array[i] = 0;
                    array[j] = 0;
                }

            }

        }

        ordenar(array);

    }

    static void ordenar(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (esMayorQue(array[i], array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }

        }
        System.out.println(array[array.length-3]);
    }
   
}
