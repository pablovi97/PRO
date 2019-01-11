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
public class Conversor {

    /*
    PRACTICA4
    Crear la clase: Conversor Esta clase sirve para cambiar de euros a dolares y de
dolares a euros. Tiene un constructor que recibe el tipo de cambio (utilizar el cambio actual)
Pongamos por ejemplo: 0.8615 y tiene dos métodos: euroToDolar() y dolarToEuro() que
reciben un double que representa respetivamente euros y dolares y devuelve la divisa
transformada. También tiene un método llamado: establecerTipo(double t) que nos
permitirá modificar posteriormente el tipo de cambio por si cambia con el tiempo
     */
    public Conversor(double tipoNuevo) {
        tipo = 0.88;
        if (tipoNuevo > 0) {
            tipo = tipoNuevo;
        }

    }
    
/*
    Crear un constructor para la clase Conversor que no reciba parámetros y
especifice un tipo de cambio por defecto de 0.85 Crear dos objetos e instanciarlos 
    */
    public Conversor(){
         this.tipo = 0.85;
       
    }
    double euro;
    double dolar;
    static double tipo;

    public double geteuroAdolar(double euro) {
        double div = euro / tipo;
        return div;

    }

    public double getdolarAeuro(double dolar) {
        double mult = dolar * tipo;
        return mult;
    }
        /*
     Práctica 24: crear el método: String toString() para las clases que hemos creado en las
actividades de este tema
     */
    public String toString (){
        String mensaje="la diferencia entre euro y dolar son" +tipo;
        return mensaje;
    }
    
    public static void main(String[] args) {
        Conversor cd = new Conversor();
       
        System.out.println(cd.getdolarAeuro(45));
        System.out.println(cd.geteuroAdolar(34));
        System.out.println(tipo);
              
    }
}
