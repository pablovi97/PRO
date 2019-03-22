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
public interface OrdenableP17<T> {
    /*
    Crear la interfaz: Ordenable e incluir como métodos: boolean
esMayorQue() , esMenorQue(), esIgualQue() Implementar el interfaz en la clase Persona
(tomaremos la clase abstracta que ya hemos usado en esta unidad ) ¿ qué ocurre en el IDE
cuándo escribimos: Persona implements Ordenable ? ( tomar captura de pantalla )
mediante alt+enter hacer el override

    */
 boolean esMayorQue(T object);
  boolean esMenorQue(T object);
   boolean esIgualQue(T object);
   

}

