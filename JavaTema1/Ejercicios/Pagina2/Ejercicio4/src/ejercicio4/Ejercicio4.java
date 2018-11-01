/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Pablo viera Martín
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //Queremos hacer un algoritmo que calcule el factorial de un
	/número entero positivo. El factorial de n se denota con n!, pero no existe ningún operador que
	//permita efectuar este cálculo directamente. Sabiendo que n! = 1 · 2 · 3 · . . . · (n - 1) · n y que 0! = 1, haz un algoritmo que pida el valor de n 
	//y muestre por pantalla el resultado de calcular n!.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero para obtener su factorial");
        int num = sc.nextInt();
        int n = 1;
        if (num > 0) {
            for (int i = num; i == 1; i -= 1) {

                n *= i;

            }
            System.out.println(n);

        }else if(num == 0) {
            System.out.println(1);
        }

    }

}
