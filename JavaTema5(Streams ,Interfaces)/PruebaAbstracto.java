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
public class PruebaAbstracto {

    public static void main(String[] args) {
        Pajaro p = new Pajaro();
        Animal.mensaje();
       
    }
}

abstract class Animal {

    protected String nombre;
    protected int edad;
    protected int peso;
    public static  void mensaje(){
        System.out.println("holaaa");
}

    public Animal() {
        System.out.println("jajaja! soy un animal!!!!");
    }
    public String toString(){
        return nombre + " "+ edad +" "+ peso;
    }
        public abstract String emitirSonido();//sirve para obligar a las clases hijas a que implementen estas clases 
 
}

class Perro extends Animal {

    int dientes;

    @Override
    public String emitirSonido() {
        return "guau guau";
    }
}

class Pajaro extends Animal {

    double ala;

    @Override
    public String emitirSonido() {
        return "pio pio";
    }
}
