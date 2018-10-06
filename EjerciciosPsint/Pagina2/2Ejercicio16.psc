Algoritmo Ejercicio16_2
	//Haz un algoritmo que vaya leyendo números y mostrándolos por pantalla hasta que el usuario introduzca un número 
	//negativo. En ese momento, el algoritmo mostrará un mensaje de despedida y finalizará su ejecución.
	
	escribir "dame un numero"
	leer n
	Mientras n > 0 Hacer
		escribir "dame otro numero"
		leer n
		Escribir n
		si n < 0 Entonces
			Escribir "el numero es negativo se acabo el programa"
		FinSi
	Fin Mientras
	
FinAlgoritmo
