Algoritmo Calificacion
	Escribir "Introduce la puntuacion de un examen para saber tu calificaci�n"
	//Leer la nota
	Leer Nota
	//Si la nota est� entre los n�meros del Si, entonces...
	Si Nota<=100 y Nota>=90 Entonces
		Escribir "Sobresaliente"
	Finsi
	Si Nota<=89 y Nota>=70 Entonces
		Escribir "Notable"
	Finsi
	Si Nota<=69 y Nota>=60 Entonces
		Escribir "Bien"
	Finsi
	Si Nota<=59 y Nota>=50 Entonces
		Escribir "Suficiente"
	Finsi
	Si Nota<50 Entonces
		Escribir "Suspenso"
	Finsi
FinAlgoritmo