/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Pablo viera Martín
 */
public class Profesor {

    /*
    Práctica 7: Define una clase Profesor con atributos: nombre (String), apellidos (String),
edad (int), soltero (boolean), especialista (boolean). Define un constructor que reciba los
parámetros necesarios para la inicialización y otro constructor que no reciba parámetros.
Crea los métodos getter y setter para poder establecer y obtener los valores de los atributos.
     */
    public Profesor() {

    }

    public Profesor(String nom, String ape, int ed, boolean solt, boolean esp) {
        if (ed > 0) {
            edad = ed;
        }
        nombre = nom;
        apellido = ape;
        soltero = solt;
        especialista = esp;

    }
    String nombre;
    String apellido;
    int edad;
    boolean soltero;
    boolean especialista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String ape) {
        this.apellido = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        this.edad = ed;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean solt) {
        this.soltero = solt;
    }

    public boolean isEspecialista() {
        return especialista;
    }

    public void setEspecialista(boolean esp) {
        this.especialista = esp;
    }

    public void profesorDatos() {
        System.out.println(nombre + " tiene " + "" + edad + " años " + " su estado civil de soltero es " + soltero + ""
                + " y ahora " + especialista + " es especialista");

    }
    
     /*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
    */
    @Override
    public String toString (){
      return nombre + " tiene " + "" + edad + " años " + " su estado civil de soltero es " + soltero + ""
                + " y ahora " + especialista + " es especialista";
    }

}
