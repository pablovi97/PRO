Algoritmo Ejercicio7
	//Diseña un algoritmo que, dado un número entero, determine si éste es el doble de un número impar. (Ejemplo: 
	//14 es el doble de 7, que es impar.)
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
	
	
FinAlgoritmo
