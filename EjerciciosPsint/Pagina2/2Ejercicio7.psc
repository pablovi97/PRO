Algoritmo Ejercicio7_2
	//Diseña un algoritmo que solicite la lectura, 
	//letra a letra, de un texto que no contenga letras mayúsculas. 
	//Si el usuario teclea una letra mayúscula, el algoritmo solicitará nuevamente la 
	//introducción del texto cuantas veces sea preciso.	
	
	

	Repetir
		Escribir "escribe un texto en minusculas"
		leer text
		
	Hasta Que text != Mayusculas(text)
	Escribir text
FinAlgoritmo
