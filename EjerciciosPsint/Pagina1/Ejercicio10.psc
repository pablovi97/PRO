Algoritmo Ejercicio10
	//Diseña un algoritmo que lea un carácter cualquiera desde el teclado, y muestre el mensaje "Es una MAYUSCULA" cuando el carácter sea una letra
	//	mayúscula y el mensaje "Es una MINUSCULA" cuando sea una minúscula. En cualquier otro caso, no mostrará mensaje alguno. 
	//(Considera únicamente letras del alfabeto inglés.) Pista: aunque parezca una obviedad, recuerda que una letra es minúscula si 
	//		está entre la ’a’ y la ’z’, y mayúscula si está entre la ’A’ y la ’Z’
	Definir letra como texto
	escribir "introduce una letra (M/m)"
	leer letra
	
	si (letra >= "a") y (letra <= "z") Entonces
		escribir " es minuscula"
	SiNo
		si (letra >= "A") y (letra <= "Z") Entonces
			escribir " ES MAYUSCULA"
		SiNo
			escribir "introduce una letra inglesa"
		FinSi

	FinSi
	
	
FinAlgoritmo
