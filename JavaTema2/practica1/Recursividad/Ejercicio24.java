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
public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println(sum1(1234,0));
    }
     /*
    EJERCICIO24
    sumar cifras 123 = 1+2+3 =6
    */
       public static int sum1(int n, int contador){
       int res= 0;
       if(n ==1){
           return n;
       }else{
       int x = sum1(n/10,contador+1);
          
       int y = n%10;
           System.out.println("Iteración " + contador);
        System.out.println("x = "+ x);
           System.out.println("y = "+y);
           System.out.println("-----");
       res = x+y;
          
           
        }
       return res;
   }
}
