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
public class Fraccion {

    int numerador;
    int denominador;

    public Fraccion() {

    }

    public Fraccion(int numerador) throws Exception {
        this(numerador, 1);
    }

    public Fraccion(int numerador, int denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("no es posible esa fraccion");
        } else {
            int mcd = mcd(numerador, denominador);
            this.numerador = numerador / mcd;
            this.numerador = denominador / mcd;
        }
    }

    @Override
    public String toString() {
        return numerador + " / " + denominador;
    }

    public double toDouble() {
        return numerador / (double) denominador;
    }

    public boolean equals(Fraccion frac) {
        return this.toDouble() == frac.toDouble();
    }

    public static Fraccion suma(Fraccion fraccion1, Fraccion fraccion2) throws Exception {
        int sumadem = fraccion2.denominador * fraccion1.denominador;
        int sumanum = fraccion1.numerador * fraccion2.denominador + fraccion1.denominador * fraccion2.numerador;
        Fraccion resultante = new Fraccion(sumanum, sumadem);
        return resultante;

    }

    public static Fraccion opuesto(Fraccion fr) throws Exception {
        return new Fraccion(-1 * fr.numerador, fr.denominador);
    }

    public Fraccion suma(Fraccion fr) throws Exception {
        return suma(this, fr);
    }

    public Fraccion resta(Fraccion fraccion2) throws Exception {
        return this.suma(opuesto(fraccion2));
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static Fraccion multiplicacion(Fraccion fr1, Fraccion fr2) throws Exception {
        return new Fraccion(fr1.numerador * fr2.numerador, fr1.denominador * fr2.denominador);
    }

    public Fraccion inverso() throws Exception {
        return new Fraccion(this.denominador, this.numerador);
    }

    public static Fraccion division(Fraccion fr1, Fraccion fr2) throws Exception {
        return multiplicacion(fr1, fr2.inverso());

    }

    public boolean mayorque(Fraccion fr2) {
        boolean resultado = false;
        if (this.toDouble() > fr2.toDouble()) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    public boolean menorque(Fraccion fr2) {
        boolean resultado = false;
        if (this.toDouble() < fr2.toDouble()) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

}
