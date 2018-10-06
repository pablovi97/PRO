Algoritmo Practica13
	//Diseña un algoritmo que, dados cinco números enteros, determine cuál de los
	//cuatro últimos números es más cercano al primero. (Por ejemplo, si el usuario introduce los
    //números 2, 6, 4, 1 y 10, el programa responderá que el número más cercano al 2 es el 1.)
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
