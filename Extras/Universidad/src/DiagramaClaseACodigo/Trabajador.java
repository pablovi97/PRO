/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagramaClaseACodigo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Kevin Hernández García <kevinhg94@gmail.com>
 */
public class Trabajador extends Persona{
    Date fechaInicio;
    Universidad universidad;

    public Trabajador(String fechaInicio, Dni dni, String nombre, Universidad uni) throws ParseException {
        super(dni, nombre);
        this.universidad = uni;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.fechaInicio = sdf.parse(fechaInicio);
        this.universidad.agregarTrabajador(this);
    }

    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Trabajador{" + "fechaInicio= " + sdf.format(fechaInicio) + super.toString();
    }
    
}
