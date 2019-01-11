/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class NumeroCapicua2 {

    public static int girarNumero(int num) {
        int resultado = 0, cociente = 0, resto = 0;
        cociente = num;
        do {
            resto = cociente % 10;
            
            cociente = cociente / 10;
           
            resultado = resultado*10+resto;
        } while (cociente > 0);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num = sc.nextInt();

        int reverso = girarNumero(num);
        System.out.println(reverso);
        int cantidad = numeros(num);
        System.out.println("el numero tiene " +cantidad+" digitos");
        
        if(reverso == num){
            System.out.println("es capicua");
            
        }else{
            System.out.println("no es capicua ");
        }

    }
    public static int numeros(int num){
       /*
    crear un metodo para devolver la cantidad de cifras de un numero entero 
    */ int resultado = 0, cociente = 0, resto = 0,i =0;
        cociente = num;
      do {
            resto = cociente % 10;
            
            cociente = cociente / 10;
           
            i++;
        } while (cociente > 0);
      return i;
    }
    
}
