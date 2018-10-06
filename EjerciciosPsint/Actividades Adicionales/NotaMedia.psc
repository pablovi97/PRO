Algoritmo NotaMedia
	
	
	definir i , suma como entero;
	suma <- 0
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "dame nota",i;
		leer nota
		suma <- suma + nota
	Fin Para
	media <- suma/i
	escribir "la media es :" , media;
FinAlgoritmo
