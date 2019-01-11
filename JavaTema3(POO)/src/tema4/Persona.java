/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Persona {
    /*public Persona(){
        nombre = null;
        apellido=null;
        edad=0;
    }*/
    public static void inicio(){
        System.out.println("bueaaah!!");
    }
    
    public Persona(String nom, String ape, int ed){
        nombre = nom;
        apellido = ape;
        edad =(int)Math.abs(ed);
                
        
    }
    
    
    
    private String nombre;
    private String apellido;
    private int edad;

    public void setEdad(int edad) {
        if(edad >0)
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String mostrarInfo(){
        return nombre+" "+apellido+" "+edad;
    }
    
}
