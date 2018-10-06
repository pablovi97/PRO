Algoritmo Ejercicio14_2
	
	//Haz un algoritmo que calcule el máximo común divisor (mcd) de dos enteros positivos. El
	//mcd es el número más grande que divide exactamente a ambos números.
	
	definir dividendo , divisor , cociente , resto Como Entero;
	
	Escribir "Vamos a calcular el MCD:";
	Escribir "Introduce el primer número:";
	Leer dividendo;
	Escribir "Introduce el segundo número:";
	Leer divisor;
	
	Repetir
		cociente = trunc(dividendo / divisor);
		resto = dividendo mod divisor;
			dividendo = divisor;
			divisor = resto;
	Hasta Que resto = 0 

	Escribir "El MCD es: " , dividendo;
FinAlgoritmo