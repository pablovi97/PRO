Algoritmo Ejercicio10
	//Dise�a un algoritmo que lea un car�cter cualquiera desde el teclado, y muestre el mensaje "Es una MAYUSCULA" cuando el car�cter sea una letra
	//	may�scula y el mensaje "Es una MINUSCULA" cuando sea una min�scula. En cualquier otro caso, no mostrar� mensaje alguno. 
	//(Considera �nicamente letras del alfabeto ingl�s.) Pista: aunque parezca una obviedad, recuerda que una letra es min�scula si 
	//		est� entre la �a� y la �z�, y may�scula si est� entre la �A� y la �Z�
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
