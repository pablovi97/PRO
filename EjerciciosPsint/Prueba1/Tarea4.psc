

//Pablo_Viera_Martin
Algoritmo Tarea4
	//Hacer un c�digo que vaya leyendo n�meros hasta que el usuario introduzca un n�mero
	//negativo. En ese momento, el programa mostrar� por pantalla el n�mero par mayor de todos.
	definir num Como Entero
	
	Repetir
		Escribir "dame un numero"
		leer num
		si num % 2 = 0 Entonces
			si num > siguiente Entonces
				num = siguiente
				num = nummayor
				
			FinSi
			
		FinSi
	Hasta Que num < 0
		escribir "el numero mayor es", nummayor
FinAlgoritmo
