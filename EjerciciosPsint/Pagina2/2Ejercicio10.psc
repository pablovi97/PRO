Algoritmo Ejercicio10_2
	//Escribe un programa que muestre los n�meros pares que hay entre dos n�meros que
	//introduzca el usuario por teclado.�
	Escribir "Dame el primer numero"
	leer n
	Escribir "dame el segundo numero"
	leer m
	
	si n < m entonces
		
	
	Para i<-n Hasta m Con Paso 1 Hacer
		si i MOD 2 = 0 Entonces
			Escribir i
		FinSi
	Fin Para
	
SiNo
	
	Para i<-m Hasta n Con Paso 1 Hacer
		si i MOD 2 = 0 Entonces
			Escribir i
		FinSi
	Fin Para
	
	
FinSi
FinAlgoritmo
