

SubAlgoritmo mostrarArray(array,size)
	Definir k como entero
	Escribir sin saltar "["
	Para k<-0 Hasta size -1 Con Paso 1 Hacer
	
		Escribir  Sin Saltar array[k] ,","
		
	Fin Para
	Escribir "]"
FinSubAlgoritmo

Algoritmo Practica17
	//Mostrar usando un array los dos números mayores de 10 números
	//introducidos por teclado
	//Modificar el anterior para que sirva con cualquier cantidad de números
	//mayores que se quiera tener guardados.

	
	definir array,max ,posMax  Como Entero;
	definir size Como Entero
	size <- 10;
	
	Dimension array[10]

	array[0]=2;
	array[1]=3;
	array[2]=0;
	array[3]=5;
	array[4]=7;
	array[5]=1;
	array[6]=9;
	array[7]=4;
	array[8]=11;
	array[9]=6;

	Para i<-0 Hasta size -2 Con Paso 1 Hacer
		max = array[i]
		posMax = i
		Para j<-i Hasta size -1 Con Paso 1 Hacer
		si  max < array[j] Entonces
			max = array[j]
			posMax = j
		FinSi
	Fin Para
	
	temp = array[i]
	array[i] = array[posMax]
	array[posMax] = temp
	mostrarArray(array,size)
	
	
	
FinPara
mostrarArray(array,size)

FinAlgoritmo
