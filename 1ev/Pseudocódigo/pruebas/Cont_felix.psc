Algoritmo accesoClave
	Para i <- 3 hasta 1 Hacer
		Escribir "Introduzca la clave"
		Leer clave
		Si clave = "mariamoliner" Entonces
			Escribir "Acceso correcto"
			i <- 1 //Finaliza el "Para"
		SiNo
			Escribir "Clave err�nea, intentos restantes: " i - 1
			Si i = 1 Entonces
				Escribir "N�mero m�ximo de intentos alcanzado"
			FinSi
		FinSi
	FinPara
FinAlgoritmo