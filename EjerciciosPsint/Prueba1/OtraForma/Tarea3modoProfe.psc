Algoritmo sin_titulo
	// Hacer un c�digo en el que el usuario introduzca dos n�meros enteros y el programa
	//mostrar� y sumar� todos los m�ltiplos de cinco que haya entre esos dos n�meros
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
