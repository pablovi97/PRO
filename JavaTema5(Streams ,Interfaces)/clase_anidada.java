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
   class Padre {

        int datoPadre;

        class Anidada {

            int datoHijo;

            public Anidada() {
                datoHijo=7;

            }
        }
        
        public Anidada crarAnidada(){
            return new Anidada();
        }
    }
public class clase_anidada {

 

    public static void main(String[] args) {
        Padre objetoPadre = new Padre(); 
        Padre.Anidada objetoHijo = objetoPadre.new Anidada();
        System.out.println(objetoHijo.datoHijo);
        Padre.Anidada objetoHijo2 =objetoPadre.crarAnidada();  
    }
}
