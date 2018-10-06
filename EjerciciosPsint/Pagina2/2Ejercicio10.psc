Algoritmo Ejercicio10_2
	//Escribe un programa que muestre los números pares que hay entre dos números que
	//introduzca el usuario por teclado.ç
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
