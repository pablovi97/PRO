/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica44;

import java.util.Scanner;

/**
 *
 * @author Pablo Viera Martin .
 */
public class Practica44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        Programa generador de potencias. El usuario introduce un número entero de 1
a 20. Se le mostrará en pantalla las 5 primeras potencias de ese número.
Ej. número introducido 2
        */
        System.out.println("escribe numero de 1 al 20");
        int base = sc.nextInt();
        
        double potenciaGenerada = base;
        
        if(base >=1 && base <= 20){
        for(int potencia=1;potencia<6;potencia++){
            System.out.print(base+"^"+potencia+" =");
            potenciaGenerada = Math.pow(base ,potencia);
            System.out.println(potenciaGenerada);
        }
       
        }
    }
    
}
