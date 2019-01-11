/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Crear un programa que muestre al azar una carta de la baraja española. Por ej.
“sota de copas” Para ello se usarán dos array En el primero se registra:
1,2,3,4,5,6,7,sota,caballo,rey
En el segundo
oros,copas,bastos,espadas
Mediante dos aleatorios se toma un dato del primer array y un dato del segundo array para
componer el nombre de la carta a mostrar
        */
        
        String array1[] = new String[10];
        array1[0]="1";
        array1[1]="2";
        array1[2]="3";
        array1[3]="4";
        array1[4]="5";
        array1[5]="6";
        array1[6]="7";
        array1[7]="sota";
        array1[8]="caballo";
        array1[9]="rey";
         
        String array2[] = new String[4];
        array2[0] ="oros";
        array2[1] ="copas";
        array2[2] ="bastos";
        array2[3] ="espadas";
        
         Random rnd = new Random();
         int dato1 = rnd.nextInt(9) ;
         int dato2 = rnd.nextInt(3) ;
         
         String rand1 = array1[dato1];
         String rand2 = array2[dato2]; 
        
         System.out.println("la carta es el "+rand1+" de "+rand2);
    }
    
}
