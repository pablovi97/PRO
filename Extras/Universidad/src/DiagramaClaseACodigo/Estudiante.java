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
public abstract class Estudiante extends Persona {

    Expediente expediente;

    public Estudiante(Expediente expediente, Dni dni, String nombre) {
        super(dni, nombre);
        this.expediente = expediente;
    }

    @Override
    public String toString() {
        return "Estudiante{" + expediente + super.toString();
    }

}
