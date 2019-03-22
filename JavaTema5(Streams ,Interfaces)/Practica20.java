/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

/**
 *
 * @author pablo
 */
public class Practica20 {

    public static void main(String[] args) {
        /*
         Crear un pequeño programa con un array de Ordenable:
Ordenable array[] = new Ordenable[2];
donde apuntemos a un Hombre o Mujer y a una Fraccion
Recorrer el array y mediante un condicional con instanceof haremos que:
si el elemento es de tipo Fraccion se comparará con la Fraccion: 4/5 y se mostrará cuál es
mayor en pantalla.
Si el elemento es Persona se comparará con la Mujer: Mujer(“Ana”,”Po”,”Ro”,20,165,60)
y se mostrara cuál es mayor en pantalla
         */

        OrdenableP17 array[] = new OrdenableP17[3];

        array[0] = new Hombre1("Juan", "quintero", "machado", 28, 160, 43);
        array[1] = new Mujer1("Juana", "quintero", "machado", 18, 130, 53);
        array[2] = new Fraccion(8, 5);

        ImprimirEnMayusculas<  OrdenableP17> iem = new ImprimirEnMayusculas<  OrdenableP17>() {
            @Override
            public void imprimirMayuscula(OrdenableP17 obj) {
                String val = obj.toString();
                System.out.println(val.toUpperCase());
            }
        };

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Persona12) {
                if (array[i].esMayorQue(new Mujer1("ana", "pe", "po", 20, 165, 60))) {
                    System.out.println("array[i]");
                    iem.imprimirMayuscula(array[i]);
                }
            } else {

                if (array[i].esMayorQue(new Fraccion(4, 5))) {
                    System.out.println(array[i]);
                    iem.imprimirMayuscula(array[i]);
                }

            }

        }

    }

}

interface ImprimirEnMayusculas<T> {
//    Práctica 21: Crear la interfaz ImprimirEnMayuscula<T> que incluya el método:
//void imprimirMayuscula(T objeto) y probarlo con el código anterior. Tomar captura de
//pantalla de ese trozo de código y la ejecución


    void imprimirMayuscula(T object);
}
