//Pablo_Viera_Martin
Algoritmo Tarea4
	//Hacer un c�digo que vaya leyendo n�meros hasta que el usuario introduzca un n�mero
	//negativo. En ese momento, el programa mostrar� por pantalla el n�mero par mayor de todos.
	definir num Como Entero
	definir hayMaximo Como Logico
	
	hayMaximo <- falso;
	
	Repetir
		Escribir "dame un numero"
		leer num
		si hayMaximo =falso Entonces
			
			
			si num % 2 = 0 Entonces
				hayMaximo = Verdadero
				Maximo <- num
			SiNo //Ya hay un maximo
				si num % 2 = 0 y num > maximo Entonces
					maximo <- num
				FinSi
				
	
			
			
			
				
			FinSi
				
		FinSi
       

	Hasta Que num < 0
	si hayMaximo = Verdadero Entonces
		escribir "el numero par mayor es ", maximo
	SiNo
		 escribir "ningun numero que cumpl los requisitos"
	FinSi
	
FinAlgoritmo