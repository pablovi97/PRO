Algoritmo Ejercicio7_2
	//Dise�a un algoritmo que solicite la lectura, 
	//letra a letra, de un texto que no contenga letras may�sculas. 
	//Si el usuario teclea una letra may�scula, el algoritmo solicitar� nuevamente la 
	//introducci�n del texto cuantas veces sea preciso.	
	
	

	Repetir
		Escribir "escribe un texto en minusculas"
		leer text
		
	Hasta Que text != Mayusculas(text)
	Escribir text
FinAlgoritmo
