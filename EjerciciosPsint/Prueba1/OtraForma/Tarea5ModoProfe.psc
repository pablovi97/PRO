Funcion resultado <- generarAleatorio ( num1,num2 )
	resultado <- aleatorio(100*num1,100*num2)/100
Fin Funcion



Algoritmo Tarea5ModoProfe
	
	escribir"dame rango inferior"
	leer inf
	escribir"dame rango superior"
	leer sup
	Escribir "dame cantidad de numeros"
	leer cantidad
	
	Para i<-0 Hasta cantidad -1 Con Paso 1 Hacer
		escribir generarAleatorio( inf,sup)
	Fin Para
FinAlgoritmo
