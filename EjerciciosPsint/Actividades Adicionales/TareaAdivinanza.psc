SubProceso  felicitar()
	Escribir "**********"
	Escribir "*BRAVO *"
	Escribir "*******"
	
FinSubProceso



Algoritmo TareaAdivinanza
	//se le solicita al usuario  que introduzca dos numeros
	// se generaran dos numeros atleatorios ara comprobar si coinciden con los numeros introducidos 
	//por el usuario . En el caso que acerte un numero y solo uno entomces que aparezca en pantalla
	// ********
	//**Bravo**
	//******
	
	azar1 = azar(10)
	azar2 = azar(10)
	
	escribir "Dime el primer numero para adivinarlo"
	leer num1
	escribir "Dime el segundo numero para adivinarlo"
	leer num2
	
	si (num1 = azar1 o num2 = azar1 ) y (num1 = azar2 o num2 = azar2)  Entonces
		
		
		felicitar();
		felicitar();
	SiNo
		si num1 = azar1 o num2 = azar1  o num1 = azar2 o num2 = azar2 Entonces
		
			felicitar();
		SiNo
			
			Escribir "No has acertado ninguno"
	FinSi
	FinSi
	
	
FinAlgoritmo
