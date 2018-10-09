Algoritmo sin_titulo
	//Convertir un array al valor par mas proximo igual o superior
	
	Dimension  array[5]
	array[0] = 3
	array[1] = 5
	array[2] = 7
	array[3] = 8
	array[4] = 9
	Para i<-0 Hasta 4 Con Paso 1 Hacer
			si array[i] % 2 != 0 Entonces
				Repetir
					array[i] = array[i]+1
				Hasta Que array[i] % 2 = 0
				Escribir array[i]
			FinSi
	Fin Para
	
FinAlgoritmo
