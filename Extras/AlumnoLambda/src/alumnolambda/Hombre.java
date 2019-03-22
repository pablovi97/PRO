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
public class Hombre extends Persona {
    
    boolean tieneBarba;

    public Hombre(String nombre, String ape1, int edad, int altura, double peso) {
        super(nombre, ape1, edad, altura, peso);
        tieneBarba=true;
    }

    
    public String toString(){
        return "hombre: "+super.toString() + " peso ideal: " + calcularPesoIdeal();
    }
    
    
    @Override
    double calcularPesoIdeal() {
        double A = alturaEnCm;
        double E = edad;
        double k = 4.0;
        return A - 100 - ( ( A - 150 ) / 4.0 ) +  (( E - 20 ) / k );
 
        
    
    }
    
 
}
