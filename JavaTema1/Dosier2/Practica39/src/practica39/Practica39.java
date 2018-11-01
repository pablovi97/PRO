/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica39;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Hacer un programa que recibe un número entero mayor o igual a 10 y menor
o igual a 99 ( si el usuario introduce un número no válido se le pedirá que repita hasta que
lo haga bien ) , y se le muestre el número con las cifras invertidas. Por ej. si 34 se mostraría
en pantalla 43
        */
       
  
        Scanner sc = new Scanner(System.in).useLocale(Locale.CHINA);
        System.out.println("Dame un numero");
        String  numeroIntroducido = sc.nextLine();
        for (int i =numeroIntroducido.length()-1;i >= 0;i--){
            System.out.print(numeroIntroducido.charAt(i));
        }
    }
    
}
