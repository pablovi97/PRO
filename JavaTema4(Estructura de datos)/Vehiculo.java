/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author pablo
 */
public class Vehiculo <T> {
     /*
    Práctica 24: Crear una clase Vehiculo con atributos: int numeroRuedas , double potencia y
    T identificador Este identificador pudiera ser como una matrícula ( String ) o un código
    numérico ( double, int,… ) o cualquier otro tipo. Debe tener como mínimo los getter y setter
     */

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public double getPotencia() {
        return potencia;
    }

   
    public T getIdentificador() {
        return identificador;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setIdentificador(T identificador) {
        this.identificador = identificador;
    }

    
    int numeroRuedas;
    double potencia;
    T identificador;
    
}
