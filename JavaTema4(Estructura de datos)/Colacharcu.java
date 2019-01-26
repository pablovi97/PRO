/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosier5;

import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author Pablo Viera Martin <pablovieramartin21@gmail.com>
 */
public class Colacharcu {
    
    int numActual;
        LinkedList<Integer> colacharc = new LinkedList<Integer>(); 
    public Colacharcu(){
        this.numActual = 0;
     
      
    }
    
    public int darNum(int num){
         colacharc.add(++num);
         this.numActual = num;
       return num;
        
    }
    public int mostrarActual(){
        return numActual;
    }
    public void atender(){
        
        
       
        System.out.println("se ha atendido al "+colacharc.removeFirst());
        
           
        
    }
    
    public static void main(String[] args) {
        Colacharcu cc = new Colacharcu();
        cc.darNum(5);
        cc.darNum(4);
        cc.darNum(6);
        cc.atender();
        System.out.println(cc.mostrarActual());
    }
    
    
}
