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
public class Coche {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isFrenoMano() {
        return frenoMano;
    }

    public void setFrenoMano(boolean frenoMano) {
        this.frenoMano = frenoMano;
    }

    public int getPosicion() {
        return posicion;
    }

    /*
    Práctica 8: Crear la clase Coche que tenga por atributos: String nombre, boolean
    encendido, boolean frenoDeManoPuesto, int posicion. Con un constructor que reciba el
    nombre: Coche(String n) y otro constructor que reciba el nombre y la posicion:
    Coche(String n, int p) Establecer los getter y los setter
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    private String nombre;
    private boolean encendido;
    private boolean frenoMano;
    private int posicion;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    private String marca = "";

    /*
     Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
     */
    @Override
    public String toString() {
        String resultado;

        resultado = nombre + " : " + ((encendido) ? " encendido " : " apagado ")
                + ((frenoMano) ? " freno puesto " : " freno quitado ") + " pos :" + posicion;
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

    public Coche(String nombre, int posicion, String marca) {
        this.nombre = nombre;
        this.encendido = false;
        this.frenoMano = false;
        this.posicion = posicion;
        this.marca = marca;
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

    public static void main(String[] args) {

    }

}

class cocheSEAT extends Coche {

    /*
        Práctica 8: Tomando la clase Coche con atributos marca, modelo, potencia, puertas,
matricula Crear la clase CocheSEAT Los modelos de esta marca siempre empezarán por
“se-” agregando ese texto siempre al modelo que se le pase al constructor o al setter ( salvo
que ya se le esté pasando, cosa que se debe validar )
Observar que el atributo marca en coche no tiene mucho sentido que sea heredado por
CocheSEAT
     */
    String marca = "SEAT";

    public void setMarca() {

        super.setMarca(this.marca); //To change body of generated methods, choose Tools | Templates.
    }

    public cocheSEAT(String nom) {
        if ("se-".equals(nom.substring(0, 2))) {
            super.setNombre(nom);
        } else {
            String marc = "se-" + nom;
            super.setNombre(marc);
        }

    }

    public static void main(String[] args) {
        cocheSEAT cs = new cocheSEAT("leon");

        System.out.println(cs.toString());

    }

}
