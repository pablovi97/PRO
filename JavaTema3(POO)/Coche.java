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
public class Coche {

    /*
    Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
Coche(String n, int p) Establecer los getter y los setter
     */
    private String nombre;
    private boolean encendido;
    private boolean frenoMano;
    private int posicion;
        /*
     Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
     */
    
    @Override
    public String toString(){
        String resultado;
        
        resultado = nombre +" : "+ ((encendido)?" encendido ":" apagado ") +
                ((frenoMano)?" freno puesto ": " freno quitado ") +" pos :"+posicion;
       return resultado;
    }

    public Coche() {
        this("anonimo");
    }

    public Coche(String nombre) {
        this(nombre, 0);
    }

    public Coche(String nombre, int posicion) {
        this.nombre = nombre;
        this.encendido = false;
        this.frenoMano = false;
        this.posicion = posicion;
    }

    public String encender() {
        String respuesta = "";
        if (encendido) {
            //sol
            respuesta = "me haces daño , no se enciende ";
        } else {
            encendido = true;
            respuesta = "encender ok";
        }
        return respuesta;
    }

    public String quitarFrenoMano() {
        String respuesta = "";
        if (frenoMano) {
            frenoMano = false;
            respuesta = "el frenomano esta puesto";
        } else {
           
            respuesta = "el freno mano esta quitado";
        }
        return respuesta;

    }

    public String ponerFrenoMano() {
        String respuesta = "";
        if (!frenoMano) {
            frenoMano = true;
            respuesta = "el frenomano esta puesto";
        } else {

            respuesta = "el freno mano esta quitado";
        }
        return respuesta;

    }

    public String apagar() {
        String respuesta = "";
        if (!encendido) {
            respuesta = "el coche esta encendido";
        } else {
            respuesta = "el coche no esta encendido";
        }
        return respuesta;
    }

    public String moverIzquierda(int pasos) {
        String respuesta = nombre +"";
        if (!this.encendido) {
            respuesta = "el coche esta apagado no se puede mover";
        } else if (this.frenoMano) {
            respuesta = "freno mano puesto no se puede mover .Cocje se apaga";
            encendido = false;
        } else if (this.posicion - pasos < 0) {
            this.posicion = 0;
            respuesta = "llegamos al limite no puedo avanzar";
        } else {
            this.posicion -= pasos;
            respuesta = "ok avanzo hasta : " + this.posicion;
        }
        return respuesta;
    }
     public String moverDerecha(int pasos) {
        String respuesta = nombre + "";
        if (!this.encendido) {
            respuesta = "el coche esta apagado no se puede mover";
        } else if (this.frenoMano) {
            respuesta = "freno mano puesto no se puede mover .Cocje se apaga";
            encendido = false;
        } else if (this.posicion + pasos > 100) {
            this.posicion = 0;
            respuesta = "llegamos al limite no puedo avanzar";
        } else {
            this.posicion += pasos;
            respuesta = "ok avanzo hasta : " + this.posicion;
        }
        return respuesta;
    }
 
    

}
