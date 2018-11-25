/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Pablo Viera Martin .
 */
public class FIBONACCI {
    public static void main(String[] args) {
        fibonacciVent(30,210);
    }
    public static void  fibonacciVent(int limInf , int limSup){
        boolean parar = false;
       int an = 1;
       int anMenos1=1;
       do{
           int anMas1 = anMenos1 +an;
          
           if(an >= limInf && an <= limSup){
               System.out.print(an+" ");
           }else if(an > limSup){
               parar = true;
           }
            anMenos1 = an;
            an = anMas1;
       }while(!parar);
        System.out.println(" ");
    }
 
    
}
