/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnolambda;

/**
 *
 * @author carlos
 */
public class Main {
    public static void main(String[] args) {

        Persona personas[] = new Persona[2];


        personas[0] = new Hombre("Paco", "Atta", 91, 170, 71);
        personas[1] = new Mujer("Paca", "Atto", 91, 170, 71);       
        for (Persona persona : personas) {
            System.out.println(persona);
            if( persona instanceof Hombre){
                System.out.println("hombre barba: "+((Hombre)persona).tieneBarba);
            }
            
        }
    }
    

    
    
}
