Algoritmo EcuaciónSegundoGrado
	Definir  a, b, c Como Real;
	Definir  x1, x2 Como Real;
	Definir rcinterna Como Real;
	
	Escribir "dime el valor de la A: "
	leer A
	escribir "dime el valor de la B: "
	leer B
	Escribir  "dime el valor de la C:"
	leer C
	//Vamos a hacer la ecuacion de segundo grado
	//ax^2 +  bx +c = 0
	
	rcinterna = b^2-(4*a*c);
	Si rcinterna < 0 Entonces
		escribir "No se puede hacer porque la raiz es negativa "
	SiNo
		x1 = (-B + rc(rcinterna)) /2*a;
		escribir "el valor de x1 =" ,x1
		
		x2 = (-B - rc(rcinterna)) /2*a;
		escribir "el valor de x2 =" ,x2
		
	Fin Si
	
	
FinAlgoritmo
