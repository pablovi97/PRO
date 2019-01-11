/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

/**
 *
 * @author pablo
 */
public class Perro {

    public Perro(String n, String r, int e) {
        nombre = n;
        raza = r;
        edad = e;
    }

    public Perro(String n, String r) {
        nombre = n;
        raza = r;
        edad = -1;
    }
    
    public Perro(String n){
        nombre = n;
        raza="desconocido";
         edad = -1;
    }

    String nombre;
    String raza;
    int edad;
  
       /*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
    */
    @Override
    public String toString (){
        String mensaje="El perro se llama "+nombre+ " con la raza " +raza +" y la edad de " +edad ;
                
        return mensaje;
    }
   

}
