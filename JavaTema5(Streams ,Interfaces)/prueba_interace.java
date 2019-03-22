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
public class prueba_interace {

    public static void main(String[] args) {
        Chlorotica c = new Chlorotica();
        c.decirHola();
        
        Chlorotica.decirAdios();//NO SE PUEDE SOBREESCRIBIR PORQUE ES STATIC
        Planta.decirAdios();
    }
}

interface Bicho {

    default void decirHola() {
        System.out.println("Hola bicho!!!!!");
    }
}

interface Planta {

    default void decirHola() {
        System.out.println("Hola planta!!!!!");
    }
    static void decirAdios(){
        System.out.println("nunca digas adios hasta luego");
    }
}

class Chlorotica implements Bicho, Planta {

   
    public void decirHola() {
        System.out.println("ni bicho ni planta sobreescritura"); 
        
        // super Bicho.decirHola();
    }
   static void decirAdios(){
       System.out.println("jajajaja");
   }
    
}
