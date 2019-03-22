/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier6;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Persona {

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona(){
        
    }

    public String getNombre() {
        return nombre;
    }

    /*
    Práctica 2: Poner los atributos de la clase persona a private. Tratar de acceder desde la
    clase Alumno a esos atributos que antes heredaba. Toma captura de pantalla de los mensajes
    del IDE. Para ello, por ejemplo, puedes crear un método en alumno y llamar a this.nombre
    desde el método.
     */
    public String getApellidos() {
        return apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void imprimirDatos(){
        System.out.println("nombre : " +nombre+"| apellidos : "+apellidos);
    }

    protected String nombre;
    protected String apellidos;

    /*
    Práctica 1: Crear una clase Profesor, que hereda de Persona y contará con atributos como
nombre, apellidos, salario y especialidad
     */
    public static void main(String[] args) {
/*
               /*
        Práctica 6: Crear un método: void imprimirDatos() en Persona que mostrará en pantalla
todos los atributos de Persona. Sobreescribir el método en Alumno y que haga uso de
super.imprimirDatos()
        */
Alumno al = new Alumno("pepe","castro");
al.imprimirDatos();
        
    }

}

class Profesor extends Persona {
    /*
    Práctica 1:  Crear una clase Profesor, que hereda de Persona y contará con atributos como nombre, apellidos, salario y especialidad
    */

    public Profesor(double salario, String especialidad, String nombre, String apellidos) {
        super(nombre, apellidos);//llama al construcotor padre
     
        this.salario = salario;
        this.especialidad = especialidad;
    }

    double salario;
    String especialidad;

  

    public Profesor(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

}
  enum curso {
        daw1,
        daw2,
        asir1,
        asir2,
        dam1,
        dam2,
        dam3
    }

class Alumno extends Persona {

    String curso;
    double notaMedia;

    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("se ha sobreescrito");
    }
    public Alumno(){
        
    }
   
     public void ponerNombre(String nombre) {
        this.nombre = nombre;
        System.out.println(this.nombre);
    }
    
    public Alumno(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

}
