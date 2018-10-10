
//Pablo_viera_martin



Algoritmo Tarea1
	
	Definir nombre , apellido Como Caracter
	definir edad, result Como Entero
	Escribir "escribe el nombre"
	leer nombre
	Escribir "escribe el apellido"
	leer apellido
	Escribir "escribe la edad"
	leer edad
	
	si (edad >= 18) y (edad < 21) Entonces
		escribir nombre, apellido," con tu edad actual ya puedesvotar pero aún no puedes ir a bar en USA"
	SiNo
		si edad  < 18 Entonces
			result =  18 - edad
			Escribir "Hola", nombre , apellido " Te faltan ",result," años para poder votar"
		SiNo
			result = edad -21
			escribir "Hola" nombre , apellido ," Puedes ir a bar USA desde hace ", result ," años"
			
		FinSi
		
	FinSi
	
Finalgoritmo
