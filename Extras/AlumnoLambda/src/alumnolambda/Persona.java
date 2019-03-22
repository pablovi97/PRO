/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

/**
 *
 * @author carlos
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido1;

    protected int edad;
    protected int alturaEnCm;
    protected double pesoEnKg;
    
    public Persona(String nombre, String ape1, int edad, int altura, double peso){
        this.nombre = nombre;
        this.apellido1 = ape1;

        this.edad = edad;
        this.alturaEnCm = altura;
        this.pesoEnKg = peso;
    }
    
    public String toString(){
        String imc = String.format("%.3f", imc());
        return nombre + " " + apellido1 + " edad: " + edad + " altura: " 
                + alturaEnCm + "cm  peso: " + pesoEnKg + "kg"
                + " imc: " + imc;
    }

    
    protected double imc(){
        return pesoEnKg / Math.pow( alturaEnCm/100.0,2);
    }
    
    abstract double calcularPesoIdeal();

}
