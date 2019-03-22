/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosier6;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
@FunctionalInterface
interface ManejarString {

    void manejar(String txt);
}

class Prueba1 {

    ManejarString estoEsUnAtributoQueGuardaUnaFuncion;
    int contador;
    boolean interruptor ;

    public Prueba1() {
        estoEsUnAtributoQueGuardaUnaFuncion = Prueba1::escribirHola;
        contador = 0;
        interruptor  = false;
    }

    static void escribirHola(String t) {
        System.out.println("Tú has dicho: " + t + " y yo digo: HOLA!!!");
    }

    static void escribirAdios(String t) {
        System.out.println("Adiós mundo cruel!!!!!! "
                + "( por cierto tú escribiste: " + t + ")");
    }

    void cambiarMetodo() {
       interruptor =!interruptor;
        if (interruptor) {
            estoEsUnAtributoQueGuardaUnaFuncion = Prueba1::escribirAdios;
        } else {
            estoEsUnAtributoQueGuardaUnaFuncion = Prueba1::escribirHola;
        }
    }
}

public class ExplicacionFuncionalInterfaceLlamarOtrosMetodos {

    public static void main(String[] args) {
        Prueba1 p = new Prueba1();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
        p.cambiarMetodo();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
        p.cambiarMetodo();
        p.estoEsUnAtributoQueGuardaUnaFuncion.manejar("it");
    }
}
