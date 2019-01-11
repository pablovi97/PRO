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
public class Camion {

    /*
    Práctica 12: Completar la clase Camion con varios constructores. Uno para cuando no se
    le pasan paramentros, otro para únicamente la marca, otro con todos,… Se deberá usar la
    palabra reservada this para cada vez que nombremos un atributo en los constructores o en
    los métodos
     */
    /*
    Práctica 14: Modifica la clase Camion de la práctica 12 de tal forma que los diferentes
constructores se apoyen en uno solo haciendo uso de: this() 
    */
    public Camion(int ancho, int largo, String marca, String matricula, int velmax) {
        this.ancho = ancho;
        this.largo = largo;
        this.marca = marca;
        this.matricula = matricula;
        this.velmax = velmax;
    }
    public Camion(){
        this(0,0,null,null,0);
    }
    public Camion(String marca){
        
        this(0,0,marca,null,0);
        
        
    }
    /*
    Práctica 16: Crear un constructor de copia para la clase Camion de la práctica 14 y un
constructor de copia para la clase Complejo de la práctica 15
    */
    public Camion(Camion camion){
          this.ancho = camion.ancho;
        this.largo = camion.largo;
        this.marca = camion.marca;
        this.matricula = camion.matricula;
        this.velmax = camion.velmax;
    }
    
/*
    Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
    */
    @Override
   public String toString (){
        String mensaje="el camion es de la marca"+ marca + " con un ancho de " + ancho+ "m"+ " y un largo de" +largo + "con matricula"+ matricula +" y velocidad maxima de " +velmax +"KM/h";
        return mensaje;
    }
    int ancho;
    int largo;
    String marca;
    String matricula;
    int velmax;
}
