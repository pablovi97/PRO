Algoritmo Practica13
	Escribir "dame el primer numero";
	leer primero
	
	Escribir "dame el segundo numero";
	leer numero2
	
	distancia1 = abs(primero -numero2)
	menordistancia = distancia1
	numeroResultante = numero2
	
	Escribir "dame el tercer numero";
	leer numero3
	distancia2 = abs(primero - numero3)
	si distancia2 = abs( primero - numero3) Entonces
		menordistancia = distancia2
		numeroResultante= numero3
	FinSi
	
	Escribir "dame el cuarto numero";
	leer numero4
	
	distancia3 = abs(primero - numero4)
	si menordistancia > distancia3 Entonces
		menordistancia = distancia3
		numeroResultante = numero4
	FinSi
	
	Escribir "dame el quinto numero";
	leer numero5
	
	distancia4 = abs(primero - numero5)
	si menordistancia > distancia4 Entonces
		menordistancia = distancia4
		numeroResultante = numero5
	FinSi
	
	Escribir "el numero mas proximo es el ",numeroResultante;
	
FinAlgoritmo
