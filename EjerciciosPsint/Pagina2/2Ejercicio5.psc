Funcion resultado <- factorial ( num )
	n = 1
	si num > 0 Entonces
		
		Para i<-num Hasta 1 Con Paso -1 Hacer
			n <-n * i
			
		Fin Para
		resultado = n //para que la "n" sea igual a el factorial()"
	SiNo
		si num = 0 entonces
			resultado = 1
		FinSi
	FinSi	
	
	
Fin Funcion
//El número de combinaciones que podemos formar tomando m elementos de un conjunto con n elementos es: C(m,n) = n! / (n \u2212 m)!m! . 
//Diseña un algoritmo que pida el valor de n y m y calcule Cm n .
//(Ten en cuenta que n ha de ser mayor o igual que m.) (Puedes comprobar la validez 
//de tu programa introduciendo los valores n = 15 y m = 10: el resultado es 3003.)






Algoritmo Ejercicio5pag2
	Definir n , m , combinacion Como Entero
	Escribir "dime el primer numero "
	leer n
	escribir " dime el segundo numero"
	leer m
	
	Combinacion = (factorial(n)) /(factorial(n-m)*factorial(m));
	escribir Combinacion
	
	
FinAlgoritmo
