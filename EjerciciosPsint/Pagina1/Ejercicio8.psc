Algoritmo Ejercicio8
	//Dise�a un algoritmo que, dados dos n�meros enteros, 
//muestre por pantalla uno de estos mensajes: "El segundo es el cuadrado exacto del primero.", "El segundo es menor que el cuadrado del primero." o "El segundo es mayor que el cuadrado del primero.", dependiendo de la verificaci�n de la condici�n 
	//correspondiente al significado de cada mensaje.
	Definir  numero1, numero2 Como Entero;
	Escribir "dame el primer numero: "
	leer numero1
	Escribir "dame el segundo numero: "
	leer numero2
	
	Si numero2 = numero1^2 Entonces
		escribir "El segundo es el cuadrado exacto del primero."
	SiNo
		si numero2 < numero1^2 Entonces
			Escribir "El segundo es menor que el cuadrado del primero."
		SiNo
			
				Escribir "El segundo es mayor que el cuadrado del primero."
		FinSi
	Fin Si
	

FinAlgoritmo
