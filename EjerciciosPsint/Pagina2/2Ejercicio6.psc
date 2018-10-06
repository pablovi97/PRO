Algoritmo Ejercicio6_2
	//Diseña un algoritmo que solicite la lectura de un número entre 0 y 10 (ambos inclusive). Si el usuario teclea un número fuera del rango válido, el programa solicitará nuevamente la introducción
	//del valor cuantas veces sea necesario.
	Repetir
		Escribir "escribe un  numero entre el 0 y el 10"
		leer num
	Hasta Que (num >= 0) y (num <= 10)
	Escribir num
FinAlgoritmo
