Algoritmo Ejercocio13_2
	
	//Haz un algoritmo que pida el valor de dos enteros n y m y calcule el sumatorio 
	//de todos los números pares comprendidos entre ellos (incluyéndolos en el caso de que sean pares).
	definir n , m como entero
	Escribir "dame el primer numero"
	leer n
	escribir "dame el segundo numero"
	leer m
	
	
	si n < m entonces
		Para i<-n Hasta m Con Paso 1 Hacer
			si i MOD 2 = 0 Entonces
				suma = i + suma
				Escribir suma
			FinSi
		finpara
	SiNo
		si n > m entonces
			Para i<-m Hasta n Con Paso 1 Hacer
				si i MOD 2 = 0 Entonces
					suma = i + suma
					Escribir suma
				FinSi
		
			Fin Para
		FinSi
		
FinSi
	
FinAlgoritmo
