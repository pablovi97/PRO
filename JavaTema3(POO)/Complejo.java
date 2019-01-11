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
public class Complejo {
    /*Práctica 15: Crea la clase Complejo que sirva para utilizar números complejos. Estos
     números disponen de una parte real y una parte imaginaria ( atritubos double real, double
     imag ) Dispondrá de tres constructores:
     Complejo(double real, double imag)
     Complejo(double real) → aquí se establecerá la parte imaginaria a 0
     Complejo() → aquí se establecerán tanto la parte real como la imaginaria a 0
     */

    double real;
    double imag;
/**
 * no hace falta introducir nada
 */
    public Complejo() {
        this(0, 0);
    }
/***
 * introduce un numero real y uno imaginario
 * @param real
 * @param imag 
 */
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
/***
 * introduce solo un numero real
 * @param real 
 */
    public Complejo(double real) {
        this(real, 0);
    }
/***
 * Se sumaran los numeros complejos como static de esta manera 
 *  double x = c1.real + c2.real;
    double y = c1.imag + c2.imag;
    * y retornara su resultado
 * @param c1
 * @param c2
 * @return 
 */
    public static Complejo suma(Complejo c1, Complejo c2) {
        double x = c1.real + c2.real;
        double y = c1.imag + c2.imag;
        return new Complejo(x, y);
    }
/***
 *  Se sumaran los numeros complejos de esta manera 
 *  double x = c1.real + c2.real;
 *   double y = c1.imag + c2.imag;
 * y retornara su resultado
 * @param n1
 * @param n2
 * @return 
 */
    public Complejo suma(double n1, double n2) {
        double x = n1 + n1;
        double y = n2 + n2;
        return new Complejo(x, y);
    }
/***
 * se multiplicaran los numeros complejos como metodo estatico de esta manera
 *    double x = c1.real * c2.real - c1.imag * c2.imag;
        double y = c1.real * c2.imag + c1.imag * c2.real;
 * @param c1
 * @param c2
 * @return 
 */
    public static Complejo multiplicar(Complejo c1, Complejo c2) {
        double x = c1.real * c2.real - c1.imag * c2.imag;
        double y = c1.real * c2.imag + c1.imag * c2.real;
        return new Complejo(x, y);
    }
    /***
     * se multiplicaran los numeros complejos de esta manera
     *  double x = c1.real * c2.real - c1.imag * c2.imag;
     * double y = c1.real * c2.imag + c1.imag * c2.real;
     * @param n1
     * @param n2
     * @return 
     */
    public static Complejo multiplicar(double n1, double n2) {
        double x = n1 * n2 - n1 * n2;
        double y = n1 * n2 + n1 * n2;
        return new Complejo(x, y);
    }


    /*
     Práctica 16: Crear un constructor de copia para la clase Camion de la práctica 14 y un
     constructor de copia para la clase Complejo de la práctica 15
     */
    public void equals(Complejo cm) {

        if (this.imag == cm.imag) {
            System.out.println("las partes imaginarias son iguales");

        } else if (this.imag != cm.imag) {
            System.out.println("las partes imaginarias son distintas");
        }
        if (this.real == cm.real) {
            System.out.println("las partes reales son iguales");
        } else if (this.real != cm.real) {
            System.out.println("las partes reales son distintas");

        }

    }
/***
 * constructor de copia
 * @param complejo 
 */
    public Complejo(Complejo complejo) {
        this.real = complejo.real;
        this.imag = complejo.imag;

    }

    @Override
    public String toString() {
        return "el numero real es " + real + " y el imaginario " + imag;
    }
}
