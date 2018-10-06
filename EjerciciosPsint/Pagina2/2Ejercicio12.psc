Algoritmo Ejercicio12Pag2
	//Haz un algoritmo que pida el valor de dos enteros n y m y 
	//que muestre por pantalla el valor del sumatorio desde i=n hasta m de i2.

	escribir "escribir el valor n"
	leer n
	escribir "escribir valor m"
	leer m
	acumulador = 0
	Para i<-n Hasta m Con Paso 1 Hacer
		//El ejercicio 11 es lo mismo pero en vez de
		//acumulador = i * i + acumulador es 
		//acumulador = i  + acumulador
		acumulador = i * i + acumulador
		Escribir acumulador
	Fin Para
	
	
FinAlgoritmo
