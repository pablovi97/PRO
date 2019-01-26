/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

/**
 *
 * @author Pablo Viera Martin .
 */
class Prueba{
    Prueba(int dato){
        this.dato = dato;
    }
    int dato;
    @Override
   public String toString(){
        return ""+dato;
    }
}
public class NewClass {

    public static void main(String[] args) {
        
        
        Prueba array[];
        array = new Prueba[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=new Prueba(i);
            
        }
        for (Prueba prueba : array){
            prueba.dato = 5;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
        
    }
}
