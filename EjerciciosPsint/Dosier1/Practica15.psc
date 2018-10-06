Algoritmo Practica15
	
	//Calcular usando un array, el valor mínimo, máximo y valor medio de 7
	//números introducidos por el usuario. El programa le irá pidiendo todos los números y
	//cuando se hayan introducido mostrará el menor de los números, el mayor y el valor medio
	//Definir minimo , maximo , medio ,acumulador Como Real
	Dimension almacen[7];
	escribir "programa para nota minima maxima y meda"
	minimo = 11
	maximo = -1
	medio = 0
	acumulador = 0
	Para i<-0 Hasta 6 Con Paso 1 Hacer
		escribir "dame el numero ",i+1
		leer almacen[i]
		
		si almacen[i] > maximo Entonces
			maximo = almacen[i]
		FinSi
		si almacen[i] < minimo Entonces
			minimo = almacen[i]
		FinSi
	
		acumulador = almacen[i] + acumulador
	Fin Para
	medio = acumulador/7
	escribir "el maximo es: ",maximo
	escribir "el minimo es: ",minimo
	escribir "el medio es: ",medio
	
	
FinAlgoritmo
