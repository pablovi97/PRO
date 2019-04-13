/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Pablo Viera
 */
public class Ahorcado {

    /*
    LinkedHashMap<Integer, Partida> part;

    public Ahorcado() {

        part = new LinkedHashMap<>();
    }

    private int i = 0;

    public Partida nuevaPartida(String nombre_user) {

        Partida p = new Partida(nombre_user);
        part.put(i++, p);
        return p;

    }

    public String listarPartidas() {
        String resultado = "";
        for (Partida value : part.values()) {
            resultado += part.keySet().toString() + "  " + value + "\n";
        }
        return resultado;
    }


    public Partida obtenerPartida(int num) {
        Partida p = null;
        if (part.get(num) != null) {
            p = (Partida) part.values();
        } else {
            System.out.println("no hay partida con ese numero");
        }
        return p;
    }
     */
    String resultado = "";
    String palabra;
    String palabra_adiv;
    String Error = "";
    char[] letras;
    char[] letrasguion;
    int fallos = 0;
    int aciertos = 0;
    int oportunidades = 7;
    HashSet<String> Error1;

    public Ahorcado() {

        Random rnd = new Random();
        String[] array = {"arbol", "conejo", "aveztruz", "planta", "cobaya"};

        this.palabra = array[rnd.nextInt(5) - 0];
        Error1 = new HashSet<>();

    }

    /*
        public String resumenSituacionJuego() {
            return this.palabra_adiv + ". Intentos fallidos : " + this.fallos + " Errores : " + this.Error;

        }

     */
    public boolean JuegoActivo() {
        boolean resultado = false;

        if (this.fallos < 7) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;

    }

    public void reiniciarPartida() {
        Random rnd = new Random();
        String[] array = {"arbol", "conejo", "aveztruz", "planta", "cobaya"};

        // this.letras = {};
         //this.letrasguion = {};
       this.fallos = 0;
        this.aciertos = 0;
        this.oportunidades = 7;
        this.palabra = array[rnd.nextInt(5) - 0];
        Error1 = new HashSet<>();
    }

    public int OportunidadesRestantes() {

        int oportunidad = oportunidades - fallos;
        return oportunidad;
    }

    public char[] ocultarPalabra() {
        letras = this.palabra.toCharArray();
        letrasguion = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letrasguion[i] = '-';
        }
        return letrasguion;
    }

    public char[] apostarLetra(char letra) {
        boolean res = false;
        for (int j = 0; j < letras.length; j++) {
            if (letra == letras[j]) {
                aciertos++;

                letrasguion[j] = letra;
                res = true;
            }

        }
        if (!res) {
            this.Error += letra + " ";
            Error1.add(String.valueOf(letra));
            this.fallos++;
        }
        return letrasguion;

    }

    public String enseñarFallos() {
        String res = "";
        for (String s : Error1) {
            res += s + " ";
        }
        return res;
    }

    public String resultado() {
        String resultado = "";
        if (this.fallos > 5) {

            if (aciertos == this.palabra.length()) {
                resultado = "HAS ACERTADO LA PALABRA :" + this.palabra;

                this.resultado = "GANASTE!";
            } else if (aciertos > 0) {
                resultado = "has tenido " + aciertos + " aciertos" + this.palabra_adiv;

            } else {
                resultado = "no has tenido ningun acierto";
            }
        } else {
            resultado = "HAS PERDIDO!";
        }

        return resultado;

    }

}
