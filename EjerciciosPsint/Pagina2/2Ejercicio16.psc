Algoritmo Ejercicio16_2
	//Haz un algoritmo que vaya leyendo n�meros y mostr�ndolos por pantalla hasta que el usuario introduzca un n�mero 
	//negativo. En ese momento, el algoritmo mostrar� un mensaje de despedida y finalizar� su ejecuci�n.
	
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
