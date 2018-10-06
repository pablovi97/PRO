//Crear un algoritmo que nos pida
// 5 numeros y los guarde en un array
//POSTERIORMENTE  deberan mostrar
//el contenido del array
//finalmente cambiaran las posiciones
// y que quede al reves 
//Ejemplo :Si un usuario ha introducido:
//[3,7,2,9,1]
//quedara
//[1,9,2,7,3]

//por ultimo se mostrara en la pantalla
//el nuevo array


Algoritmo EjemploArray2
	n = 5
	Dimension  almacen[n]
	
	Para i<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir "dame el numero",i+1
		leer almacen[i]
	Fin Para
	
	Para j<-0 Hasta n-1 Con Paso 1 Hacer
		Escribir sin saltar ,almacen[j] ","
	Fin Para
	Escribir ""
	Escribir "cambiar posicion"
	Para i<-4 Hasta 0 Con Paso -1 Hacer
		
		Escribir sin saltar ,almacen[i] ","
	Fin Para
	
FinAlgoritmo
