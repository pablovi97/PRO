

	Funcion resultado <- mcd ( dividendo ,divisor )
		resto = 1
		definir resultado Como Entero
		
		mientras resto != 0 Hacer
			
			cociente = trunc(dividendo / divisor);
			resto = dividendo mod divisor;
			dividendo = divisor;
			divisor = resto;
		FinMientras
		resultado = dividendo
	Fin Funcion
	
	
	
	//Haz un algoritmo que calcule el máximo común divisor (mcd) 
	//de tres enteros positivos. El mcd de tres números es el número 
	//más grande que divide exactamente a los tres.	
	
	
	
	Algoritmo MaximoComunDivisorTresNumeros
		
		
		
		definir mcm ,num1,num2,num3 Como Entero;
		
		Escribir "Vamos a calcular el MCD:";
		Escribir "de cuantos numeros es el mcd:";
		leer CantNum
		
		Escribir "dame el primer numero"
		leer resultadoMCDparcial
		
		i = 2
		si CantNum > 0 Entonces
			
			
			Repetir
				
				Escribir "escribir num",1
				leer numSiguiente
				
				resultadoMCDparcial = mcd(resultadoMCDparcial,numSiguiente)
		
				i = i +1
			
			Hasta Que i > CantNum
			Escribir "el resultado es:  " ,resultadoMCDparcial
		SiNo	
			Escribir "no se puede hacer el mcd"
		FinSi
	
		

		
		
FinAlgoritmo


