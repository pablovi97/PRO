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
public class cola<T> {

    //hacer una cola circular TAREA
    //ultimo++
    //ultimo%=siguiente
    T dato[];
    final int size = 6;
    int siguiente;
    int ultimo;

    public cola() {
        dato = (T[]) new Object[size];
        this.ultimo = 0;
        this.siguiente = 0;

    }

    public void push(T num) throws Exception {
        //Errores PUSH con cola llena y pop con cola vacia 
       //(ultimo+1)%arr.leght = siguiente para saber el ultimo
        if (ultimo == size) {
            ultimo++;
            ultimo %= siguiente;
            dato[ultimo] = num;

        } else {
            dato[ultimo] = num;
            this.ultimo++;
        }

    }

    public void mostrarArray() {
        System.out.print("[ ");
        for (int i = 0; i < dato.length - 1; i++) {
            System.out.print(dato[i] + ", ");
        }
        System.out.print(dato[dato.length - 1] + " ]");
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

    public static void main(String[] args) throws Exception {
        cola cl = new <String>  cola();
        cl.push("david");
        cl.push("pepe");
        cl.push("cuartero");
       cl.mostrarArray();
        cl.push("juan");
        cl.push("estevez");
        System.out.println(cl.pop());
       cl.mostrarArray();
        cl.push("koke");
        cl.push("pepo");
        System.out.println(cl.pop());
        cl.mostrarArray();
        System.out.println(cl.pop());
        cl.mostrarArray();

    }

}
