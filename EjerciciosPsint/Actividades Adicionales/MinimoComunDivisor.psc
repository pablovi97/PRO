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




Algoritmo MinimoComunMultiplo
	
	
	definir mcm Como Entero;
	
	Escribir "Vamos a calcular el MCD:";
	Escribir "Introduce el primer número:";
	Leer dividendo;
	Escribir "Introduce el segundo número:";
	Leer divisor;
	
	num1 = dividendo
	num2 = divisor
	
	mcm = num1*num2/mcd(num1,num2)
	
	Escribir "El MCM es: " , mcm;	
	
	
FinAlgoritmo
