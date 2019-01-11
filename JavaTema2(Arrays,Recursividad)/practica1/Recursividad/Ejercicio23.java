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
public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        Invertir las cifras de un número mediante recursión: 123347 → 743321
        */
        //System.out.println(reverso(1234));
        System.out.println(sum1(1234));
    }
    public static String reverso(int num){
        String resultado = "";
        String numString = ""+num;
        if (numString.length() >0){
            char c = numString.charAt(0);
            //String restante = numString.substring(1,numString.length());
            //int restanteInt = Integer.parseInt(restante);
            //resultado = reverso(restanteInt)+c;
            resultado += numString.substring(numString.length()-1,numString.length());
            resultado +=reverso(num/10);
        }else{
            resultado = "";
        }
     return resultado;
       
    }
    /*
    sumar cifras 123 = 1+2+3 =6
    */
       public static int sum1(int n){
       int res= 0;
       if(n ==1){
           return n;
       }else{
       int x = sum1(n/10);
          
       int y = n%10;
        System.out.println("x = "+ x);
           System.out.println("y = "+y);
       res = x+y;
          
           
        }
       return res;
   }
}
