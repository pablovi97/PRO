Algoritmo Ejercicio7
	//Dise�a un algoritmo que, dado un n�mero entero, determine si �ste es el doble de un n�mero impar. (Ejemplo: 
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
