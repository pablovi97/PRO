Algoritmo Practica13
	//Dise�a un algoritmo que, dados cinco n�meros enteros, determine cu�l de los
	//cuatro �ltimos n�meros es m�s cercano al primero. (Por ejemplo, si el usuario introduce los
    //n�meros 2, 6, 4, 1 y 10, el programa responder� que el n�mero m�s cercano al 2 es el 1.)
	Definir i,primero, proximo,siguiente como entero
	proximo = 100000;
	Escribir " introduce el numero principal"
	leer primero
	
	Para i<-1 Hasta 4 Con Paso 1 Hacer
		Escribir "intro numero",i+1;
		leer siguiente
		si abs(proximo - primero) > abs(siguiente - primero) Entonces
			proximo = siguiente
		FinSi
	Fin Para
	
	
FinAlgoritmo
