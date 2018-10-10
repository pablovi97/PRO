
//Pablo_Viera_Martin
Algoritmo Tarea3
	// Hacer un código en el que el usuario introduzca dos números enteros y el programa
	//mostrará y sumará todos los múltiplos de cinco que haya entre esos dos números
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
				suma = num2 + suma
				
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
