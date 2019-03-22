/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

import java.util.Comparator;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class OperacionesMatematicas {

    /*
    static double func(double x) {
        return x * x;
    }
     */
    static boolean esMayorQue(String txt1, String txt2) {
        boolean resultado = false;
        boolean finalizar = false;
        for (int i = 0; !finalizar && i < txt1.length() && i < txt2.length(); i++) {
            if (txt1.charAt(i) > txt2.charAt(i)) {
                resultado = true;
                finalizar = true;
            } else if (txt1.charAt(i) > txt2.charAt(i)) {
                finalizar = true;
            }

        }
        return resultado;

    }
    public OperacionesMatematicas(){
        
    }

    static void ordenar(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (esMayorQue(array[i], array[j])) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    System.out.println(array[i]);
                } else if (array[i].charAt(1) < array[j].charAt(1)) {

                }

            }
        }

    }

    static double integrando(Integrable obj, double limInf, double limSup) {
        double suma = 0;
        double numeroRectangulos = 1000.0;
        double paso = (limSup - limInf) / numeroRectangulos;

        for (double x = 0; x <= limSup; x += paso) {
            double rectangulo = paso * obj.func(x);

            suma += rectangulo;

        }
        return suma;

    }

    public static void main(String[] args) {
        //CLASES ANONIMAS
        /*

        Integrable ff = new Integrable() {
            @Override
            public double func(double x) {
                return x;
            }

        };
        double resultado = OperacionesMatematicas.integrando(ff, 0, 1);
        System.out.println(resultado);
        Integrable ff2 = new Integrable() {
            @Override
            public double func(double x) {
                return x * x;
            }

        };
        double resultado1 = OperacionesMatematicas.integrando(ff2, 0, 1);
        System.out.println(resultado1);
         */
        
        ///LAMBDAS
        // lo de abajo se puede comvertir en esto (lo castea): Comparator c = (Comparator<Integer>) (Integer o1, Integer o2) -> o1-o2;
        // en una clase anonima puedes meter muchos metodos y usar this en la lambda NO
        // lambdas solo funciona cuando en una clase anonima hay un metodo y sin atributos

       Comparator c = new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1-o2;
           }
          
           public void imprimir(){
               System.out.println(" hola amigos");
           }
       };
       
        OperacionesMatematicas om = new OperacionesMatematicas();

        String[] array = {"pepe", "auan", "carlos", "mango", "maracaton"};
        om.ordenar(array);

        System.out.println(OperacionesMatematicas.esMayorQue("ahola", "hadios"));

    }
}

interface Integrable {

    double func(double x);
}

class CalcularIntegral implements Integrable {

    @Override
    public double func(double x) {
        return x;//hay que crear una clase para cada funcion  
    }

}
