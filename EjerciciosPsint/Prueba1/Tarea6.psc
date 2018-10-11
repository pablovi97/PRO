Algoritmo Tarea6
	azaroso = azar(101)
	Escribir "Acertar el número oculto:"
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir "Intento numero ",i+1," Introduzca un numero"
		leer num
		si num = azaroso Entonces
			escribir "has acertado"
		SiNo
			si num > azaroso Entonces
				resta = num - azaroso
				escribir "Lo siento has perdido , te has quedado a ",resta," numero por arriba"
			sino 
				si azaroso > num  Entonces
					resta = azaroso - num
					escribir "lo siento has perdido te has quedado a ",resta," numeros por debajo"
				FinSi
			FinSi
		FinSi
	Fin Para
FinAlgoritmo
