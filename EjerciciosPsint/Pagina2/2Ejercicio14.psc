Algoritmo Ejercicio14_2
	
	//Haz un algoritmo que calcule el m�ximo com�n divisor (mcd) de dos enteros positivos. El
	//mcd es el n�mero m�s grande que divide exactamente a ambos n�meros.
	
	definir dividendo , divisor , cociente , resto Como Entero;
	
	Escribir "Vamos a calcular el MCD:";
	Escribir "Introduce el primer n�mero:";
	Leer dividendo;
	Escribir "Introduce el segundo n�mero:";
	Leer divisor;
	
	Repetir
		cociente = trunc(dividendo / divisor);
		resto = dividendo mod divisor;
			dividendo = divisor;
			divisor = resto;
	Hasta Que resto = 0 

	Escribir "El MCD es: " , dividendo;
FinAlgoritmo