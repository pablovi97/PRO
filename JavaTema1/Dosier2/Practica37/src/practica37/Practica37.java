/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica37;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Crear un programa que le pregunte al usuario la cantidad de billetes que tiene
de 500, luego le pregunte por la cantidad de billetes que tiene de 200, después pregunte por
los de 100, 50, 20, 10, 5. Finalmente se le dirá al usuario la cantidad de dinero acumulado
que tiene en billetes.
        */
        System.out.println("Cuantos billetes tiene de 500?");
        int billete500 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 200?");
        int billete200 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 100?");
        int billete100 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 50?");
        int billete50 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 20?");
        int billete20 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 10?");
        int billete10 = sc.nextInt();
        System.out.println("Cuantos billetes tiene de 5?");
        int billete5 = sc.nextInt();
        
        int result500 = billete500 * 500;
        int result200 = billete200 * 200;
        int result100 = billete100 * 100;
        int result50 = billete50 * 50;
        int result20 = billete20 * 20;
        int result10 = billete10 * 10;
        int result5 = billete5 * 5;
        System.out.println(result500+result200+result100+result50+result20+result10+result5);
        
        
        
    }
    
}
