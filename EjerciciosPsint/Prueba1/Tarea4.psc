

//Pablo_Viera_Martin
Algoritmo Tarea4
	//Hacer un código que vaya leyendo números hasta que el usuario introduzca un número
	//negativo. En ese momento, el programa mostrará por pantalla el número par mayor de todos.
	definir num Como Entero
	
	Repetir
		Escribir "dame un numero"
		leer num
		si num % 2 = 0 Entonces
			
			
			
			si num > temp Entonces
				numayor = num
			SiNo
				temp = numayor
			
			FinSi
			num =temp	
		FinSi
		
	Hasta Que num < 0
		escribir "el numero par mayor es ", numayor
FinAlgoritmo
