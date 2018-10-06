Algoritmo Practica9
	//Crear un algoritmo que le solicite al usuario un número y muestre la tabla de
	//multiplicar para ese número. Hacerlo para los tres tipos de bucles que hemos visto
	definir multi como entero
	definir i como entero
	escribir "con que bucle quiere usted la tabla? 1:mientras , 2:para , 3:repetir"
	leer tipobuc
	escribir "dame un numero para el bucle: "
	leer multi
	i = 1;
	Si tipobuc = 1 Entonces
		
		Escribir "Tabla del " multi;
			Escribir "BUCLE MIENTRAS"
		Mientras i < 11 Hacer
			Escribir multi," x ",i," = ",multi*i;
			i = i + 1;
		FinMientras
	SiNo
		si tipobuc = 2 Entonces
			escribir "BUCLE PARA"
			Para i<-1 Hasta 10 Con Paso 1 Hacer
				escribir multi," x ",i," = ",multi*i;
				
			Fin Para
		SiNo
			si tipobuc = 3 Entonces
				Escribir "BUCLE REPETIR"
			
				Repetir
					Escribir multi," x ",i," = ",multi*i;
					i <- i + 1;
				Hasta que i > 10;
		FinSi
		
		FinSi
	Fin Si
	
	
	
	
	

FinAlgoritmo
