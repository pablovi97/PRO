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
public class Animal {
    /*
    EJEMPLO SUPER
    */
    private String atributoPropioAnimal="BUENOS DIAS!!!"; 
    
    public Animal(String nombre){
        System.out.println("soy "+nombre+" soy un animal !!!!");
    }
    public Animal(){
        System.out.println("acaban de ejecutar un constructor vacio");
    }
    
    
}
class Felino extends Animal{
    double sizeGarraas ;
    double sizeBigotes;

    public Felino() {
        super("felino");// la llamada a super debe ser la primera sentencia en cualquier metodo o el constructors    
    }
   
    @Override
    public String toString(){
        return super.toString() + "tamaño bigotes : "+ sizeBigotes;
    }

    public static void main(String[] args) {
 
        new Felino();
    }
}
