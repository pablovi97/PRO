/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public abstract class Persona {
    Dni dni;
    String nombre;

    public Persona(Dni dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return  ""+dni + ", nombre=" + nombre + "}" ;
    }
    
    
}
