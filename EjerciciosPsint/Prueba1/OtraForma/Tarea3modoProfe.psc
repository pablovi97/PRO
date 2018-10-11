Algoritmo sin_titulo
	// Hacer un código en el que el usuario introduzca dos números enteros y el programa
	//mostrará y sumará todos los múltiplos de cinco que haya entre esos dos números
	definir num1 , num2 , result , temp Como Entero
	escribir "dame un numero"
	leer num1
	escribir "dame otro numero"
	leer num2
	
	
	si num1 > num2 Entonces
		temp <- num1
		num1 <- num2
		num2 <- temp
		
	FinSi
	
	
	suma = 0
	Para i<-trunc(num1/5)*5 Hasta trunc(num1/5)*5 Con Paso 5 Hacer
		si i % 5 = 0 Entonces
			escribir i;
			suma = suma +i
		FinSi
	Fin Para
	escribir suma
FinAlgoritmo
