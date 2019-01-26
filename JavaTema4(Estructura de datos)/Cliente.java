/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author Pablo viera Martín
 * @param <T>
 */
public class Cliente<T> {

    /*
    Práctica 13: Crear un programa para la gestión de clientes. Al usuario se le mostrará un
menú donde pueda elegir entre agregar nuevo cliente a la cola, atender cliente, ver estado de
la cola.
Crear una clase Cliente con: nombre, apellido, edad y un método: boolean menorDeEdad()
que determina si el clientes es o no menor de edad. Cuando el usuario intenta agregar un
nuevo cliente al final de la cola, si fuera menor de edad se usa el método y no se incorpora a
la cola mostrando un mensaje al usuario diciendo los datos del cliente que se iba a insertar
en cola y que no puede agregar a menores de edad.
Cuando el usuario elige atender cliente se toma el próximo elemento que corresponda en la
cola quitándolo de la cola y se muestra en pantalla
Cuando el usuario escoge ver estado de la cola se le muestra el tamaño actual de la cola
( método size() )
     */
    String nombre;
    String apellido;
    int edad;
    T dato[];
    final int size = 6;
    int siguiente;
    int ultimo;

    public Cliente(String nom, String ape, int edad) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
    }

    public T pop() throws Exception {

        if (siguiente == ultimo) {
            throw new Exception("cola vacia");
        } else {
            T resultado = dato[siguiente];
            siguiente++;
            return resultado;
        }
    }

    public void mostrarArray() {
        System.out.print("[ ");
        for (int i = 0; i < dato.length - 1; i++) {
            System.out.print(dato[i] + ", ");
        }
        System.out.print(dato[dato.length - 1] + " ]");
    }

    public void push(T cliente) {
        boolean resultado = true;
        if (ultimo >= size) {
            if (menordeEdad()) {
                System.out.println("no se puede introducir porque es menor de edad");
            } else {
                ultimo++;
                ultimo %= siguiente;
                dato[ultimo] = cliente;
            }

        } else {
            if (menordeEdad()) {
                System.out.println("no se puede introducir porque es menor de edad");
            } else {
                dato[ultimo] = cliente;
                this.ultimo++;
            }
        }

    }

    public boolean menordeEdad() {
        /**
         * si retorna true es que es menor de edad
         */
        boolean resultado = false;

        if (this.edad < 18) {
            resultado = true;
        }
        return resultado;

    }

    public static void main(String[] args) throws Exception {
        Cliente cl = new <String> Cliente("gonzalo", "castaño", 23);

        cl.push("gonzalo");

    }
}
