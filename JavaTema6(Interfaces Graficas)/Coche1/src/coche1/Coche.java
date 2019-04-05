/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche1;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Coche implements Posicionable {

    /*
    Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
Coche(String n, int p) Establecer los getter y los setter
     */
    protected String nombre;
    protected boolean encendido;
    protected boolean frenoMano;
    protected Punto posicion;
    protected boolean limite;
    protected Escenario escenario;
    protected int Radio;

    public String toString() {
        String resultado;

        resultado = nombre + " : " + ((encendido) ? " encendido " : " apagado ")
                + ((frenoMano) ? " freno puesto " : " freno quitado ") + " pos :" + posicion;
        return resultado;
    }

    public Coche(String nombre, double x, double y , Escenario escenario ,int Radio) {
        this.nombre = nombre;
        this.encendido = false;
        this.frenoMano = false;
        this.posicion = new Punto(x, y);
        this.escenario = escenario;
        this.Radio=Radio;
        
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
        
        String respuesta = nombre + "";
        if (!this.encendido) {
            respuesta = "el coche esta apagado no se puede mover";
        } else if (this.frenoMano) {
            respuesta = "freno mano puesto no se puede mover .Cocje se apaga";
            encendido = false;
        } else if (this.posicion.x - pasos < escenario.psup.x) {
            this.posicion = escenario.puntoDentro(this.posicion);
            respuesta = "llegamos al limite no puedo avanzar";
            limite = true;
        } else {
            this.posicion.x -= pasos;
            respuesta = "ok avanzo hasta : " + this.posicion;
        }
        return respuesta;
    }

    public String moverArriba(int pasos) {
        String respuesta = nombre + "";
        if (!this.encendido) {
            respuesta = "el coche esta apagado no se puede mover";
        } else if (this.frenoMano) {
            respuesta = "freno mano puesto no se puede mover .Cocje se apaga";
            encendido = false;
        } else if (this.posicion.y - pasos < escenario.psup.y) {
             this.posicion = escenario.puntoDentro(this.posicion);
            respuesta = "llegamos al limite no puedo avanzar";
            limite = true;
        } else {
            this.posicion.y -= pasos;
            respuesta = "ok avanzo hasta : " + this.posicion;
        }
        return respuesta;
    }

    public String moverAbajo(int pasos) {
        String respuesta = nombre + "";
        if (!this.encendido) {
            respuesta = "el coche esta apagado no se puede mover";
        } else if (this.frenoMano) {
            respuesta = "freno mano puesto no se puede mover .Cocje se apaga";
            encendido = false;
        } else if (this.posicion.y + pasos >= escenario.pinf.y) {
             this.posicion = escenario.puntoDentro(this.posicion);
            respuesta = "llegamos al limite no puedo avanzar";
            limite = true;
        } else {
            this.posicion.y += pasos;
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
        } else if (this.posicion.x + pasos >= escenario.pinf.x) {
            
            this.posicion = escenario.puntoDentro(this.posicion);
            respuesta = "llegamos al limite no puedo avanzar";
            limite = true;
        } else {
            this.posicion.x += pasos;
            respuesta = "ok avanzo hasta : " + this.posicion;
        }
        return respuesta;
    }
    


}
