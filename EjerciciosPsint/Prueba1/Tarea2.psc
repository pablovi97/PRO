
//1.75 Hacer un código que el usuario introduzca un dato por teclado y que el programa diga: es
//una vocal\u201d en el caso que se haya introducido una vocal. Que diga \u201cno es una vocal\u201d si ha
//introducido un carácter que no sea vocal.

//Pablo_Viera_Martin
Algoritmo Tarea2
	
	definir letra , vocal1, vocal2, vocal3, vocal4 , vocal5, vocal6 ,vocal7,vocal8,vocal9, vocal10 Como Caracter
	escribir "un caracter "
	leer letra
	vocal1 = "a"
	vocal2 = "A"
	vocal3 = "e"
	vocal4 = "E"
	vocal5 = "i"
	vocal6 = "I"
	vocal7 = "o"
	vocal8 = "O"
	vocal9 = "u"
	vocal10 = "U"
	
	
	si (letra = vocal1) o (letra =vocal2) o (letra = vocal3) o (letra = vocal4) o (letra = vocal5) o (letra = vocal6)  o (letra = vocal7)  o (letra = vocal8)o (letra = vocal9) o (letra = vocal10)    Entonces
		escribir "es una vocal"
	SiNo
		escribir "no es una vocal"
	FinSi

FinAlgoritmo