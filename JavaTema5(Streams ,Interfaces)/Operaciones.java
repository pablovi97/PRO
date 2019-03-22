/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Operaciones {

    public static Object sumar(ArrayList arr, Sumable s) {
        Object acumulado = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            acumulado = s.suma(acumulado, arr.get(i));

        }
        return acumulado;
    }

    public static Object reducir(ArrayList arr, Reducible s) {
        Object acumulado = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            acumulado = s.reducible(acumulado, arr.get(i));

        }
        return acumulado;
    }

    public static ArrayList filtrar(ArrayList arr, Filtrable f) {
        ArrayList res = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (f.filtrar(arr.get(i))) {

                res.add(arr.get(i));

            }

        }
        return res;

    }

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
        /*
        OPERACIONES CON LAMBDAS
         */
        System.out.println("Edad de las personas");
        ArrayList<PersonaP12> pper = Operaciones.filtrar(pers, p ->  ((PersonaP12)p).edad > 18);
        System.out.println(pper);
        System.out.println("________________");
        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.add(1);
        enteros.add(3);
        enteros.add(6);
        enteros.add(4);
        enteros.add(7);
        enteros.add(9);
        System.out.println("menor de 4");
        ArrayList<Integer> ress = Operaciones.filtrar(enteros, p -> (int) p < 4);
        System.out.println(ress);
        System.out.println("____________");

        System.out.println("enteros");
        ArrayList<Integer> ress1 = Operaciones.filtrar(enteros, p -> (int) p % 2 == 0);
        System.out.println(ress1);
        System.out.println("___________________");

        System.out.println("Strings");
        String[] cadena = {"hola", "adios", "pepe", "andres", "antonio", "auan"};
        ArrayList<String> laCadena = new ArrayList<>(Arrays.asList(cadena));
        ArrayList<String> ress2 = Operaciones.filtrar(laCadena, p -> ((String) p).charAt(0) == 'a');
        System.out.println(ress2);

//        pers.add(p1);
//        pers.add(p2);
//        pers.add(p3);
//        pers.add(p4);
//        pers.add(p5);
//        pers.add(p6);
        Sumable sum = new Sumable<Integer>() {
            @Override
            public Integer suma(Integer o1, Integer o2) {
                return 01 + 02;

            }

        };

        //  System.out.println(Operaciones.sumar(enteros, sum));
        // Operaciones.sumar(pers ,(e1,e2)->e1+e2);
//       
//       String [] cadena ={"23","33","56"};
//       
//       Sumable st =(Sumable<String>)(String o1, String o2) ->o1+o2;  //en la lambda lo de los parentesis es lo que le das y lo de despues de las flechas lo que devuelve 
//       ArrayList<String> laCadena = new ArrayList<>(Arrays.asList(cadena));
//       Sumable sum1= new Sumable<String>(){
//             @Override
//             public String suma(String o1, String o2) {
//                 return 01+02;
//                 
//         }
//    
//};
//       
//    Operaciones.sumar(laCadena, )
        Reducible rd = (Reducible<String>) (String o1, String o2) -> o1 + o2;

        Reducible red3 = new Reducible<Integer>() {
            @Override
            public Integer reducible(Integer o1, Integer o2) {
                int resultado;
                if (o1 > o2) {
                    resultado = o1;
                } else {
                    resultado = 02;
                }
                return resultado;

            }

        };

        // System.out.println(Operaciones.reducir(enteros, red3));
    }

}

interface Sumable<T> {

    T suma(T o1, T o2);
}

interface Reducible<T> {

    T reducible(T o1, T o2);
}

interface Filtrable<T> {

    boolean filtrar(T o1);
    /*
    static ArrayList filtrar(ArrayList arr ,Filtrable s){
      ArrayList res = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (f.filtrar(arr.get(i))) {

                res.add(arr.get(i));

            }

        }
        return res;

    }

    
    */
}
