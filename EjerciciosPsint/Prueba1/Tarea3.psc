
//Pablo_Viera_Martin
Algoritmo Tarea3
	// Hacer un c�digo en el que el usuario introduzca dos n�meros enteros y el programa
	//mostrar� y sumar� todos los m�ltiplos de cinco que haya entre esos dos n�meros
	definir num1 , num2 , result , temp Como Entero
	escribir "dame un numero"
	leer num1
	escribir "dame otro numero"
	leer num2
	
	si num1 > num2 Entonces
		Repetir
			num2 = num2 + 1
			si num2 % 5 = 0 Entonces
				
				escribir num2
				suma = num1 + suma
				
			FinSi
		
		Hasta Que result > num1
		
	SiNo
		si num1 < num2 Entonces
			temp = 0
			Repetir
				num1 = num1 + 1
				si num1 % 5 = 0 Entonces
					
					
					Escribir num1
				
					suma = num1 + suma
				FinSi
				
			Hasta Que num1 > num2
		FinSi
		
	FinSi
	Escribir  "la suma de todos los multiplos es: ", suma
FinAlgoritmo
