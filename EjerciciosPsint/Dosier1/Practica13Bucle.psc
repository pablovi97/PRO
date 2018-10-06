Algoritmo Practica13Bucle
	Escribir "dame el primer numero";
	leer primero
	
	Escribir "dame el segundo numero";
	leer numero2
	
	distancia1 = abs(primero -numero2)
	menordistancia = distancia1
	numeroResultante = numero2
	i = 1
	Repetir
		escribir "dame el numero" i+2;
		leer numeroCandidato
		distanciaCnadidata = abs( primero - numeroCandidato)
		
		si menordistancia >= distanciaCandidata Entonces
			menordistancia = distanciaCnadidata
			numeroResultante = numeroCandidato
		FinSi
		i = i+1
	Hasta Que i >= 4
	escribir "el numero mas proximo es el : "  , numeroResultante;
FinAlgoritmo
