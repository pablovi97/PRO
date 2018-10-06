Algoritmo Ejercicio4
	//Queremos hacer un algoritmo que calcule el factorial de un
	//	número entero positivo. El factorial de n se denota con n!, pero no existe ningún operador que
	//	permita efectuar este cálculo directamente. Sabiendo que n! = 1 · 2 · 3 · . . . · (n - 1) · n y que 0! = 1, haz un algoritmo que pida el valor de n 
	//		y muestre por pantalla el resultado de calcular n!.

	definir num Como Entero
	escribir "escribir un numero para obtener su factorial"
	leer num
	n = 1
	si num > 0 Entonces
		
		Para i<-num Hasta 1 Con Paso -1 Hacer
			n <-n * i
			
		Fin Para
		Escribir n;
	SiNo
		si num = 0 entonces
			Escribir 1;
		FinSi
	FinSi	
FinAlgoritmo
