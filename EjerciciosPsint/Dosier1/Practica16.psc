Algoritmo Practica16
	//Mostrar usando un array los dos números mayores de 10 números
	//introducidos por teclado
	Definir array ,n,contador,numMayor, segundoMayor Como Entero
	n =10
	Dimension array[n]
	numMayor = 0
	segundoMayor = 0
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		escribir "introduzca",i+1
		leer array[i]
	Fin Para
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		si i=0 Entonces
			numMayor = array[i]
		SiNo
			si array[i] > numMayor Entonces
				segundoMayor= numMayor
				numMayor= array[i]
			SiNo
				si array[i] > segundoMayor Entonces
					segundoMayor = array[i]
				FinSi
			FinSi
		FinSi
	Fin Para
	escribir "el num mayor es " ,numMayor
	Escribir "el segundo num mayor es " ,segundoMayor
FinAlgoritmo

