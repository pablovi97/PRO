/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseña un algoritmo que, dado un número entero, determine si éste es el doble de un número impar. (Ejemplo: 
	14 es el doble de 7, que es impar.)
        */
        /*
        Escribir "introduce un numero"
	leer candidato;
	candidatoEntreDos = candidato /2;
	num <- candidatoEntreDos
	resto <- num % 2;
	
	Si resto = 0 Entonces
		escribir"Viene de un par";
	SiNo
		escribir "Viene de un impar";
	Fin Si
        */
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Imtroduce un numero");
            int candidato = sc.nextInt();
        
        double CandidatoEntreDos = candidato/2;
        
        double resto = CandidatoEntreDos % 2;
        
        if (resto == 0 ){
            System.out.println( candidato + "viene de un numero par que es" + CandidatoEntreDos);
        }
        else {
            System.out.println( candidato + "viene de un numero impar que es" + CandidatoEntreDos);
        }
        

        
        
            
        
       
 
       
        
                
    
    

