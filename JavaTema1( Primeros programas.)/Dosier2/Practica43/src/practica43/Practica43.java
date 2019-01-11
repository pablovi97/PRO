/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica43;

import static java.lang.Double.max;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Practica43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Escribir un programa donde se genera un número secreto mayor o igual a 1 y
menor o igual a 99 El jugador intentará acertar el número si se equivoca el programa le
informa de si el número secreto es mayor o menor que el que él ha introducido. El
programa finaliza cuando el jugador acierte en cuyo caso se le mostrará elnúmero de
intentos que ha necesitado para acertar.
Nota: se puede utilizar Random para el número aleatorio:
Random rnd = new Random();
rnd.nextInt(30); //genera un aleatorio desde 0 hasta 29

        */
        Random rand = new Random();
int randomNum = rand.nextInt((99 - 1) + 1) + 1;



       
        int i = 0;
        int num ;
        do{
            System.out.println("Introduce un numero del 1 al 99 SUERTE!!!");
         num = sc.nextInt();
         i++;   
        }while(num != randomNum);    
        System.out.println("Has acertado !!!!!");
        System.out.println("Has necesitado "+i+" intentos");
    }
    
}
